package com.scp.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import com.scp.consumer.Student;

public class ForeachMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++)
			list.add(i);

		// traversing throw traditinal way
		Iterator<Integer> itr = list.iterator();
		while (itr.hasNext())
			System.out.println(itr.next());
		// traversing throw using for each method
		list.forEach(new Consumer<Integer>() {

			public void accept(Integer t) {
				// TODO Auto-generated method stub
				System.out.println(" " + t);
			}

		});
		List<Emp> l=new ArrayList<Emp>();
		Emp e=new Emp();
		e.setId(10);
		e.setName("Hanu");
		
		Emp em=new Emp();
		em.setId(11);
		em.setName("Swati");
		
		Emp emp=new Emp();
		emp.setId(12);
		emp.setName("Dhanu");
		
		l.add(e);
		l.add(em);
		l.add(emp);
		Consumer<? super Emp> consumerForEmp=s->System.out.println("name : "+s);
		l.forEach(consumerForEmp);
		/*l.forEach(new Consumer<Emp>() {

			public void accept(Emp e) {
				// TODO Auto-generated method stub
				System.out.println(e);
			}
		});*/
	}

}

class Emp {
	private int id;
	private String name;

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + "]";
	}

}
