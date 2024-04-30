//input = 1010
//output = 10

import java.util.*;

public class BinaryToDecimal{

    public static int tofind(String binary){

        if(binary.length() == 0){
            return 0;
        }

        int res = 0;
        
        int power = 0;

        for(int i = binary.length()-1 ; i >= 0 ; i--){

            if(binary.charAt(i) == '1'){

                res += Math.pow(2 , power);
            }
            power++;
        }
        return res;
    }
    public static void main(String[] args){

        String word = "1011";
        System.out.println(tofind(word));
    }
}