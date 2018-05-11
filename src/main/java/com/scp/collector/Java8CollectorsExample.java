package com.scp.collector;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8CollectorsExample {
 
	public static void main(String[] args) {
		List<Integer> intList=Arrays.asList(110,220,330,440,550);
		// Counting
		long  count = intList.stream().collect(Collectors.counting());
		System.out.println("Count Num of element::"+count);
		
		Double result1 = intList.stream().collect(Collectors.averagingInt(v->v));
		System.out.println("Average of Elemets::"+result1);
		
		Double result2 = intList.stream().collect(Collectors.averagingInt(v->v*v));
		System.out.println("Average by calculating Multiplication::"+result2);
		
		Integer result3 = intList.stream().collect(Collectors.summingInt(v->v));
		System.out.println("Sum of the elements::"+result3);
		
		Integer result4 = intList.stream().collect(Collectors.summingInt(v->v*v));
		System.out.println("Sum of the elements by multiplying:"+result4);
		
		int result5 = intList.stream().collect(Collectors.collectingAndThen(Collectors.summingInt(v->(int)v),result->result/2));
		System.out.println("Operation on result:"+result1);

		List<String> NameList=Arrays.asList("Arpit","John","Martin");
		// Counting
		String  stringWithHyphen = NameList.stream().collect(Collectors.joining("-"));
		System.out.println("String with hyphen : "+stringWithHyphen);
		String  stringWithHyphenAndPrefixAndSuffix = NameList.stream().collect(Collectors.joining("-","==","=="));
		System.out.println("String with hyphen , suffix and prefix :  "+stringWithHyphenAndPrefixAndSuffix);
	}
}