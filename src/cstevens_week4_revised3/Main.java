package cstevens_week4_revised3;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 4 Assignment - Revised
 * @Date: Jun 13, 2021
 * @Description: Formatted Output & String Manipulation
 */

//Imports
import static java.lang.Math.*;
import java.util.Scanner;

//Begin Class Main
public class Main {

    //Begin Main Method
    public static void main(String[] args) {

        // create an object of the Scanner
        Scanner sc = new Scanner(System.in);

        System.out.print("Please enter a paragraph of text\n");
        
        // take input for quote
        String quote = sc.nextLine();
        System.out.printf("You entered:\n%s", quote);

        System.out.print("\n\nPlease choose from the following menu of "
                + "options:\n1. Convert to all uppercase letters\n2. Convert to"
                + " all lowercase letters\n3. Display the length of the "
                + "paragraph\n4. Select a substring from the paragraph\n5. Let"
                + " Random select a substring from the paragraph\n6. Exit\n");

        // take input for user choice
        int choice = sc.nextInt();

        //SWITCH CASE        
        switch (choice) {

            // convert to all uppercase
            case 1:
                System.out.printf("Your paragraph in all uppercase "
                        + "letters:\n%s\n\n", quote.toUpperCase());
                break;

            // convert to all lowercase    
            case 2:
                System.out.printf("Your paragraph in all lowercase "
                        + "letters:\n%s\n\n", quote.toLowerCase());
                break;

            // display paragraph length   
            case 3:
                System.out.printf("The length of your paragraph is: %d "
                        + "characters & spaces.\n\n", quote.length());
                break;

            // select a substring
            case 4:
                System.out.printf("Select a starting point between 0 and %d: ",
                        quote.length());
                // request first starting point from user
                int start1 = sc.nextInt();
                // first if/else in case of invalid selection
                if (start1 < 0 || start1 > quote.length()) {
                    System.out.print("Invalid selection. Exiting program.\n\n");
                    System.exit(1);
                }else {    
                    System.out.printf("Select a starting point between %d and "
                            + "%d: ", start1, quote.length());
                    // request second starting point from user
                    int start2 = sc.nextInt();
                    // second if/else in case of invalid selection
                    if (start2 < start1 || start2 > quote.length()) {
                        System.out.print("Invalid selection. Exiting program."
                                + "\n\n");
                        System.exit(1);
                    }else {    
                        System.out.printf("The substring you selected is:"
                                + "\n%s\n\n", quote.substring(start1, start2));
                        break;
                    }
                }

            // Random selects a substring  
            case 5:
                // get Random upper limit
                int randUp = (int) (random() * quote.length());
                // get Random lower limit
                int randLo = (int) (random() * randUp);
                // define Random substring
                System.out.printf("Random selected a starting point of: %d\nAnd"
                        + " an ending point of: %d\nYour Random substring"
                        + " is:\n%s\n\n", randLo, randUp, 
                        quote.substring(randLo, randUp));
                break;

            // exit
            case 6:
                System.out.print("Thank you for using the program.\n"
                        + "Goodbye.\n\n");
                System.exit(0);

            // default
            default:
                System.out.print("Invalid selection.\nExiting the"
                        + " program.\n\n");
                System.exit(1);

        }
    } //End Main Method

} //End Class Main
