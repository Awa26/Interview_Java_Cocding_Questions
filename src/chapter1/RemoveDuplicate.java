package chapter1;

public class RemoveDuplicate {
    public static void main(String[] args) {
        /*
        String -- Remove Duplicates
Write a return method that can remove the duplicated values from
String
Ex: removeDup("AAABBBCCC") ==> ABC
         */
        System.out.println(removeDuplicates("AAABBBCCC"));// ABC

    }

    public static String removeDuplicates(String str){
        String res = "";
        for (int i = 0; i <str.length(); i++){
            if (!res.contains(""+ str.charAt(i))){
                res+= ""+ str.charAt(i);
            }
        }
        return res;
    }
}
