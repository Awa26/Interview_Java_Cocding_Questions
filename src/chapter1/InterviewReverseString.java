package chapter1;

public class InterviewReverseString {

    public static void main(String[] args) {
/*


Write a function that can reverse a string===> I am String
I CREATED A METHOD, which has string parameter, using a for loop
 to reverse each CHARACTERS one by one and add it to reverse variable.
 and return the variable.
 */
        System.out.println("reverseString(\"anam\") = " + reverseString("anam"));


        System.out.println("reverseString(\"I am String\") = " + reverseString("I am String"));
        System.out.println("================================================================");
        String arr="I am String";
        System.out.println(StrReverse(arr));
    }

    public static String reverseString(String str) {
        String output = "";

        for(int i = str.length()-1; i >= 0 ; i-- ){

            output += str.charAt(i);

        }

        return output;

    }

    public static String StrReverse(String str) {

        String reverse="";

        for(int i=str.length()-1; i >= 0; i--) {
            reverse += str.toCharArray()[i];
        }
        return reverse;

    }


}
