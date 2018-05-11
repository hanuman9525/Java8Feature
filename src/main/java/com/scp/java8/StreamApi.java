/**
 * @author Hanuman
 */
package com.scp.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			List<Integer> list=new ArrayList<Integer>();
			for(int i=0;i<10;i++)
				list.add(i);
			
			Stream<Integer> sequencial=list.stream();
			
			Stream<Integer> parallel=list.parallelStream();
			Stream<Integer> parallelCondition=parallel.filter(p->p>5);
			parallelCondition.forEach(p->System.out.println("Parallel higher Number:"+p));
			
			Stream<Integer> sequenceCondition=sequencial.filter(p->p>4);
			sequenceCondition.forEach(p->System.out.println("Sequence Higher Number::"+p));
	}

}
