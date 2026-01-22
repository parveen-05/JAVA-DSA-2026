package day6;
import java.util.*;
public class add2Num {

    public static int printSum(int sum){
        System.out.print(sum);
        return sum;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number a : ");
        int a = sc.nextInt();
        System.out.print("Enter the number b : ");
        int b = sc.nextInt();
        int sum = a+b;

        printSum(sum);
    }
}
