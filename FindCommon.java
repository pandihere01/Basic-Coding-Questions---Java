//Input: [1, 2, 3, 4, 5], [4, 5, 6, 7, 8]
//Output: [4, 5]

import java.util.*;

public class FindCommon{
    public static List<Integer> tofind(List<Integer> input1 , List<Integer> input2){

        List<Integer> result = new ArrayList<>();

        for(int i = 0;  i < input1.size() ; i++){

            for(int j = 0 ; j < input2.size() ; j++){

                if(input1.get(i) == input2.get(j)){

                    result.add(input1.get(i));
                    break;
                }
            }
        }
        return result;
    }
    public static void main(String[] args){

        List<Integer> input1 = new ArrayList<>(Arrays.asList(1,2,9,4,5));
        List<Integer> input2 = new ArrayList<>(Arrays.asList(4,9,6,5,8));

        System.out.println(tofind(input1 , input2)); 
    }
}