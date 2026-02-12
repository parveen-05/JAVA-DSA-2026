package day14;

public class placeTiles {
    public static int placeTile(int n, int m){
        if(n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
        //vertically
        int vertPlace = placeTile(n-m,m);
        //Horizontally
        int horiPlace = placeTile(n-1, m);
        return vertPlace + horiPlace;
    }
    public static void main(String args[]){
        int n=4, m=2;
        System.out.println(placeTile(n, m));
    }
}
