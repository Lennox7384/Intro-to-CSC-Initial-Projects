
// impotations from the java Abstract Window Toolkit (awt) library.
//packages from this library provide classes and interfaces for creating and managing (GUIs) in java applications 

import java.awt.Color;
import java.util.Random;
import java.util.Scanner;
import java.awt.geom.Line2D;
import java.awt.geom.Ellipse2D;

import java.awt.Graphics;
import java.awt.Graphics2D;

import java.awt.Rectangle;
import java.awt.BasicStroke;

//java.util package contain classes that help alot with the day today utility. from scanners to ArrayLists and LinkLists.
import java.util.ArrayList;

//javax.swing package provides classes and components for creating GUIs.From Frames to dialogue boxes to menus etc.
//focused on GUI development.
//the JComponent severs as a base class for all Swing components that can be displayed on a GUI. 
import javax.swing.JComponent;

// ofcourse we will revisit and practise over the break but for now we are good to go.
// lets kick off. 

public class Maps extends JComponent {
    // maps, the subclass is inheriting the behaviours of JComponent class the
    // superclass.

    /**
     * The below variables will help us in creating color coded maps.
     */

    // we are going to declare final variables that belong to the Maps
    // class(static).
    // these variables can be accessed from anywhere within this
    // project.
    // some of them are unknown private unchangable and long variables.

    private static final long serialVersionUID = 1L;

    public static final Color LIGHT_BLUE = new Color(0, 200, 220);

    // we expect a 10 by 10 2D Array to be declared by the help of the following
    // variables

    public static final int NO_OF_ROWS = 10;
    public static final int NO_OF_COLS = 10;

    // must be the starting coordinates of the entire grid.
    public static final int startAx = 25;
    public static final int startBy = 25;

    // for the height and width of individual rectangles
    public static final int cell_size = 60;

    // now this is a weird one;
    public static final int SMALL_NUMBER_OF_PIXELS = 6;

    /**
     * Instance variables.
     * they will store the internal data of each of the objects of the
     * maps class enabling their methods to be executed on them.
     */

    private final double[][] elevation_levels; // Elevations levels is a 2D Array of doubles
    private final Rectangle[][] cell_Array; // cell_Array is a 2D Array of rectangles.
    private ArrayList<Houses> list_of_Houses; // Houses is an Array List of Houses
    private static double water_Level; // we couldn't use water_Levels partly because of the unfamiliarity with
                                       // "component"

    /**
     * A constructor
     * Just enter the array list of the buildings, we will generate elevation
     * levels for you.
     */

    public Maps(ArrayList<Houses> peoples_homes) {
        cell_Array = get_squares();// come back here
        list_of_Houses = peoples_homes;
        elevation_levels = get_terrain();

    }

    /**
     * water level method. Check comment on line 74.
     */

    public void set_water_Level(double waterlevel) {
        water_Level = waterlevel;

        repaint();
    }

    // this method get_squares, draws the grid but does not actually get it painted.
    // this method spills out a 2D ARRAY OF RECTANGLES, otherwise it could have been
    // public static void.
    // this method does not take in any arguments, however its results have been
    // used to initialise the instance variable cell_array.

    // We gonna do the same process with the elevation levels.
    private static Rectangle[][] get_squares() {
        Rectangle[][] squares = new Rectangle[NO_OF_ROWS][NO_OF_COLS];
        int X_current = startAx;
        int Y_current = startBy;

        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j < NO_OF_COLS; j++) {
                Rectangle rect = new Rectangle(X_current, Y_current, cell_size, cell_size);
                squares[i][j] = rect;
                X_current += cell_size;

            }
            X_current = startAx;
            Y_current += cell_size;
        }
        return squares;
    }

    public static double[][] get_terrain() {
        // Initialisation of a local 10 by 10 2D array of doubles. We'll call it
        // terrain_digits
        // also intialise a Random object, call it random_digits to help us populate
        // terrain digits.

        double[][] terrain_digits = new double[NO_OF_ROWS][NO_OF_COLS];
        Random random_digits = new Random();

        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int ii = 0; ii < NO_OF_COLS; ii++) {
                // here we will populated the 2D array of doubles with actual double elements.
                // we are going to randomise them between 400 (inclusive) and 900 by using the
                // Random object.
                // This way, everytime you run the code. A new map of different elevations is
                // generated for you. So elevations is changing automatically.

                terrain_digits[i][ii] = random_digits.nextInt(501) + 400; // now we have our 2D array of
                                                                          // doubles filled
                // up(though with ints). Lets see what
                // happenns

            }
        }
        return terrain_digits;

    }

    // the actual drawing from Dr.Axvig

    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;

        for (int i = 0; i < NO_OF_ROWS; i++) {
            for (int j = 0; j < NO_OF_COLS; j++) {
                Rectangle rect = cell_Array[i][j];

                double rectXX = rect.getX();
                double rectYY = rect.getY();

                // attempt to colour the elements of the 2D Array of rectangles depending on the
                // value of corresponding terrain digits (that give us elevation)
                for (int mm = 0; mm < NO_OF_ROWS; mm++) {
                    for (int kk = 0; kk < NO_OF_COLS; kk++) {
                        Rectangle corespondingRect = cell_Array[mm][kk];
                        double x_Coord = corespondingRect.getX();
                        double y_Coord = corespondingRect.getY();
                        double terrainElement = elevation_levels[mm][kk];
                        /**
                         * Above is a very important revelation. You use a method from somewhere else to
                         * initialise an instance variable
                         * Then, inform a value of a local variable with that instance variable.
                         * Its a weird lovely interdepence!!
                         */

                        if (terrainElement <= 500) {

                            // Elevation 400-500 is water.
                            // Now lets draw water whenever this condition is met.
                            g2.setColor(LIGHT_BLUE);
                            // No need to draw (correspondingrect) because we already have Rectangle rect
                            // drawn.
                            g2.fill(corespondingRect);

                            // Black strokes
                            g2.setColor(Color.BLACK);
                            g2.setStroke(new BasicStroke(1));

                            double aaa = x_Coord;
                            double bbb = y_Coord;

                            while (aaa < x_Coord + cell_size) {
                                bbb = y_Coord;

                                while (bbb < y_Coord + cell_size) {
                                    Line2D.Double waterLine1 = new Line2D.Double(aaa, bbb, aaa + SMALL_NUMBER_OF_PIXELS,
                                            bbb);
                                    g2.draw(waterLine1);
                                    bbb += 2 * SMALL_NUMBER_OF_PIXELS;
                                }
                                aaa += 2 * SMALL_NUMBER_OF_PIXELS;

                            }

                        }

                        else if (terrainElement <= 600) // this is a low elevation region. We will color
                                                        // it dark green.The green colour gets lighter as elevation
                                                        // increases.
                        {
                            double colorVariator1 = (((terrainElement - 501) / 2) + ((terrainElement - 501) % 2));
                            Color color_2 = new Color(0, 35 + (int) colorVariator1, 0);
                            g2.setColor(color_2);
                            g2.fill(corespondingRect);

                        } else if (terrainElement <= 700) {
                            double colorVariator1 = (((terrainElement - 601) / 2) + ((terrainElement - 601) % 2));
                            Color color_2 = new Color(0, 90 + (int) colorVariator1, 0);
                            g2.setColor(color_2);
                            g2.fill(corespondingRect);
                        }

                        else if (terrainElement <= 800) {
                            double colorVariator1 = (((terrainElement - 701) / 2) + ((terrainElement - 701) % 2));
                            Color color_2 = new Color(0, 145 + (int) colorVariator1, 0);
                            g2.setColor(color_2);
                            g2.fill(corespondingRect);
                        }

                        else if (terrainElement <= 900) {
                            double colorVariator1 = (((terrainElement - 801) / 2) + ((terrainElement - 801) % 2));
                            Color color_2 = new Color(0, 200 + (int) colorVariator1, 0);
                            g2.setColor(color_2);
                            g2.fill(corespondingRect);
                        }

                        // Row number display.
                        // Should happen after all painting is done. Otherwise its going to be painted
                        // over so we dont see it.
                        int displayedNumber = (int) terrainElement;

                        Color textColor = new Color(165, 99, 43);
                        g2.setColor(textColor);
                        String displayedText2 = "" + displayedNumber; // smart thing!String won't allow you to display
                                                                      // an
                                                                      // integer.Do the trick.
                        g2.drawString(displayedText2, (float) x_Coord + cell_size / 3,
                                (float) y_Coord + (float) 2.5 + cell_size / 3);

                        // Below, we put houses in their corresponding place according to the user
                        // coordinates.

                        for (Houses anyHouse : list_of_Houses)

                        {
                            int[] location = anyHouse.getLocation();

                            // on the Grid

                            int gridRow = location[0];
                            int gridColumn = location[1];

                            if (kk == gridColumn && mm == gridRow) {
                                g2.setColor(Color.BLACK);
                                g2.setStroke(new BasicStroke(10));
                                Line2D.Double first_drawing = new Line2D.Double(x_Coord + 10, y_Coord + 10,
                                        x_Coord + cell_size / 4,
                                        y_Coord + cell_size / 4);
                                g2.draw(first_drawing);

                            }

                        }

                    }
                }

            }
        }

    }

}
