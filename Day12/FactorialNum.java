package day12;
import java.util.*;
public class FactorialNum {
    public static int printFact(int n) {
        if(n==0 | n==1){
            return 1;
        }
        int fact = printFact(n-1);
        int fact_n = n * fact;
        return fact_n;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int ans = printFact(n);
        System.out.println(ans);

    }
}
