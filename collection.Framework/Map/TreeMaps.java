import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args){

TreeMap<String , Integer> vegetables = new TreeMap<>();

vegetables.put("potato",  20);
vegetables.put("onion",  30); 
vegetables.put("tomato", 40); 

System.out.println("vegetables prices");
System.out.println(vegetables);
System.out.println(vegetables.firstKey());  
System.out.println(vegetables.lastKey()); 
 vegetables.remove("potato");
 System.out.println("after removing potato");
System.out.println(vegetables);
    }
}


