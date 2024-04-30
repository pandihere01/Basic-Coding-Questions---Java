//Input: 8
//Output: 1101
import java.util.*;

public class DecimalToBinary{
    public static String tofind(int n){

        StringBuilder result = new StringBuilder();

        if(n == 0){

            return "0";
        }

        while(n > 0){

            int remainder = n % 2;

            result.insert(0 , remainder);

            n = n / 2;
        }
        return result.toString();
    }
    public static void main(String[] args){

        int n = 8;

        System.out.println(tofind(n));
    }
}
