package day12;
import java.util.*;
public class Qsxpown {
    public static int printPow(int x,int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }

        int xPow1= printPow(x,n-1);
        int xPown= x*(xPow1);
        return xPown;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number x : ");
        int x = sc.nextInt();
        System.out.print("Enter number n : ");
        int n = sc.nextInt();

        int ans = printPow(x,n);
        System.out.println(ans);

    }
}
