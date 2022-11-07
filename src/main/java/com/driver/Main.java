package com.driver;

public class Main {
  public static void main(String args[])
  {
      RWOnly obj=new RWOnly();
     // String ans=obj.name("Hello");
      //name' has private access in 'com.driver.RWOnly'
      obj.setName("Nancy");
      String ans=obj.getName();
      System.out.print(ans);
  }
}