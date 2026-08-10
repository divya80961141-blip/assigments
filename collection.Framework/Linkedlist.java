import java.util.LinkedList;

public class Linkedlist {
    
public static void main(String[] args){

    LinkedList<String> Movies = new LinkedList<String>();
    Movies.add(0, "RRR");
    Movies.add(1, "KGF");
    Movies.add(2, "Pushpa");
    MOvies.add(3, "Baahubali");

    System.out.println("Movie name:"  + Movies);
    System.out.println(Movies.get(0));
    System.out.println(Movies.get(1));
    System.out.println(Movies.get(2));
    System.out.println(Movies.get(3));
    System.out.println(Movies.peek());
    System.out.println(Movies.poll());

    

    collection.sort(Movies);
    System.out.prinltn(Movies);
    Movies.clear();
    System.out.println(Movies);
}
}


