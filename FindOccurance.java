import java.util.*;

public class FindOccurance{
    public static int tofindthechar(String input , char character){

        int index = 0;

        for(int i = 0 ; i < input.length() ; i++){

            if(input.charAt(i) == character){

                return i;
            }
        }
        return index;
    }
    public static void main(String[] args){

        String input = "hello";
        char character = 'l';

        System.out.println(tofindthechar(input , character));
    }
}