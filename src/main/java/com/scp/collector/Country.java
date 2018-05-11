package com.scp.collector;
/*
Author:Hanuman
*/
public class Country{
 
 String countryName; 
 long population;
 
 public Country() {
  super();
 }
 public Country(String countryName,long population) {
  super();
  this.countryName = countryName;
  this.population=population;
 }
 public String getCountryName() {
  return countryName;
 }
 public void setCountryName(String countryName) {
  this.countryName = countryName;
 }
 public long getPopulation() {
  return population;
 }
 public void setPopulation(long population) {
  this.population = population;
 }
@Override
public int hashCode() {
 final int prime = 31;
 int result = 1;
 result = prime * result
   + ((countryName == null) ? 0 : countryName.hashCode());
 result = prime * result + (int) (population ^ (population >>> 32));
 return result;
}
@Override
public boolean equals(Object obj) {
 if (this == obj)
  return true;
 if (obj == null)
  return false;
 if (getClass() != obj.getClass())
  return false;
 Country other = (Country) obj;
 if (countryName == null) {
  if (other.countryName != null)
   return false;
 } else if (!countryName.equals(other.countryName))
  return false;
 if (population != other.population)
  return false;
 return true;
} 
 
 public String toString()
 {
  return "{"+countryName+","+population+"}";
 }
} 
