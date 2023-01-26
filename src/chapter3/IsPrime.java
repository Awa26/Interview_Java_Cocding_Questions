package chapter3;

public class IsPrime {
    public static void main(String[] args) {
int num = 29;
boolean flag = false;
if (num<=0){
     flag = false;
}
for (int i = 2; i <= num/2; i++) {
    if (num % i == 0) {
        flag = true;
    }
}

if (!flag){
    System.out.println("It is not a prime number: " + num);
    }else {
    System.out.println("It is a prime number: "+ num);
    }

}

    }
   // public static boolean isPrimeNumber()

