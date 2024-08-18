
/**
 * this class will test the elements of our carDoorConfiguration class.
 * 
 * @author lmagak
 */

public class carDoorTest {
        /**
         * The main method calls some methods of the carDoorConfiguration class
         * to see whether they are working properly.
         * 
         * @param args the command line arguments
         */

        public static void main(String[] args) {

                // check to see doorstatus when getStatus method is called on park

                // both security and child lock activated, command on left from dahsboard
                CarDoorConfiguration car1 = new CarDoorConfiguration(true, true, "P");
                car1.getStatus("left", "dashboard");
                System.out.println(
                                "Left door for car1 should open since the command is from the dashboard and the vehicle is in Park mode");

                // both security and child lock deactivated, command on right from outside
                CarDoorConfiguration car2 = new CarDoorConfiguration(false, false, "P");
                car2.getStatus("right", "outside");
                System.out.println(
                                "Right door should open from outside, while left remains closed, since car2 has security status deactivated");

                // securitylock deactivated, childlock activated, command on left from inside
                CarDoorConfiguration car3 = new CarDoorConfiguration(false, true, "P");
                car3.getStatus("left", "inside");
                System.out.println(
                                "Both doors should remain closed since the command to open left door from inside is inhibited by activated childlock");

                System.out.println("\n");
                // securitylock activated, childlock deactivated, command on right from outside
                CarDoorConfiguration car4 = new CarDoorConfiguration(true, false, "P");
                car4.getStatus("right", "outside");
                System.out.println(
                                "Both doors should remain closed since the command to open right door from outside is inhibited by activated security lock");

                System.out.println("\n");

                // check to see door status when vehicle not in park.
                CarDoorConfiguration car5 = new CarDoorConfiguration(true, false, "N");
                car5.getStatus("right", "dashboard");
                System.out.println("Doors should not open in Neutrol gear mode.There should be an error message");

                System.out.println("\n");
                // check to see door status when vehicle has a ridiculous entry as gear mode.
                CarDoorConfiguration car6 = new CarDoorConfiguration(false, true, "Kenya");
                car6.getStatus("left", "inside");
                System.out.println("there should be an error message denouncing the entry");

        }

}
