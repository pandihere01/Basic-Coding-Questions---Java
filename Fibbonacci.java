import java.util.*;

public class Fibbonacci{
    public static List<Integer> tofindFib(int number){

        List<Integer> result = new ArrayList<Integer>();

        for(int i = 0 ; i <= number ; i++){

            if(i % 2 != 0){

                result.add(i);
            }
        }
        return result;
    }
    public static void main(String[] args){

        int n = 7;

        System.out.println(tofindFib(n));
    }
}