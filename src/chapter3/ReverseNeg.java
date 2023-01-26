package chapter3;

public class ReverseNeg {
    public static void main(String[] args) {

        System.out.println(reverseNegative(-99));
        System.out.println(reverseNegative(9));// is not negative so its gonna give exception
    }
    public static int reverseNegative(int num){

        String str = new StringBuilder(""+ num).reverse().toString();
        if (num>0){
            throw new ArithmeticException("Invalid Number: "+ num);
        }
        if (num<0){
            str= "-" + str.substring(0, str.length()-1);
        }

        return Integer.parseInt(str);
    }
}
