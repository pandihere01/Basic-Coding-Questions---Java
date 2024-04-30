public class FactorialNumber{
    public static int tofindFactorial(int number){

        int result = 1;

        for(int i = 1 ; i <= number ; i++){

            result = result * i;
        }
        return result;
    }
    public static void main(String[] args){

        int n = 5;

        System.out.println(tofindFactorial(n));
    }
}