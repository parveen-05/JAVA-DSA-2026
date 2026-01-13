package day1;

import java.util.*;

public class Greater_Or_Lesser {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the variable a : ");
         int a = sc.nextInt();
        System.out.print("Enter the variable b : ");
        int b = sc.nextInt();

        if(a==b){
            System.out.println("Equal");
        }
        else{
            if(a>b){
                System.out.println("a is greater");
            }
            else{
                System.out.println("a is lesser");
            }
        }
    }
}
