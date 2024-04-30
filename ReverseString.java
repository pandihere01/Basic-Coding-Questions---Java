import java.util.*;

public class ReverseString{
    public static String ReverseString(String words){

        String result = "";

        for(int i = words.length()-1 ; i >= 0 ; i--){

            result+= words.charAt(i);
        }
        return result;
    }
    public static void main(String[] args){
        String word = "hello";
        System.out.println(ReverseString(word));
    }
}