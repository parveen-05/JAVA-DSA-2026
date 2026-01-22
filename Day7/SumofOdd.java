package day7;
import java.util.*;
public class SumofOdd {
    public static void printSumOfOdd(int n) {
        int sum =0;
        for(int i=1;i<=n;i=i+2){
            sum = sum + i;
        }
        System.out.print("Sum of the odd number : "+sum);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number n : ");
        int n = sc.nextInt();

        printSumOfOdd(n);

    }
}
