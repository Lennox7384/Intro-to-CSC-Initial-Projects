import javax.swing.JFrame;
/*Jframe class of the Swing package is neccesary for creating a window to display the our graphic outputs*/

public class FrameDesigner {
    public static void main(String[] args) {

        JFrame frame = new JFrame(); // just constructed a new JFrame object
        frame.setSize(1200, 1000);
        frame.setTitle("Manipulation of Rectangle Objects in Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // More Plumbing to ensure the RectangleManipulation class is included

        RectangleManipulation component = new RectangleManipulation(); // maybe you use the name of the classes that you
                                                                       // wanna work with; to construct some sort of an
                                                                       // object.
        frame.add(component);
        frame.setVisible(true);

    }
}
