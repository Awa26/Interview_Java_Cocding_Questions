package chapter1;

import java.util.Arrays;

public class ReverseAString {
    public static void main(String[] args) {
        String str = "Racecar";
        String result = "";

        System.out.println("Original word: " + str);

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }
        System.out.println(result);

        System.out.println("=================================================================");


        String[] names1 = new String[5];
        String reversedArray = "";
        String[] names = {"rama", "Awa", "madAm", "RaceCar", "nurses run"};
        String[] reverse = new String[names.length];

        for (int  i = names.length-1, j =0; i>=0; i--,j++){//
           reverse[j] = names[i];
           // System.out.println(i);
        }
        System.out.println("Original word: " + Arrays.toString(names));

        System.out.println("Reverse word: "+ Arrays.toString(reverse));

        System.out.println("=====================================================================");

        String[] arr = {"rama", "Awa", "madAm", "RaceCar", "nursesrun"};
      //  String[] reverseArr = new String[arr.length];

        for (int i = arr.length-1; i>=0; i--){
           // String[] reverseArr = new String[arr.length];
            String reverseArr = "";

            for (int j = arr[i].length()-1; j>=0; j--){
                reverseArr += arr[i].charAt(j);

            }
            System.out.println(reverseArr+"\n");


        }
    }
}