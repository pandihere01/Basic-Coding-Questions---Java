import java.util.*;

public class Binarysearch{

    public static int binarysearch(int[] arr , int target){

        int left = 0;
        int right = arr.length -1;

        while(left <= right){

            int mid = (left + right) / 2;

            if(mid == target){

                return mid;
            }

            else if(mid < target){

                left = mid + 1;
            }
            else{

                right = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of Arr element");

        int n = sc.nextInt();

        int target = sc.nextInt();

        System.out.println("Enter the target value :");

        int[] arr = new int[n];

        for(int i = 0; i < n ; i++){

            arr[i] = sc.nextInt();
        }
        sc.close();
    }
}