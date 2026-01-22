package day7;
import java.util.*;
public class GreaterOfTwo {
    public static void printGreater(int a, int b){
        if(a>b){
            System.out.print(a);
        }
        else{
            System.out.print(b);
        }
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();

        printGreater(a,b);

    }
}
