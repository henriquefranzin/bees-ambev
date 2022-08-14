package ReverseOnlyLetters;

import java.util.Scanner;
import java.util.Stack;

public class ReverseOnlyLettersApplication {

    public static void main(String[] args) {
        Stack<Character> letters = new Stack<>();
        StringBuilder reversedString = new StringBuilder();

        System.out.println("Type a string to reverse only the letters : ");

        Scanner scanner = new Scanner(System.in);
        String stringToReverse = scanner.nextLine();

        for (int i = 0; i < stringToReverse.length(); i++) {
            if (Character.isLetter(stringToReverse.charAt(i))) {
                letters.push(stringToReverse.charAt(i));
            }
        }

        for (int i = 0; i < stringToReverse.length(); i++) {
            if (Character.isLetter(stringToReverse.charAt(i))) {
                reversedString.append(letters.pop());
            } else {
                reversedString.append(stringToReverse.charAt(i));
            }
        }

        System.out.println("Reversed string : " + reversedString);
    }
}
