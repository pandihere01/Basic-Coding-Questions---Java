

import java.util.*;

public class BuyAndSell{

    public static int TotalProfit(int[] nums){

        if(nums == null || nums.length <= 1){
            return 0;
        }

        int minprice = nums[0];
        int maxprofit = 0;

        for(int i =1 ; i < nums.length ; i++){

            if(nums[i] < minprice){

                minprice = nums[i];
            }
            else{
                
                int currprofit = nums[i] - minprice;

                maxprofit =  Math.max(currprofit , maxprofit);
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){

        int[] nums = {1,5,2,3,7,6,4,5};

        System.out.println("result is : "+ TotalProfit(nums));
    }
}