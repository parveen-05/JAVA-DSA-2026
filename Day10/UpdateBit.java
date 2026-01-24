package day10;
import java.util.*;

public class UpdateBit {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the operation : ");
        //oper =1 then set;
        //oper = 0 then clear;

        int oper = sc.nextInt();
        int n = 5;//0101
        int pos = 1;

        int bitMask = 1<<pos;
        if(oper==1){
            int newNum = bitMask | n;
            System.out.println(newNum);
        }
        else{
            int notBitMask = ~(bitMask);
            int newNum = notBitMask & n;
            System.out.println(newNum);
        }
    }
}
