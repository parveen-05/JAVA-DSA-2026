package day9;
import java.util.*;
public class Append {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("p");
        sb.append('a');// str = str +'a';
        sb.append('r');// str = str +'r';
        sb.append('v');
        sb.append('e');
        sb.append('e');
        sb.append('n');
        System.out.println(sb);
        System.out.println(sb.length());
    }
}
