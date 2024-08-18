
import javax.swing.JFrame;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class HousesTester {
    public static final int NO_OF_ROWS = 20;
    public static final int NO_OF_COLS = 20;

    // We tried but couldn't manage to use the component.setwaterlevel.
    // However we came up with some other way. A regulatory variable below.
    public static int waterlevelregulator = 500;

    public static void main(String[] args) {

        double[][] elevation_levels = new double[NO_OF_ROWS][NO_OF_COLS]; // declaration of a 2D array of elevation
                                                                          // levels.
        ArrayList<Houses> list_of_Houses = new ArrayList<>();

        JFrame frame = new JFrame(); // Jrame stuff.
        frame.setSize(900, 900);
        frame.setTitle("Higher Ground!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Maps component = new Maps(list_of_Houses);
        component.set_water_Level(200);
        frame.add(component);

        frame.setVisible(true);

        int[][] array = new int[10][10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                array[i][j] = random.nextInt(401) + 500; // generates random number between 500 and 900
            }
        }

        // Print the generated array of random values.This is to test use of random
        // objects
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");

        // the code below gets coordinates from the user.

        Scanner userEntry = new Scanner(System.in);

        int house_row = 0;
        int house_col = 0;

        while ((house_row) + (house_col) != 2000) { // enter 1000 for both row and column to quit.

            System.out.print(
                    "Enter the first row coordinate.Must be between 0 and 9. Enter 1000 to terminate row entries.");
            house_row = userEntry.nextInt();

            System.out.print(
                    "Enter the second column coordinateMust be between 0 and 9.If you've already terminated the row, Enter 1000 to terminate column entries.");
            house_col = userEntry.nextInt();

            // using the user entered values to create a new house.
            if ((house_row) + (house_col) != 2000) {
                Houses house1 = new Houses(house_row, house_col); // This will help us initialise the
                                                                  // instance variable in the Houses
                                                                  // class.
                list_of_Houses.add(house1);// adding the list of houses to the the array List.

            }

        }
        component.repaint();

    }

}
