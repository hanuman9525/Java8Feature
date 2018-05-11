package com.scp.predicate;

import java.util.function.Predicate;

public class Java8PredicateExample {
 
 public static void main(String[] args)
 {
  Predicate<Integer>  predicate= i->i>100;
  boolean greaterCheck=predicate.test(100); 
  System.out.println(greaterCheck);
 }
}