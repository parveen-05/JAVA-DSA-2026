package day27;
import java.util.*;

public class Hashing_in_Java_HashMap {
    public static void main(String[] args) {
        //country(key) population(value)
        HashMap<String, Integer> map = new HashMap<>();

        //Insertion
        map.put("India", 120);
        map.put("US", 30);
        map.put("China", 150);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);

        //Search
        if(map.containsKey("China")){
            System.out.println("Key is present in the map");
        }else{
            System.out.println("Key is not present in the map");
        }

        System.out.println(map.get("China"));//exsist
        System.out.println(map.get("Indonesia"));//doesn't exsist
        
    }
}
