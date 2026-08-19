import java.util.TreeSet;

public class Treeset {
    
public static void main(String[] args) { 

TreeSet<Integer> Marks = new TreeSet<>(); 
Marks.add(450); 

Marks.add(120); 

Marks.add(780); 

Marks.add(300); 
System.out.println(Marks); // [120, 300, 450, 780] — sorted! 
System.out.println(Marks.first()); // 120 
System.out.println(Marks.last());  // 780
System.out.println(Marks.headSet(400)); // [120, 300] 
System.out.println(Marks.tailSet(400)); // [450, 780] 
System.out.println(Marks.subSet(200, 500)); // [300, 450] 

}
}
