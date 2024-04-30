// input : a1b2c3 string
// output : abbccc string

import java.util.*;

public class IntToString{

    public static String Inttoresult(String word){

        StringBuilder result = new StringBuilder();

        int count = 0;


        for(int i = 0 ;  i < word.length() ; i++){

            char curr = word.charAt(i);

            if(Character.isLetter(curr)){

                if(count == 0){

                    result.append(curr);
                }
                else{

                    for(int j = 0; j < count ; j++){

                        result.append(curr);
                    }

                    count = 0;
                }
            }
            else if(Character.isDigit(curr)){

                count =  count * 10 + (curr-'0');
            }
        }
        return result.toString();
    }

    public static void main(String[] args){

        String word = "a1b2c33";

        System.out.println(Inttoresult(word));
    }
}