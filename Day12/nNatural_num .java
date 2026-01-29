package day12;
import java.util.*;
public class nNatural_num {
    public static void printNum(int n, int m, int sum){
        if(n==m){
            sum+=n;
            System.out.println(sum);
            return;
        }
        sum=sum+n;
        printNum(n+1,m,sum);
        //memory stack
        //System.out.println(n);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number m : ");
        int m = sc.nextInt();
        int n=1;
        printNum(n,m,0);
    }
}
