package day1;

import java.util.*;
public class Qs2 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number between (1,2,3) : ");

        int num = sc.nextInt();

        if(num == 1){
            System.out.println("Hello");
        }
        else if(num == 2){
            System.out.println("Namaste");
        }
        else if(num == 3){
            System.out.println("Bonjour");
        }
        else{
            System.out.println("Invalid number");
        }
    }
}
