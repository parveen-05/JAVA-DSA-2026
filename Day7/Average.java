package day7;
import java.util.*;
public class Average {
    public static void printAverage(int a, int b, int c){
        double avg = (a+b+c)/3.0;
        System.out.println("Average : "+avg);
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number a : ");
        int a = sc.nextInt();
        System.out.print("Enter number b : ");
        int b = sc.nextInt();
        System.out.print("Enter number c : ");
        int c = sc.nextInt();

        printAverage(a,b,c);
    }
}
