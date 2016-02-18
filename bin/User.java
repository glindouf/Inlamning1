import java.util.Scanner;
 
public class User {
 
    /**
     * Prompt the user to enter a social security number in the format
     * DDD-DD-DDDD where D is a digit. The program displays
     * "Valid SSN for a correct social security number and "Invalid SSN"
     * otherwise.
     */
     public static void main(String[] args) {
        // Prompt the user to enter SSN in correct format
        Scanner input = new Scanner(System.in);
 
        System.out.print("Please enter a social security number DDDD-DD-DD: ");
        String social = input.next();
        if (checkSSN(social)) {
            System.out.print("Valid SSN");
        } else
            System.out.print("Invalid SSN");
 
    }
 
    public static boolean checkSSN(String social) {
        boolean valid = false;
        // 10 digits and 2 hyphens. First FOUR characters, 5 and 6, and 8, 9,
        // 10, 11 are digits
 
        // Check that the length is valid
        if (social.length() == 10) {
            valid = true;
 
            // Check that the characters are valid
            // Valid as digits
            char index0 = social.charAt(0);
            char index1 = social.charAt(1);
            char index2 = social.charAt(2);
            char index3 = social.charAt(3);
            char index5 = social.charAt(5);
            char index6 = social.charAt(6);
            char index8 = social.charAt(8);
            char index9 = social.charAt(9);
            // Valid as hyphen
            char index4 = social.charAt(4);
            char index7 = social.charAt(7);
 
            if (Character.isDigit(index0) && Character.isDigit(index1)
                    && Character.isDigit(index2) && Character.isDigit(index3)
                    && Character.isDigit(index5) && Character.isDigit(index6)
                    && Character.isDigit(index8) && Character.isDigit(index9)
                    && index4 == '-'             && index7 == '-') {
                valid = true;
            }
        } else
            valid = false;
 
        return valid;
    }
}