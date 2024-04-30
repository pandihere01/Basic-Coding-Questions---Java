// input is odd integer ex: 5

public class PatternPrint{

    public static int patternprint(int n){
        int i = 0;
        int j = 0;
        int mid = 0;

        mid = (n+1)/2;

        for(i = 1 ; i <= n ; i++){

            for(j = 1 ; j <= n ; j++){

                if(i == j){

                    if(i < mid){
                        System.out.print(n - i + 1);
                    }
                    else{
                        System.out.print(i);
                    }
                }
                else if(i + j == n+1){

                    if(i< mid){
                        System.out.print(i);
                    }
                    else{
                        System.out.print(j);
                    }
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        return -1;
    }

    public static void main(String[] args){

        int num = 9;

        System.out.print(patternprint(num));
    }
}