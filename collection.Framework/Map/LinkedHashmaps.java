

import java.util.LinkedHashSet;

public class LinkedHashmaps {
    
public static void main(String[] args) {
LinkedHashSet<String> Products = new LinkedHashSet<>(); 

Products.add("PHONE"); 
Products.add("HEADPHONE"); 
Products.add("LAPTOP"); 

System.out.println("Products detalis"); 
System.out.println(Products);
   Products.remove("HEADPHONE");
   System.out.println("after removing headphone");
   System.out.println(Products);
}
}

