package day14;
import java.util.*;
public class callGuests {
    public static int inviteGuest(int n){
        if(n<=1){
            return 1;
        }
        //single
        int ways1 = inviteGuest(n-1);
        //pair
        int ways2 =(n-1) * inviteGuest(n-2);

        return ways1 + ways2;
    }
    public static void main(String args[]) {
        int n = 4;
        System.out.println(inviteGuest(n));
    }
}
