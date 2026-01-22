package day6;
import java.util.*;
public class Multiply2Num {

    public static int printMultiply(int a, int b){
        int multi = a*b;
        return multi;
    }


    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a :  ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        int multi = printMultiply(a,b);
        System.out.print("Multiplication is : "+multi);
    }
}
