import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 * Elements of this class will enable us to draw 4 small Rectangles at the
 * corners of a main rectangle,
 * They will also enable us to identify and translate a rectangle formed when
 * two rectangles intersect
 * 
 * @author lmagak
 */
public class RectangleManipulation extends JComponent { // extends Jcomponent, well understood.
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g; // casting

        /*
         * IMPORTANT: Changing the initialised values for 3rd and 4th Rectangles
         * (boxes), could result to NO INTERSECTION.
         * If that happens, the output of program will not exactly reflect the intended
         * ouput as illustrated on the guiding template.
         */

        // Box 1: Initialisation.
        int x1 = 50;
        int y1 = 40;
        int w1 = 250;
        int h1 = 400;

        // Box 2: Initialisation. (The Imaginary Rectangle)
        int x2 = 400;
        int y2 = 100;

        int w2 = 40;
        int h2 = 20;

        // Box 3: Initialisation.
        int x3 = 500;
        int y3 = 225;

        int w3 = 200;
        int h3 = 300;

        // Box 4: Initialisation.
        int x4 = 600;
        int y4 = 475;

        int w4 = 350;
        int h4 = 200;

        // Below, bring box1 and box2 to life.
        Rectangle box1 = new Rectangle(x1, y1, w1, h1);
        g2.draw(box1);
        Rectangle box2 = new Rectangle(x2, y2, w2, h2);

        /*
         * Translate Box 2 in such a way that change in the Initial values does not
         * affect the final result.
         * I did some manual paperwork to arrive at these algebraic expressions.
         */
        box2.translate(x1 + w1 - w2 - x2, y1 + h1 - h2 - y2);
        g2.draw(box2);

        box2.translate(0, (h2 - h1));
        g2.draw(box2);

        box2.translate(w2 - w1, 0);
        g2.draw(box2);

        box2.translate(0, h1 - h2);
        g2.draw(box2);

        /*
         * Bring box 3 and box 4 to life.
         * Whether the two boxes intersect or not depends on what their initial values
         * are.
         * I tried to make values of box 4 depend on those of box 3 to ensure they
         * always intersect, but i couldn't manage.
         */
        Rectangle box3 = new Rectangle(x3, y3, w3, h3);
        g2.draw(box3);
        Rectangle box4 = new Rectangle(x4, y4, w4, h4);
        g2.draw(box4);

        // Aknowledge the Intersection. And name the new Rectangle (Box 5)
        Rectangle box5 = box4.intersection(box3);

        /*
         * Translate box 5 as directed by the question.
         * First, find its measurements that will allow you do that. (height and width)
         */
        int h5 = (int) box5.getHeight();
        int w5 = (int) box5.getWidth();
        box5.translate(w5, -h5);
        g2.draw(box5);

    }

}
