package day27;
import java.util.HashSet;
import java.util.Iterator;
public class Hashing {
    public static void main(String[] args) {
        //Creating
        HashSet<Integer> set = new HashSet<>();
        //ArrayList<Integer> list = new ArrayList<>();
        //Insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);

        //Search - contains

        if(set.contains(1)){
            System.out.println("Set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("Set doesn't contains 6");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("We deleted 1");
        }

        //Size
        System.out.println("size of set is : "+set.size());
        //print all elements
        System.out.println(set);

        //Iterator
        Iterator it = set.iterator();
        //HasNext; next;
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
