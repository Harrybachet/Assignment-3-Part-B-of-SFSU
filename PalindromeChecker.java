/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: PalindromeChecker.java
 * Author: Frank M. Carrano
 * Author: Timothy M. Henry
 * Author: Duc Ta
 * Author: <Ronak> <Basnet>
 * **********************************************
 */

package assignment03PartB;

import java.util.Scanner;

//
// - Do not change the "main" method.
// - Please ADD CODE to complete implementing the program
//
public class PalindromeChecker {

    private static boolean isPalindrome(String string) {

        // First I replaced spaces with nothing //
        string = string.replace(" ", "");

        // Second I turned all the string inputs to lower case //
        string = string.toLowerCase();

        // Third I put a condition to see of these punctuations existed in the input and used replaceAll method to replace all of them with nothing. //

        if (string.contains("!") || string.contains(",") || string.contains("?") || string.contains(":") || string.contains(".") || string.contains("'")) {
            string = string.replaceAll(string, "");
        }

        // Created a string builder to reverse my string input //
        StringBuilder reverse = new StringBuilder();

        // This is me reversing the original input with a for loop //
        for (int i = string.length() - 1; i >= 0; i--) {
            reverse.append(string.charAt(i));
        }

        //
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != reverse.charAt(i)) {
                return false;
            }
        }
        return true;

    }

    //
    // - Do not change the "main" method.
    // - Please ADD CODE to complete implementing the program
    //
    public static void main(String[] args) {
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
        Scanner input = new Scanner(System.in);
        System.out.print("[>>] Enter a string (or a ! to exit): ");
        String string = input.nextLine();

        while (!string.equals("!")) {
            if (isPalindrome(string)) {
                System.out.println(" [+] Yes. \"" + string + "\" IS a palindrome!");
            } else {
                System.out.println(" [-] No. \"" + string + "\" is NOT a palindrome!");
            }
            System.out.print("[>>] Enter a string: ");
            string = input.nextLine();
        }

        System.out.println("[<<] Thank you!");
        //
        // - Do not change the "main" method.
        // - Please ADD CODE to complete implementing the program
        //
    }
}


//   // Length of the string //
////
////        string = string.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
////
////        StringBuilder forward = new StringBuilder(string);
////
////        StringBuilder reversal = new StringBuilder(forward.reverse());
////
////        return forward.toString().contentEquals(reversal);
//
//        //        string = string.replace("!", "");
////        string = string.replace(",", "");
////        string = string.replace("?", "");
////        string = string.replace(":", "");
////        string = string.replace(".", "");
////        string = string.replace("'", "");
////        string = string.replace("'", "");