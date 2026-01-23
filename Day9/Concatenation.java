package day9;
import java.util.*;
public class Concatenation {
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        String firstName = "Parveen";
        String LastName = "RT";
        String FullName = firstName + " " + LastName;
        System.out.println(FullName);
        System.out.println(FullName.length());
        //charAt
        for(int i=0;i<FullName.length();i++){
            System.out.println(FullName.charAt(i));
        }
    }
}
