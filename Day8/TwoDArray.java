package day8;
import java.util.*;
public class TwoDArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num of Rows : ");
        int r= sc.nextInt();
        System.out.print("Enter num of Col : ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j]= sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }

    }
}
