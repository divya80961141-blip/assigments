

import java.util.HashMap; 
public class Hashmaps{

    public static void main(String[] args) {

   HashMap<String, String> Countries = new HashMap<>(); 

   Countries.put("india","30");
   Countries.put("japan","20");
   Countries.put("usa", "100");

  System.out.println(Countries);
  
System.out.println(Countries.get("india"));   // 555-5678 

System.out.println(Countries);
Countries.remove("japan");
System.out.println("After removing japan");
System.out.println(Countries);
    }
}



 
