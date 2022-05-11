/**
 * author: Yajat Sharma
 */
import java.util.*;

public class Palindrome {
    public static void main(String[] args) throws Exception {
        Scanner keyb = new Scanner(System.in);
        String userInput = "";

        System.out.println("Welcome to palindrome checker");
        do {
            System.out.println("Enter the word you would like to test or enter \"q\" to quit :");
            userInput = keyb.nextLine();
            if(!userInput.equalsIgnoreCase("q")) {
                if(isPalindrome(userInput)) {
                    System.out.println(userInput + " is a palindrome.");
                } else if(isSpacePalindrome(userInput)) {
                    System.out.println(userInput + " is a space palindrome. (We can define a space palindrome as a word that is a palindrome when the spaces are ignored.)");
                } else {
                    System.out.println("The word you have entered is not a palindrome or a space palindrome.");
                }
            }
        } while (!userInput.equalsIgnoreCase("q"));
        System.out.println("Thank you for using the palindrome checker");
    }

    /**
     * Method to check if a word is a palindrome
     * @param str is the parameter that is being tested upon
     * @return returns a boolean value of true if str is a palindrome
     */
    public static boolean isPalindrome(String str) {
        if(str.length() <= 1) {
            return true; //any string of length 0 or 1 is a palindrome
        } else {
            if(str.charAt(0) == str.charAt(str.length() - 1)) { // check if the first and last character in the string are the same
                String recurseStr = str.substring(1, str.length() - 1); //make a substring to use as the argument for the recursive call 
                return isPalindrome(recurseStr); //make the recursive call
            } else {
                return false; //the given word is not a palindrome if the aforementioned comparison is not true for anyone of the recursive call(s)
            }
        }
    }

    /**
     * Method to check if a word is a space palindrome
     * @param str is the parameter that is being tested upon
     * @return a boolean value of true if str is a palindrome
     */
    public static boolean isSpacePalindrome(String str) {
        if(str.length() <= 1) {
            return true; //any string of length 0 and 1 is a palindrome
        } else {
            if(str.charAt(0) == str.charAt(str.length() - 1)) { 
                String recurseStr = str.substring(1, str.length() - 1);
                return isSpacePalindrome(recurseStr);
            } else if(str.charAt(0) == ' ') {
                String recurseStr = str.substring(1, str.length()); //create a substring with the space removed
                return isSpacePalindrome(recurseStr); //use the substring as the argument for the recursive call
            } else if(str.charAt(str.length() - 1) == ' ') {
                String recurseStr = str.substring(0, str.length() - 1); //create a substring with the space removed
                return isSpacePalindrome(recurseStr); //use the substring as the argument for the recursive call
            } else {
                return false; //the given string is not a palindrome if the first and last characters are not equal and neither of them is a space 
            }
        }
    }
}
