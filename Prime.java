public class Prime{
    public static void main(String[] args){

        int n = 4;

        System.out.println(isPrime(n));

      
    }
    public static  boolean isPrime(int num){

        if(num % 2 == 0){

            return false;
        }
        return true;
    }
}