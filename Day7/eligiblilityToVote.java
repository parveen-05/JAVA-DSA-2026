package day7;
import java.util.*;

public class eligiblilityToVote {
    public static void printEligibility(int age){
        if(age>=18){
            System.out.print("Yes you are eligible to vote");
        }
        else{
            System.out.println("No you are not eligible to vote ");
        }
        return;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = sc.nextInt();
        printEligibility(age);
    }
}
