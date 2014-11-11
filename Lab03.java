/**
*
* Two climbers navigate a mountain to bring treasure back to base
* 
* @author Kent Collins
* @version 11 November, 2014
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Lab03 {

     public static void main(String[] args) {
    	 	Display.openWorld("maps/mountain.map");
    	 	Display.setSize(16, 16);
    	 	// Complete solution would involve two climbers
        Climber c = new Climber(8);
        c.putBeeper();
        c.turnRight();
        c.move();
        c.climbUpRight();
        c.climbUpRight();
        c.climbUpRight();
        c.climbDownRight();
        c.climbDownRight();
        c.pickBeeper();
        c.turnAround();
        c.climbUpLeft();
        c.climbUpLeft();
        c.climbDownLeft();
        c.climbDownLeft();
        c.climbDownLeft();
        c.move();
        c.putBeeper();
        c.move();
     }
}
