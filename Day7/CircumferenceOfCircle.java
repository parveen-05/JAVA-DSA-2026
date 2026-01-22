package day7;
import java.util.*;


public class CircumferenceOfCircle {
     static double printCircumference(double r){

        return 2*3.14*r;

    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the radius of circle : ");
        int r = sc.nextInt();
        System.out.println("Circumference = " + printCircumference(r));

    }
}
