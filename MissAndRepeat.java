import.java.util.*;   // nums = [2,1,1,3,4]

public class MissAndRepeat{

    public static int[] TofindResult(int[] nums){

        int miss = 0;
        int repeat = 0;

        Arrays.sort(nums);

        int[] list = new int[nums.length];

        for(int i = 1; i <= nums.length ; i++){

            list[i] = i;
        }

        for(int i = 1; i <= nums.length ; i++){
            
            if(nums[i] == list[i]){

                continue;
            }
            else{
                repeat = nums[i];

                miss = list[i];
            }
        }
        return repeat;
        return miss;
    }

    public static void main(String[] args){

        int[] nums = 
    }
}