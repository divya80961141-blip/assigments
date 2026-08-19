import java.util.LinkedList;
import java.util.Queue;

public class Queue1{
    public static void main(String[] args) {
        
    Queue<String> NamesQueue = new LinkedList<>();

NamesQueue.offer("Alice"); 
NamesQueue.offer("Bob"); 

NamesQueue.offer("Charlie"); 

System.out.println(NamesQueue); // [Alice, Bob, Charlie] 

 

System.out.println(NamesQueue.peek());  // Alice (no removal) 

System.out.println(NamesQueue.poll());  // Alice (removed) 

System.out.println(NamesQueue);         // [Bob, Charlie] 
}
}
