package day8;
import java.util.*;
public class indexOf2DArray {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num of Rows : ");
        int r = sc.nextInt();
        System.out.print("Enetr the num of Col : ");
        int c = sc.nextInt();

        int[][] num = new int[r][c];
        int found =0;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                num[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(num[i][j]+ " ");
            }
            System.out.println();
        }
        System.out.print("Enter the number x you want to search : ");
        int x = sc.nextInt();
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(num[i][j]==x){
                    System.out.print("Number found at index : "+i+","+j);
                    found =1;
                }
            }
        }
        if(found==0){
            System.out.println("Invalid number");
        }
    }
}
