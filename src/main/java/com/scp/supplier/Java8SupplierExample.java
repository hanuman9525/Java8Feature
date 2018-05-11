package com.scp.supplier;

import java.util.function.Supplier;

public class Java8SupplierExample {
 
 public static void main(String[] args) {
  
  Supplier supplier=()->"Arpit";
  System.out.println(supplier.get());
 }
}