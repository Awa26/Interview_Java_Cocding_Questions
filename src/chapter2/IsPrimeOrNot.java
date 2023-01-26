package chapter2;

public class IsPrimeOrNot {
    public static void main(String[] args) {
        System.out.println("Is 15 a prime number: "+isPrime(15));
    }

    public static boolean isPrime(int num){
        boolean res = false;
        if (num<=1){// #s 0 and 1 are not prime numbers
            return res;// false
        }
        for (int i = 2; i < num; i++){
            if (num%i==0){//if no remainder then its false
                return false;
            }
        }
        return true;// true if otherwise
    }
}
