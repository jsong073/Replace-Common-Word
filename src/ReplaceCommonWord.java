/*
This program should ask the user for a String and replace all instances of "the" with "be"

1. Set up variables
    a. Scanner to receive user input
    b. userString to store input
    c. splitString to store userString.split array
    d. boolean hasQuit to check if user will quit
2. String.split takes a String and replaces it with an array of smaller Strings, split around any instance specified
    by the parameter. In this case, "the".
    The output should be the elements in the split string array concatenated together, with "be" in between the
    split strings. This can be done with a loop
3. Create a do-while loop that asks for user String input as long as 'q' is not entered
    a. do {
        Ask the user for a String, or press 'q' to quit
        Use String.split with the parameter "the" to split the string around instances of "the"
        Store the resulting array
        for (int i = 0; i < splitString.length; i++) {
           if (i != splitString.length - 1) {             <----- This prevents the "BE" from being attached to the end of
                                                                 the string
                S.O.P.(splitString[i] + "BE")
           } else {
                S.O.P.(splitString[i]
           }
        }
        } while (!input.equals('q'))
    b. print out the result
Note: The program will replace all instances of "the", even instances where it is a part of another word i.e. then -> BEn
 */

import java.util.Scanner;
import java.util.Arrays;

public class ReplaceCommonWord {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String userString = "";
        String[] splitString;
        boolean hasQuit = false;

        do {
            System.out.print("Enter some text and I will replace \"the\" with \"be\". Or enter 'q' to quit: ");
            userString = sc.nextLine() + " ";                     //Added a space at the end so in situations where the
                                                                  //last word is "the", it will still be replaced
            if (userString.equals("q ")) {
                hasQuit = true;
            }
            if (hasQuit == false) {
                System.out.println(userString);
                splitString = userString.split("(?i)the");      //(?i) ignores case so the is taken out regardless
                for (int i  = 0; i < splitString.length; i++) {
                    if (i != splitString.length - 1) {                //If this condition isn't present, then "be" will be
                                                                      //concatenated at the end, even if "the" is not there
                        System.out.print(splitString[i] + "BE");
                    } else {
                        System.out.print(splitString[i]);
                    }
                }
                System.out.println();
            }
        }while (hasQuit == false);
    }
}
