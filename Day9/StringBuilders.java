package day9;

public class StringBuilders {
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder("Parveen");
        System.out.println(sb);
        //charAt
        System.out.println(sb.charAt(1));
        //set char at index
        sb.setCharAt(0,'R');
        System.out.println(sb);
        //insert
        sb.insert(2, 'h');
        System.out.println(sb);
        //delete the char r
        sb.delete(3,4);
        System.out.println(sb);
        sb.delete(3,4);
        System.out.println(sb);
        sb.setCharAt(5,'m');
        System.out.println(sb);
    }
}
