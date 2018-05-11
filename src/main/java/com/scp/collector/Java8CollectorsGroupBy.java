package com.scp.collector;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8CollectorsGroupBy {
 public static void main(String[] args) {
 
  List items = Arrays.asList(new Country("India", 20000),
    new Country("China", 40000), new Country("Nepal", 30000),
    new Country("India", 50000), new Country("China", 10000));
  
  // Group by countryName
  @SuppressWarnings("unchecked")
Map<String, List> groupByCountry = (Map<String, List>) items.stream().collect(
    Collectors.groupingBy(Country::getCountryName));
  
  System.out.println(groupByCountry.get("India"));
  
  // Group by CountryName and calculates the count
  @SuppressWarnings("unchecked")
Map<String, Long> counting = (Map<String, Long>) items.stream().collect(
    Collectors.groupingBy(Country::getCountryName,Collectors.counting()));
  
  // Group by countryName and sum up the population
  System.out.println(counting);
  @SuppressWarnings("unchecked")
Map<String, Long> populationCount = (Map<String, Long>) items.stream().collect(
    Collectors.groupingBy(Country::getCountryName,
      Collectors.summingLong(Country::getPopulation)));
  System.out.println(populationCount);
 }
}