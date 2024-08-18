
/**
 * Objects of this class simulate a car with two sliding doors on the right and left side of the car
 * that can be oppened from the outside and 
 * inside and with a dahsboard button.
 * @author lmagak 
 */

public class CarDoorConfiguration {
    /*
     * declaration of instance variables for security lock
     * child lock and
     * gear
     */

    private boolean securityLockActivated;
    private boolean childLockActivated;
    private String gear;

    /**
     * Acceptable user commands. We will call them actions here
     * actionOne stores string equivalent of a command to open the left door from the dashboard.
     * actionTwo stores string equivalent of command to open the right door from the dahsboard
     * actionThree stores string equivalent of a commamand to open left door from outside
     * actionFour stores string equivalent of a command to open the right door from outside
     * actionFive stores string equivalent of a command to open the left door from inside
     * actionsix stores string equivalent of a command to open the right door from inside  
     */

    String actionOne = "leftdashboard";
    String actionTwo = "rightdashboard";
    String actionThree = "leftoutside";
    String actionFour = "rightoutside";
    String actionFive = "leftinside";
    String actionSix = "rightinside";


    /**
     * Handling extreme situations from users 
     * motionError_D handles open door requests when vehicle is on drive
     * motionError_N handles open door requests when t he vehicle is on neutral
     * motionError_R handles open door requests when vehicle is on reverse
     * gearError handles absurd gear inputs 
     * sourceError handles absurd open door actions (commands)
     */
    
    String motionError_D ="Your vehicle is on drive. Stop the car and try again ";
    String motionError_N= "Too dangerous to open any door on Neutrol.Get car to packing mode and try again";
    String motionError_R= "Your car is moving backwards. Get car on Park mode and try again";
    String gearError = "The chosen gear doesn't exist.Consider N, D, P or R";
    String sourceError = "We do not recognise the source of this 'open door' command. Ensure no capital letters, and that your command words are either left, right, dashboard, outside or inside"; 



    /**
     * Responces to legal door status inquiry 
     * notif_1 left door open right door closed
     * notif_2 right door open left door closed
     * notif_3 Both doors closed
     */

    String notif_1= "left door open right door closed";
    String notif_2= "right door open left door closed";
    String notif_3= "Both doors Closed";
    



    /**
     * Legal  gear mode inputs 
     * gearMode1 stores park mode     P
     * gearMode2 stores drive mode    D
     * gearMode3 stores neutral mode  N
     * gearMode4 stores  reverse mode R            
     */

    public static final String gearMode1 = "P"; // Park
    public static final String gearMode2 = "D";
    public static final String gearMode3 = "N";
    public static final String gearMode4 = "R";

    /**
     * 
     * @param securityStatus  rue for activated security status and False for deactivated status
     * @param childStatus true for childlock on and false for childlock off
     * @param gearStatus   the status with regards to motion that the user will input
     */
    public CarDoorConfiguration(boolean securityStatus, boolean childStatus, String gearStatus) {

        securityLockActivated = securityStatus;
        childLockActivated = childStatus;
        gear = gearStatus;

    }

    /**
     *This method enables user to input their car door security status
     child lock and gearmode status 
     */
    public void setConfiguration(boolean securityStatus, boolean childStatus, String gearStatus) {

    }

    /**
     * 
     * @param side left door or right door 
     * @param source where is the command coming from
     * @return source. This didn't sense to me. The method would still work the same if void. Ill need to ask Dr.Axvig
     */
    public String getStatus (String side, String source)
    {

    if (gear.equals(gearMode1))
    {
        String grandInput= side+source;
        String doorStatus;

        //shift one 

        if (actionOne.equals(grandInput) && (childLockActivated) && (securityLockActivated))
        {
            doorStatus=  notif_1;
            System.out.println (doorStatus);
        
        }
        else if (actionTwo.equals(grandInput) && (childLockActivated) && (securityLockActivated) ) 
        {
            doorStatus= notif_2;
            System.out.println(doorStatus);

        }

        else if (actionThree.equals(grandInput) && (childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }
        
        else if (actionFour.equals(grandInput) && (childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        else if (actionFive.equals(grandInput) && (childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        else if (actionSix.equals(grandInput) && (childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        // shift two

        else if (actionOne.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_1; 
           System.out.println (doorStatus);
        }

        else if (actionTwo.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_2; 
           System.out.println (doorStatus);
        }

         else if (actionThree.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3;
           System.out.println (doorStatus);
        }


        else if (actionFour.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        else if (actionFive.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_1; 
           System.out.println (doorStatus);
        }

        else if (actionSix.equals(grandInput) && (!childLockActivated) && (securityLockActivated))
        {  

           doorStatus= notif_2; 
           System.out.println (doorStatus);
        }


        // shift three

        else if (actionOne.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_1; 
           System.out.println (doorStatus);
        }

        else if (actionTwo.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_2; 
           System.out.println (doorStatus);
        }
       
         else if (actionThree.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_1; 
           System.out.println (doorStatus);
        }

        else if (actionFour.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_2; 
           System.out.println (doorStatus);
        }

        else if (actionFive.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        else if (actionSix.equals(grandInput) && (childLockActivated) && (!securityLockActivated))
        {  

           doorStatus= notif_3; 
           System.out.println (doorStatus);
        }

        //shift four 

        else if (actionOne.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_1;
            System.out.println (doorStatus);
        }

        else if (actionTwo.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_2;
            System.out.println (doorStatus);
        }

        else if (actionThree.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_1;
            System.out.println (doorStatus);
        }

        else if (actionFour.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_2;
            System.out.println (doorStatus);
        }

        else if (actionFive.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_1;
            System.out.println (doorStatus);
        }

        else if (actionSix.equals(grandInput) && (!childLockActivated) && (!securityLockActivated))
        {
            doorStatus=notif_2;
            System.out.println (doorStatus);

        }

        //shift five

        else if (!grandInput.equals(actionOne) || (!grandInput.equals (actionTwo) || (!grandInput.equals(actionThree) ||(!grandInput.equals(actionFour) ||(!grandInput.equals(actionFive) ||(!grandInput.equals(actionSix)))))))
        {
            doorStatus= sourceError;
            System.out.println (doorStatus);
        }

        
    }

    //shift six

    else if (gear.equals(gearMode2))
    {
            System.out.println (motionError_D);
        
    }

     else if (gear.equals(gearMode3))
    {
            System.out.println (motionError_N);
        
    }

     else if (gear.equals(gearMode4))
    {
            System.out.println (motionError_R);
        
    }

    else 
    {
        System.out.println(gearError);
    }

    //shift seven 

   return source; 
}
}
