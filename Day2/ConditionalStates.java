package day2;

import java.util.Scanner;

public class ConditionalStates {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age : ");
        int age = sc.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else{
            System.out.println("Not Adult");
        }

    }
}
