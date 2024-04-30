//aabbbbeeeeffggg
//a2b4e4f2g3
import java.util.*;

public class WordIntmix{

    public static String WordIntmix(String word){

        HashMap<Character , Integer> map = new HashMap<>();

        StringBuilder result = new StringBuilder();

        for(char[] ch: word.toCharArray()){

            map.put(ch , map.getOrDefault(ch-'0') + 1);
        }

        result.append(map.getKey());
    }
}