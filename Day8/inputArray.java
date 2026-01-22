package day8;
import java.util.*;
public class inputArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int size = sc.nextInt();
        int numbers[] = new int[size];

        for(int i=0;i<size;i++){
            System.out.print("input number : ");
            numbers[i] = sc.nextInt();
        }
        for(int i=0;i<size;i++){
            System.out.println(numbers[i]);
        }
    }
}
