import java.util.HashSet;

public class Hashsets{

    public static void main(String[] args) {
        
HashSet<String> cities = new HashSet<>();

cities.add("Hyderabad");
cities.add("Chennai");
cities.add("Nizambad");
cities.add("Mumbai");

System.out.println(cities.size());
System.out.println(cities.contains("Mumbai"));
cities.remove("chennai");
System.out.println(cities);
    }
}


