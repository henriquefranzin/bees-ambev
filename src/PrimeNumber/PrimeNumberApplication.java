package PrimeNumber;

import java.util.Scanner;

public class PrimeNumberApplication {

    public static void main(String[] args) {
        System.out.println("Type a number to check : ");

        Scanner scanner = new Scanner(System.in);
        int numberToCheck = scanner.nextInt();

        if(isNotPrimeFunc(numberToCheck)) {
            System.out.println("The number " + numberToCheck + " is not prime.");
        } else {
            System.out.println("The number " + numberToCheck + " is prime.");
        }
    }
    private static boolean isNotPrimeFunc(int numberToCheck) {
        for(int i = 2; i <= Math.sqrt(numberToCheck); i++) {
            if(numberToCheck % i == 0) return true;
        }
        return false;
    }
}
