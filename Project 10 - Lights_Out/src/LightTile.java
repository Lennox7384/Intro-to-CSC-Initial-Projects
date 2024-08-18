import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class LightTile extends JButton {
    public static Color litColor = Color.RED;
    public static Color darkColor = Color.GRAY;
    public static String litUpText = "On";
    public static String turnedOffText = "";
    private boolean isLitUp;// set to true if tile should be lit up, false otherwise
    private ArrayList<LightTile> neighbors;// keeps track of all neighboring tiles on the board, including diagonal
                                           // neighbors. Ranges in size from 4 to 8 depending on the tile.

    /**
     * A Constructor
     * 
     * @param lightStatus
     */
    public LightTile(boolean lightStatus) {
        isLitUp = lightStatus;
        neighbors = new ArrayList<LightTile>();
        this.setOpaque(true);// ADD THIS FOR MAC USERS!!
        updateAppearance();

    }

    /**
     * updates the visual appearance of the button
     */
    public void updateAppearance() {
        // you supply code here

        if (isLitUp) {
            setOpaque(true);
            setBackground(litColor);
            setText("On");
        } else {
            setOpaque(true);
            setBackground(darkColor);
        }

    }

    /**
     * Toggles this switch on to off or off to on, and updates appearance
     */
    public void toggle() {
        // you supply code here

        if (isLitUp) {
            isLitUp = false;
            setOpaque(true);
            setBackground(darkColor);
            setText("");

        } else {
            isLitUp = true;
            setOpaque(true);
            setBackground(litColor);
            setText("On");
        }

    }

    /**
     * Your PressListener should class this method, which
     * ought to toggle this button AND all its neighbors.
     */
    public void press() {
        // you supply code here

        for (int i = 0; i < neighbors.size(); i++) {

            neighbors.get(i).toggle();

        }

    }

    public void addNeighbor(LightTile newNeighbor) {
        neighbors.add(newNeighbor);
    }

    public ArrayList<LightTile> getNeighbors() {
        return neighbors;
    }

    /**
     * Provides a means of re-setting a button to a specific value,
     * not just toggling from one to another. Also should update its
     * appearance.
     * 
     * This will be useful for the newGameButton and the turnAllOffButton.
     * 
     * @param value
     */

    public void setTile(boolean value) {
        // you supply code here
    }

    public void makeGreen() {
        this.setBackground(Color.GREEN);
    }

    // helps turn all lights off
    public void allOff() {
        setOpaque(true);
        setBackground(darkColor);
        setText("");
    }

    // helps with reset for new game

    public void reset() {
        isLitUp = true;
        setBackground(litColor);
        setText("On");
    }

    // This method changes the light bulbs into LEDs
    // The LEDs change color upon each click of mystery button 1.

    public void turn_to_LED() {
        ArrayList<Color> changingColors = new ArrayList<>();

        changingColors.add(Color.BLUE);
        changingColors.add(Color.YELLOW);
        changingColors.add(Color.GREEN);
        changingColors.add(Color.ORANGE);
        changingColors.add(Color.CYAN);

        int limit = changingColors.size();

        Random pickOne = new Random();
        int colorOfChoice = pickOne.nextInt(limit);
        isLitUp = true;
        for (int time = 0; time < Tester.TOTAL_TIME; time++) {

            setBackground(changingColors.get(colorOfChoice));

        }

        setText("LD"); // To mean LEDs
        Tester.pause(Tester.sleepTime);
    }
}
