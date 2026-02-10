package day13;

public class subSeq {
    public static void subSequences(String str, int idx, String newString){
        if(idx==str.length()){
            System.out.println(newString);
            return;
        }
        char currChar = str.charAt(idx);
        //to be
        subSequences(str, idx+1, newString+currChar);
        //to not to be
        subSequences(str, idx+1, newString);
    }
    public static void main(String args[]){
        String str = "abc";
        subSequences(str,0,"");
    }
}
