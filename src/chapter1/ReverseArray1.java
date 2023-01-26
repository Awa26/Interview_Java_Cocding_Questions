package chapter1;

import java.util.Arrays;

public class ReverseArray1 {

    public static void main(String[] args) {

        int[] arr = { 1,2,3,4,5};
        System.out.println("Original Arrays before reverse: "+ Arrays.toString(arr));

        System.out.println("===================================================================");

      int[] reverseArray = reverse(arr);
        System.out.println("Arrays after reverse : "+ Arrays.toString(reverseArray));

    }
/*
    public static void reverse(int[] a, int n){

        int[] num = new int[n];

        int j = n;
        for (int i = 0; i < n; i ++){
            num[j-1] = a[i];
            j = j -1;
        }
    }

 */

    public static int[] reverse(int[] array){
        int[] newArray = new int[array.length];

        for (int i = 0; i < array.length; i++){
            newArray[array.length-1-i] = array[i];
        }
        return newArray;
    }
}
