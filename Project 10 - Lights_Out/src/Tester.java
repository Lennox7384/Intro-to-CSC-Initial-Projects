
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.UIManager;
import java.util.ArrayList;

public class Tester extends javax.swing.JFrame {
        // Variables declaration
        // game LightTiles
        private LightTile jButton1;
        private LightTile jButton10;
        private LightTile jButton11;
        private LightTile jButton12;
        private LightTile jButton13;
        private LightTile jButton14;
        private LightTile jButton15;
        private LightTile jButton16;
        private LightTile jButton17;
        private LightTile jButton18;
        private LightTile jButton19;
        private LightTile jButton2;
        private LightTile jButton20;
        private LightTile jButton21;
        private LightTile jButton22;
        private LightTile jButton24;
        private LightTile jButton25;
        private LightTile jButton23;
        private LightTile jButton3;
        private LightTile jButton4;
        private LightTile jButton5;
        private LightTile jButton6;
        private LightTile jButton7;
        private LightTile jButton8;
        private LightTile jButton9;

        // other buttons that aren't LightTiles
        private JButton newGameButton;
        private JButton turnAllOffButton;
        private JButton mysteryButton1;
        private JButton mysteryButton2;

        // some animation will happen with Mystery button1
        public static final int sleepTime = 1;
        public static final int TOTAL_TIME = 5;

        // A JLable that can be used to print messages, if you wish
        private JLabel jLabel1;

        // A 2-d array that helps to organize the 25 LightTiles, since
        // their behavior is interdependent
        private LightTile[][] allLightTiles;

        // I used the following to help generate a new game by randomly
        // determining which of the 25 LightTiles should be turned on.
        private static final Random RANDOM_NUMBER_GENERATOR = new Random();
        public static final double PROBABILITY_OF_LIGHT_ON = 0.25;
        // End of variables declaration

        /**
         * Constructor:Creates new form Tester
         * Don't change/modify this.
         */
        public Tester() {
                initComponents();
        }

        /**
         * This method is called from within the constructor to initialize the form.
         */
        @SuppressWarnings("unchecked")

        private void initComponents() {
                // initialize LightTile states
                jButton1 = new LightTile(true);
                jButton2 = new LightTile(true);
                jButton3 = new LightTile(false);
                jButton4 = new LightTile(false);
                jButton5 = new LightTile(false);
                jButton6 = new LightTile(true);
                jButton7 = new LightTile(true);
                jButton8 = new LightTile(true);
                jButton9 = new LightTile(false);
                jButton10 = new LightTile(false);
                jButton11 = new LightTile(false);
                jButton12 = new LightTile(false);
                jButton13 = new LightTile(true);
                jButton14 = new LightTile(false);
                jButton15 = new LightTile(false);
                jButton16 = new LightTile(false);
                jButton17 = new LightTile(false);
                jButton18 = new LightTile(true);
                jButton19 = new LightTile(false);
                jButton20 = new LightTile(false);
                jButton21 = new LightTile(false);
                jButton22 = new LightTile(false);
                jButton23 = new LightTile(false);
                jButton24 = new LightTile(false);
                jButton25 = new LightTile(false);

                // set up other buttons that aren't LightTiles
                newGameButton = new JButton();
                turnAllOffButton = new JButton();
                mysteryButton1 = new JButton();
                mysteryButton2 = new JButton();

                newGameButton.setText("New Game");
                turnAllOffButton.setText("Turn All Off");
                mysteryButton1.setText("Mystery 1");
                mysteryButton2.setText("Mystery 2");

                // set up JLabel
                jLabel1 = new JLabel();
                jLabel1.setText("LD/LEDs");

                /*
                 * Begin frame layout set-up. This is super finicky - don't modify!!!
                 */
                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Lights Out!");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(21, 21, 21)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton11,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton12,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton13,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton14,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton15,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton6,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton7,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton8,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton9,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton10,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jButton1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton2,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton3,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton4,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(jButton5,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                50,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                layout
                                                                                                                                                .createSequentialGroup()
                                                                                                                                                .addComponent(jButton21,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jButton22,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jButton23,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                                .addPreferredGap(
                                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                                .addComponent(jButton24,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                50,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addComponent(jButton16,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                50,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton17,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                50,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton18,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                50,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jButton19,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                50,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton20,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton25,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                101,
                                                                                Short.MAX_VALUE)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                layout
                                                                                                                .createSequentialGroup()
                                                                                                                .addGroup(layout
                                                                                                                                .createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(mysteryButton2)
                                                                                                                                .addComponent(mysteryButton1))
                                                                                                                .addGap(64, 64, 64))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(turnAllOffButton)
                                                                                                                .addComponent(newGameButton)
                                                                                                                .addComponent(jLabel1))
                                                                                                .addGap(56, 56, 56)))));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                false)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(23, 23, 23)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton5,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton4,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton3,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton2,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                .addComponent(jButton6,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton7,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton8,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton9,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton10,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton11,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton12,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton13,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton14,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton15,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addGroup(layout
                                                                                                                .createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addComponent(jButton16,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton17,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton18,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton19,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addComponent(jButton20,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                50,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(33, 33, 33)
                                                                                                .addComponent(turnAllOffButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(newGameButton)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                Short.MAX_VALUE)
                                                                                                .addComponent(jLabel1,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                40,
                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                .addPreferredGap(
                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(mysteryButton1)
                                                                                                .addPreferredGap(
                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                .addComponent(mysteryButton2))
                                                                                .addComponent(jButton23,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                50,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton24,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                50,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton21,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                50,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton22,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                50,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                .addComponent(jButton25,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                50,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(18, Short.MAX_VALUE)));

                /*
                 * Begin frame layout set-up. This is super finicky - don't modify!!!
                 */

                // this next one calls a method that tells each of the 25 LightTiles
                // which other LightTiles is is connected to.
                initNeighbors();

                pack();// leave this here, don't modify

                // THIS INNER CLASS MANIPULATES THE Jbuttonturn all Off to turn off all the
                // lights.
                // It works in combination with the alloff() method i created in the lightTile
                // class.

                class turnAllOff implements ActionListener {
                        public void actionPerformed(ActionEvent event) {
                                for (int row = 0; row < 5; row++) {
                                        for (int col = 0; col < 5; col++) {
                                                allLightTiles[row][col].allOff();
                                        }

                                }

                        }
                }

                ActionListener blackout = new turnAllOff();
                turnAllOffButton.addActionListener(blackout);

                // this inner class will help manipulate the new game button to result different
                // patterns

                class newGame implements ActionListener {
                        public void actionPerformed(ActionEvent event) {
                                for (int row = 0; row < 5; row++) {

                                        // the two resulting random integers below, are generated at each row.
                                        // we use these integers to mark columns, and therefore specific cells that we
                                        // want lights on at.

                                        int columnIndentifier1 = RANDOM_NUMBER_GENERATOR.nextInt(5);
                                        int columnIndetifier2 = RANDOM_NUMBER_GENERATOR.nextInt(5);

                                        for (int col = 0; col < 5; col++) {
                                                allLightTiles[row][col].allOff(); // turn everything off first.

                                                // now, at every row turn two cells on
                                                allLightTiles[row][columnIndentifier1].reset();
                                                allLightTiles[row][columnIndetifier2].reset();

                                        }

                                }

                        }
                }

                ActionListener freshStart = new newGame();
                newGameButton.addActionListener(freshStart);

                // THE FOLLOWING INNERCLASS HELPS MYSTERY BUTTON 1 turns these lightbulbs into
                // LEDs with different colored lights emitted
                // The abbrreviation LD on the lighttiles means Light Emitting diodes (LEDs)

                class lightsOn implements ActionListener {
                        public void actionPerformed(ActionEvent event) {

                                // store a range of color objects in an arrayList

                                for (int row = 0; row < 5; row++) {
                                        for (int col = 0; col < 5; col++) {

                                                allLightTiles[row][col].turn_to_LED();

                                        }

                                }

                        }
                }

                ActionListener allOn = new lightsOn();
                mysteryButton1.addActionListener(allOn);

        }

        // This will help with timing purposes esp with Mystery 1 Button.
        public static void pause(int pauseTime) {
                try {
                        Thread.sleep(pauseTime);
                } catch (InterruptedException ex) {
                        Thread.currentThread().interrupt();
                }
        }

        /**
         * Initializes neighboring LightTiles.
         * 
         */
        private void initNeighbors() {
                /*
                 * Begin neighbors set-up - don't modify
                 */
                LightTile[][] board = {
                                { jButton1, jButton2, jButton3, jButton4, jButton5 },
                                { jButton6, jButton7, jButton8, jButton9, jButton10 },
                                { jButton11, jButton12, jButton13, jButton14, jButton15 },
                                { jButton16, jButton17, jButton18, jButton19, jButton20 },
                                { jButton21, jButton22, jButton23, jButton24, jButton25 },
                };

                allLightTiles = board;

                int[][] possibleMoves = {
                                { -1, 0 },
                                { -1, 1 },
                                { -1, -1 },
                                { 1, -1 },
                                { 1, 0 },
                                { 1, 1 },
                                { 0, 1 },
                                { 0, -1 }
                };
                for (int row = 0; row < 5; row++) {
                        for (int col = 0; col < 5; col++) {
                                // add neighbors to this tile
                                for (int[] move : possibleMoves) {
                                        int x = move[0];
                                        int y = move[1];
                                        int newX = row + x;
                                        int newY = col + y;
                                        if (newX < 5 && newX >= 0 && newY < 5 && newY >= 0) {
                                                board[row][col].addNeighbor(board[newX][newY]);
                                        }
                                }
                        }
                }
                /*
                 * End neighbors set-up - don't modify
                 */

                // now add the actionListeners!
                for (int row = 0; row < 5; row++) {
                        for (int col = 0; col < 5; col++) {
                                // construct a new press listener and link it to this button

                                ActionListener three = new PressListener(board[row][col]);
                                board[row][col].addActionListener(three);

                        }
                }

        }

        /**
         * randomizes board with new Game,
         * with lights turn on/off at random.
         */

        public void newGame() {
                // you supply code here
        }

        /**
         * Turns all the LightTiles off.
         */
        public void turnAllLightsOff() {
                // you supply code here

        }

        /**
         * Gets things up and running.
         * I wouldn't recommend modifying this main method.
         * 
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(Tester.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Tester.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Tester.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Tester.class.getName()).log(java.util.logging.Level.SEVERE,
                                        null, ex);
                }
                // </editor-fold>

                /* Create and display the form */

                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                try {
                                        UIManager.setLookAndFeel(UIManager.getCrossPlatformLookAndFeelClassName());
                                } catch (Exception e) {
                                        e.printStackTrace();
                                }
                                new Tester().setVisible(true);
                        }
                });
        }

}
