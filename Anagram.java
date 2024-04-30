import java.util.*;

public class Anagram{
    public static boolean isAnagram(String input1 , String input2){

        char[] chr1 = input1.toCharArray();
        char[] chr2 = input2.toCharArray();

        Arrays.sort(chr1);
        Arrays.sort(chr2);

        if(new String(chr1).equals(new String(chr2))){
            return true;
        }
        return false;
    }
    public static void main(String[] args){

        String input1 = "king";
        String input2 = "inkg";

        System.out.println(isAnagram(input1 , input2));
    }
}