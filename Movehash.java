//Input: Move#Hash#to#Front

// output: ###MoveHashtoFront

import java.util.*;

public class Movehash{

    public static String MoveHashtoFront(String word){

        StringBuilder result = new StringBuilder();

        for(int i = 0; i < word.length() ; i++){

            if(word.charAt(i) == '#'){

                result.append(word.charAt(i));
            }
        }

        for(int i = 0; i < word.length() ; i++){

            if(word.charAt(i) != '#'){

                result.append(word.charAt(i));
            }
        }
        return result.toString();
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string:");

        String word = sc.nextLine();

        System.out.println(MoveHashtoFront(word));

        sc.close();
    }
}