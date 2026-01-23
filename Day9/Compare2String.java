package day9;
import java.util.*;
public class Compare2String {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String name1 = "Rahi";
        String name2 = "Raheem";

        if(name1.compareTo(name2)==0){
            System.out.println("Strings are equal ");
        }
        else{
            System.out.println("Strings are not equal");
        }
    }
}
