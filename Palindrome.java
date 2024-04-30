import java.util.*;

public class Palindrome{

    public static boolean isPalindrome(String word){

        String result = "";

        for(int i = word.length()-1 ; i >= 0; i--){

            result += word.charAt(i);
        }
        if(result.equals(word)){
            return true;
        }
        return false;
    }
    public static void main(String [] args){

        String word = "mom";

        System.out.println(isPalindrome(word));
    }
}