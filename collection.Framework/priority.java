import java.util.PriorityQueue; 

public class priority {
 
    public static void main(String[] args) {
        
    

// Min-heap: lowest number = highest priority 

PriorityQueue<Integer>  patients = new PriorityQueue<>(); 

patients.offer(5);  // Low urgency 

patients.offer(1);  // Critical 

patients.offer(3);  // Moderate 
System.out.println(patients.peek()); // 1 (most critical) 
while (patients.isEmpty()) { 

    System.out.println("Treating: " + patients.poll()); 

} 
    }
}