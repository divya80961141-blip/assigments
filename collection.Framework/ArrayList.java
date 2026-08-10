package collection.framework;

import java.util.ArrayList;

public class ArrayList {
    
public static void main(String[] args){

    ArrayList<String> Subjects = new ArrayList<String>();
    Subjects.add(0,"Telugu");
    Subjects.add(1,"English");
    Subjects.add(2,"Hindi");
    Subjects.add(3,"Maths");
    Subjects.add(4,"Science");


    System.out.println("Subjects are:" + Subjects);
    System.out.println(Subjects.get(0));
    System.out.println(Subjects.get(1));
    System.out.println(Subjects.get(2));
    System.out.println(Subjects.get(3));
    System.out.println(Subject.get(4));
    System.out.println(Subject);
    System.out.println(Subjects.contains("Maths"));
    System.out.println(Subjects.isEmpty());
  collections.sort(Subjects);
  System.out.println(subjects)l
  Subjects.clear();
  System.out.println(Subjects);

}
}

