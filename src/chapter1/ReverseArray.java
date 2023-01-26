package chapter1;

public class ReverseArray {

    public static void main(String[] args) {
        //  String[] n = new String[]

        String[] names = {"rama", "Awa", "madAm", "RaceCar", "nursesrun"};

        for (int i = names.length - 1; i > 0; i--) {
            String reverseArray = "";
            for (int j = names[i].length() - 1; j >= 0; j--) {
                reverseArray += names[i].charAt(j);
            }

            System.out.println(reverseArray + "\n");
        }
        System.out.println("=======================================================================");

        int[] numbers = {1, 2, 3, 4, 5};

       reverse(numbers);
        display(numbers);




    }

    public static void reverse(int[] arr) {

        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
    }

    public static void display(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
}