import javax.swing.JOptionPane;

import java.net.MalformedURLException;
import java.net.URL;
import javax.swing.ImageIcon;

public class HelloTester {
    public static void main(String[] args) throws MalformedURLException {
        System.out.println("--------------------------------------------------");
        System.out.println("|                                                |");
        System.out.println("|                                                |");
        System.out.println("|    Hello, my name is Lennox Blair Magak        |");
        System.out.println("|                                                |");
        System.out.println("|              ghgh                              |");
        System.out.println("-------------------------------------------------|");
        /*
         * This is my tree bush code y'all. Its ,meant to be a child with a bush infront
         * of them
         */
        // Just testing how these two forward slashes differ from the forward slash and
        // a star. Geeky hehehe
        System.out.println("        o");
        System.out.println("      oooo");
        System.out.println("    ooooooo");
        System.out.println("    oooooooo");
        System.out.println("     ooIIo o       ooo");
        System.out.println("     o II         oooooo");
        System.out.println("  _____II_________ oooo____");

        /*
         * They say the following is a truck
         * Ahh, dont worry about it
         **/
        URL imageLocation;
        imageLocation = new URL(
                "https://media.cnn.com/api/v1/images/stellar/prod/191003121459-02-bugatti-chiron-road-trip.jpg?q=x_35,y_626,h_1946,w_3459,c_crop/h_720,w_1280/f_webp");

        JOptionPane.showMessageDialog(null, "Hello", "Title",
                JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));

    }

}