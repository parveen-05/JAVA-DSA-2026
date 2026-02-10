package day13;
import java.util.*;
public class TowerOfHanoi {
    public static void towerHanoi(int n, String src, String help, String dest){
        if(n==1){
            System.out.println("transfer disk : "+n+" from "+src+" to "+dest);
            return;
        }
            towerHanoi(n-1,src, dest, help);
            System.out.println("transfer disk : "+n+" from "+src+" to "+dest);
            towerHanoi(n-1,help, dest, src);
    }
    public static void main(String args[]){
        int n=3;
        towerHanoi(n,"S","H", "D");
    }
}
