package cstevens_week4;

/**
 * @Course: SDEV 250 ~ Java Programming I
 * @Author Name: Chad Stevens
 * @Assignment Name: Week 4 Assignment
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

        String quote;

        System.out.print("Please enter a paragraph of text\n");
        quote = sc.nextLine();
        System.out.print("You entered: \n");
        System.out.printf(quote);

        System.out.print("\n\nPlease choose from the following menu of ");
        System.out.print("options:\n");
        System.out.print("1. Convert to all uppercase letters\n");
        System.out.print("2. Convert to all lowercase letters\n");
        System.out.print("3. Display the length of the paragraph\n");
        System.out.print("4. Select a substring from the paragraph\n");
        System.out.print("5. Let Random select a substring from the ");
        System.out.print("paragraph\n");
        System.out.print("6. Exit\n");

        // take input for user choice
        int choice = sc.nextInt();

        // define paragraph length (used in multiple cases)
        int quoteLen = quote.length();

        //SWITCH CASE        
        switch (choice) {

            // convert to all uppercase
            case 1:
                System.out.print("Your paragraph in all uppercase letters:\n");
                String quoteUp = quote.toUpperCase();
                System.out.print(quoteUp);
                System.out.print("\n\n");
                break;

            // convert to all lowercase    
            case 2:
                System.out.print("Your paragraph in all lowercase letters:\n");
                String quoteLo = quote.toLowerCase();
                System.out.print(quoteLo);
                System.out.print("\n\n");
                break;

            // display paragraph length   
            case 3:
                System.out.print("The length of your paragraph is: ");
                System.out.print(quoteLen);
                System.out.print(" characters & spaces.\n\n");
                break;

            // select a substring
            case 4:
                System.out.print("Select a starting point between 0 and ");
                System.out.print(quoteLen);
                System.out.print(": ");
                // request first starting point from user
                int start1 = sc.nextInt();
                
                // first if/else in case of invalid selection
                if (start1 < 0 || start1 > quoteLen) {
                    System.out.print("Invalid selection. Exiting program.\n\n");
                    System.exit(1);
                }else {    
                    System.out.print("Select a starting point between ");
                    System.out.print(start1);
                    System.out.print(" and ");
                    System.out.print(quote.length());
                    System.out.print(": ");

                    // request second starting point from user
                    int start2 = sc.nextInt();
                    
                    // second if/else in case of invalid selection
                    if (start2 < start1 || start2 > quoteLen) {
                        System.out.print("Invalid selection. ");
                        System.out.print("Exiting program.\n\n");
                        System.exit(1);
                    }else {    
                        String quoteSub = quote.substring(start1, start2);
                        System.out.print("The substring you selected is: ");
                        System.out.print(quoteSub);
                        System.out.print("\n\n");
                        break;
                    }
                }

            // Random selects a substring  
            case 5:
                // get Random upper limit
                int randUp = (int) (random() * quoteLen);
                // get Random lower limit
                int randLo = (int) (random() * randUp);
                System.out.print("Random selected a starting point of: ");
                System.out.print(randLo);
                System.out.print("\nAnd an ending point of: ");
                System.out.print(randUp);
                String quoteRand = quote.substring(randLo, randUp);
                System.out.print("\nYour Random substring is: ");
                System.out.print(quoteRand);
                System.out.print("\n\n");
                break;

            // exit
            case 6:
                System.out.print("Thank you for using the program.\n");
                System.out.print("Goodbye.\n\n");
                System.exit(0);

            // default
            default:
                System.out.print("Invalid selection.\n");
                System.out.print("Exiting the program.\n\n");
                System.exit(1);

        }
    } //End Main Method

} //End Class Main
