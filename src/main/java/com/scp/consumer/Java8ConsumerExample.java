package com.scp.consumer;

import java.util.function.Consumer;

public class Java8ConsumerExample {
 public static void main(String[] args) {
  
  Consumer consumerString=s->System.out.println(s);
  consumerString.accept("Arpit");
 }
}