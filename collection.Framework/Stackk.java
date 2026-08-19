import java.util.Stack;

public class Stackk {
    
public static void main(String[] args){

    Stack<String> fruit = new  Stack<>();
    //push
    fruit.push("Apples");
    fruit.push("Banana");
    fruit.push("Mango");
    fruit.push("orange");
    System.out.println("FRUIT:" +fruit );
    //peek
    System.out.println("peek:" + fruit);
    //search
    System.out.println("Search Mango:" + fruit.search("Mango"));
    //pop
    System.out.println("pop:" + fruit.pop());
    System.out.println("fruit after pop:" + fruit);
    //isEmpty
    System.out.println("is fruit Empty?" + fruit.isEmpty());
}
}