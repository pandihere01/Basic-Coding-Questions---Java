import java.util.*;

public class LargetElement{
    public static int theelement(int[] nums){

        int max = Integer.MIN_VALUE;

        for(int num : nums){

            max = Math.max(max , num);
        }
        return max;
    }
    public static void main(String[] args){

        int[] nums = {1,34,6,43,6,3};

        System.out.println(theelement(nums));
    }
}