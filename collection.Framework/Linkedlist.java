import java.util.LinkedList;

public class Linkedlist {
    
public static void main(String[] args){

    LinkedList<String> Movies = new LinkedList<>(); 
    Movies.add( "RRR");
    Movies.add( "KGF");
    Movies.add( "Dacolt");
    System.out.println(Movies);
    Movies.addFirst("NewEngine"); // Add to front 

    Movies.addLast("CabinCar");   // Add to back 

System.out.println(Movies.getFirst()); 

System.out.println(Movies.getLast()); 
    Movies.removeFirst();
    Movies.removeLast();
    System.out.println(Movies.peek());
    System.out.println(Movies.poll());

    

    
    
}
}


