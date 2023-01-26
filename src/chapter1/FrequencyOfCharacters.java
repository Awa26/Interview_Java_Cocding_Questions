package chapter1;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        /*
        String -- Frequency of Characters
Write a return method that can find the frequency of
characters
Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
         */

        System.out.println(frequencyOfChars("AAABBCDD"));
    }

    public static String frequencyOfChars(String str){
        String result = "";// declare a variable to store the new string
        int j = 0;
        while (j<str.length()){// as long as the condition is true
            int count = 0;
            for (int i = 0; i <str.length(); i++){
                if(str.charAt(j) == str.charAt(i)) {// compare characters, if equal add
                    count++;
                }

            }
            result+= "" + str.charAt(j)+ ""+ count;
          str = str.replace(""+ str.charAt(j), "");
        }
        return result;
    }
}
