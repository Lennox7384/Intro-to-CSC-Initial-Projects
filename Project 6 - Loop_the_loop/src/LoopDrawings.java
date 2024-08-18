/**
 * this project loopDrawings,  explores different tools in  Java designed for repetative tasks.
 * the capability of the tools will be seen in the shapes
 * to be drawn in the end
 * 
 * @author lmagak
 */

//to be used to ask user to enter appropriate character string and integer.
import java.util.Scanner;

public class LoopDrawings {

    // the main method
    public static void main(String[] args) {

        // phase 1: ensuring appropriate entries from the user

        // scanner object to enable us allow the user input appropriate data of their
        // choice.
        Scanner userEntry = new Scanner(System.in);
        System.out.println("\n enter a non negative integer");

        boolean anotherRun = true;
        int correctNumber = 0;

        // aim: asking the user to enter a "correctNumber" that will then be passed down
        // to the shapes.
        while (anotherRun) {
            if (userEntry.hasNextInt()) {

                int enteredNumber = userEntry.nextInt();
                if ((enteredNumber >= 0) && (enteredNumber <= 4)) {

                    System.out.println("You have entered " + enteredNumber + ", a correct, non negative integer, "
                            + " HOWEVER YOU MIGHT NOT BE ABLE TO EASILY DISCERN the shapes you are about to draw." +
                            " Be sure to pay more attention. For perfect drawings try ODD numbers above 10 ");
                    correctNumber = enteredNumber;
                    System.out.println(correctNumber);
                    anotherRun = false;
                }

                else if (enteredNumber >= 5) {
                    System.out.println("You have entered " + enteredNumber + ", a correct, non negative integer");
                    correctNumber = enteredNumber;
                    System.out.println(correctNumber);
                    anotherRun = false;
                } else {
                    System.out.println("Please try again, integer was less than zero");
                    String gabbage1 = userEntry.nextLine();
                }

            } else {
                System.out.println("Please try again by entering an integer value that is zero or more than zero");
                String gabbage2 = userEntry.nextLine();

            }

        }

        System.out.println("Please enter a single character. Just one.");
        System.out.print("\n");

        // aim: asking the user to enter an appropriate String character, "correctChar".
        boolean expectedChar = true;
        String correctChar = " ";

        while (expectedChar) {

            if (userEntry.hasNext()) {
                String userChar = userEntry.next();
                if (userChar.length() < 2) {
                    correctChar = userChar;
                    expectedChar = false;
                } else {
                    System.out.println("Invalid Entry, please enter one character.Just one.");
                    String gabbage3 = userEntry.nextLine();
                }

            }

        }

        /**
         * quick revision of for loop basics
         * 
         * for (int kk = 1; kk <= 10; kk++) {
         * System.out.println("The value of " + kk + " squared is " + kk * kk);
         * }
         */

        // phase 2: implementation

        /**
         * IMPORTANT: User's chosen number,"correctNumber "
         * passed down for use in the shapes. It is stored in
         * the variable "myNumber". See below.
         */

        int myNumber = correctNumber;

        System.out.print("\n");

        // aim: drawing a hollow square
        for (int row1 = 1; row1 <= myNumber; row1++) {

            if (row1 == 1 || row1 == myNumber) {
                for (int col1 = 1; col1 <= myNumber; col1++) {
                    System.out.print(correctChar);
                }

            } else if (row1 > 1 && row1 < myNumber) {
                for (int col1 = 1; col1 <= myNumber; col1++) {
                    if (col1 == 1 || col1 == myNumber) {
                        System.out.print(correctChar); // correctChar; transffered user STRING CHARACTER input used for
                                                       // the first time. Going forward we will experiece more of it
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            System.out.print("\n");

        }
        System.out.print("\n");

        // aim: drawing the hourglass
        for (int row3 = 1; row3 <= myNumber; row3++) {
            if (row3 == 1 || row3 == myNumber) {
                for (int col3 = 1; col3 <= myNumber; col3++) {
                    System.out.print(correctChar);
                }

            } else if (row3 > 1 && row3 < myNumber) {
                for (int col3 = 1; col3 <= myNumber; col3++) {
                    if ((col3 == row3 && col3 + 1 != (myNumber + 1 - row3) && col3 - 1 != (myNumber + 1 - row3))
                            || col3 == myNumber + 1 - row3) {
                        System.out.print(correctChar);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.print("\n");
        }

        System.out.print("\n");

        /**
         * quick testing of fundermentals
         * double c = (20 / 2 + (20 % 2));
         * int m = (int) c;
         * System.out.println(m);
         * System.out.print("\n");
         */

        // aim: drawing the diamond shape
        for (int row4 = 1; row4 <= myNumber; row4++) {
            if (row4 == 1 || row4 == myNumber) {
                for (int col4 = 1; col4 <= myNumber; col4++) {
                    if (col4 == ((myNumber / 2) + (myNumber % 2))) {
                        System.out.print(correctChar);
                    } else {
                        System.out.print(" ");
                    }
                }
            }

            else if (row4 == ((myNumber / 2) + (myNumber % 2))) {
                for (int col4 = 1; col4 <= myNumber; col4++) {
                    System.out.print(correctChar);
                }
            }

            else if (row4 > 1 && row4 < ((myNumber / 2) + (myNumber % 2))) {
                for (int col4 = 1; col4 <= ((myNumber / 2) + (myNumber % 2)); col4++) {
                    if (col4 <= ((myNumber / 2) + (myNumber % 2) - row4)) {
                        System.out.print(" ");
                    } else {
                        System.out.print(correctChar);
                    }
                }

                for (int col4 = ((myNumber / 2) + (myNumber % 2) + 1); col4 <= myNumber; col4++) {
                    if (col4 <= row4 - 1 + ((myNumber / 2) + (myNumber % 2))) {
                        System.out.print(correctChar);

                    } else {
                        System.out.print(" ");
                    }
                }
            }

            else if (row4 > ((myNumber / 2) + (myNumber % 2)) && row4 < myNumber) {
                for (int col4 = 1; col4 <= ((myNumber / 2) + (myNumber % 2)); col4++) {
                    if (col4 <= row4 - ((myNumber / 2) + (myNumber % 2))) {
                        System.out.print(" ");
                    } else {
                        System.out.print(correctChar);
                    }
                }

                for (int col4 = (((myNumber / 2) + (myNumber % 2) + 1)); col4 <= myNumber; col4++) {
                    if (col4 <= ((myNumber / 2) + (myNumber % 2) + (myNumber - row4))) {
                        System.out.print(correctChar);
                    } else {
                        System.out.print(" ");
                    }

                }

            }
            System.out.print("\n");
        }

    }

}
