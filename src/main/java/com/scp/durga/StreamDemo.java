
package com.scp.durga;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=new ArrayList<>();
		list.add(5);
		list.add(20);
		list.add(15);
		list.add(40);
		
		List<Integer> l=list.stream().filter(i->i%2!=0).collect(Collectors.toList());
		System.out.println(l);
		
	}

}
