package com.ddb.javacore.generic;
class HierDemo2 {  
  public static void main(String args[]) {  
    
    // Create a Gen object for String. 
    Gen4<String> w = new Gen4<String>("Hello", 47); 
    
    System.out.print(w.getob() + " "); 
    //System.out.println(w.getnum()); 
  }  
}
