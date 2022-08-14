package PhoneNumberDecoder;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumberDecoderApplication {

    public static void main(String[] args) {
        System.out.println("Type a phone number to decode : ");

        Scanner scanner = new Scanner(System.in);
        String stringToDecode = scanner.nextLine();

        if(validateString(stringToDecode)) {
            String phoneNumber = stringToDecode.replaceFirst("(\\d{2})(\\d{2})(\\d+)(\\d{4})",
                    "+$1 ($2) $3-$4");

            System.out.println("Phone number : " + phoneNumber);
        }else {
            System.out.println("Phone number not valid.");
        }
    }
    public static boolean validateString(String str) {
        String regularExpression = "[-+]?[0-9]*\\.?[0-9]{9,10}+$";
        Pattern pattern = Pattern.compile(regularExpression);
        Matcher matcher = pattern.matcher(str);
        return matcher.matches();
    }
}
