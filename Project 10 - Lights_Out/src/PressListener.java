import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PressListener implements ActionListener {
    /*
     * each PressListener object needs to "know" which LightTile it is
     * doing the listening for, since we need to know which tile is pressed.
     * The way we do this is create a listener class that implements the
     * ActionListener interface, but can possess a LightTile as an instance
     * variable.
     * This ensures the PressListener can manipulate it's LightTile object (myTile)
     * using the public interface of the LightTile class.
     */
    private LightTile myTile;

    public PressListener(LightTile newTile) {
        super();
        myTile = newTile;
    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        myTile.toggle();
        myTile.press();
    }

}
