 import java.util.ArrayDeque;   
 import java.util.Deque; 
public class playerdeque {
    public static void main(String[] args) {
        
    
 

Deque<String> Players = new ArrayDeque<>(); 

 

Players.addFirst("B"); 

Players.addFirst("A");   // Front: A 

Players.addLast("C");    // Back: C 

Players.addLast("D"); 

System.out.println(Players); // [A, B, C, D] 

 

System.out.println(Players.peekFirst()); // A 

System.out.println(Players.peekLast());  // D 

 

Players.removeFirst(); // removes A 
    }
}

