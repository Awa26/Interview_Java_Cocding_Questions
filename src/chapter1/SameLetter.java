package chapter1;

import java.util.Arrays;

public class SameLetter {

    public static void main(String[] args) {
       /* String -- Same letters
        Write a return method that check if a string is build out of the
        same letters as another string.
                Ex: same("abc", "cab"); -> true
        same("abc", "abb"); -> false:

        */
        System.out.println(sameLetters("abc", "cab"));// true
    }

    public static boolean sameLetters(String a, String b){

       char[]  ch1 = a.toLowerCase().toCharArray();
        char[]  ch2 = b.toLowerCase().toCharArray();

        Arrays.sort(ch1); // ascending order
        Arrays.sort(ch2); // ascending order


        return Arrays.equals(ch1,ch2);// returns true or false if the letters are or different
    }
}
