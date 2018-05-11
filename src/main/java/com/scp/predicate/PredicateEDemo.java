/**
 * @author Hanuman
 */
package com.scp.predicate;

import java.util.function.Predicate;

public class PredicateEDemo {

		 public static void main(String[] args)
		 { 
		  boolean greaterCheckBoolean=greaterCheck(50,p-> p > 100); 
		  System.out.println(greaterCheckBoolean);
		 }
		 
		 public static boolean greaterCheck(int number,Predicate<Integer> predicate)
		 {
		  return predicate.test(number);
		 }
		}