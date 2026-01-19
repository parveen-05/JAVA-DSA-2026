package day3;
import java.util.*;
public class Table {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the number of Table you want to print :  ");
        int n = sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
