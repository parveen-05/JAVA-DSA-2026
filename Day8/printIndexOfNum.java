package day8;
import java.util.*;
public class printIndexOfNum {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int num[] = new int[size];
        for(int i=0;i<size;i++){
             num[i] = sc.nextInt();
        }
        System.out.print("Enter the num x you want to search : ");
        int x = sc.nextInt();
        int found =0;

        for(int i = 0; i< size; i++){
            if(num[i]==x){
                System.out.println("x found at index : "+i);
                found =1;
            }
        }
        if(found==0){
            System.out.println("Invalid num");
        }
    }
}
