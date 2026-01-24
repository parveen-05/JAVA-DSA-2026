package day10;
import java.util.*;
public class SetBit {
    public static void main(String args[]){
        int n=5;
        int pos = 1;
        int bitMask = 1<<pos;
        int newNum = bitMask | n;
        System.out.println(newNum);
    }
}
