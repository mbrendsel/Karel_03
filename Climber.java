/**
 * A Climber is an Athlete that can also climb up to the right
 * and left as well as climb down to the right and left.
 * 
 * By default, climbers are constructed as athletes; however, 
 * they can also be constructed using a single argument representing 
 * the initial x location; in this case, they begin at the 
 * location (x,0), facing North, with exactly one beeper.
 * 
* @author <...>
* @version <...>
 *
 */

import edu.fcps.karel2.Display;

public class Climber extends Athlete {
	
	public Climber() {
		super();
	}
	
	public Climber(int x) {
		super(x, 1, Display.NORTH, 1);
	}
	
	public void climbUpRight() {
		//TODO Your code goes here
	}
	
	public void climbUpLeft() {
		//TODO Your code goes here
	}
	
	public void climbDownRight() {
		//TODO Your code goes here
	}
	
	public void climbDownLeft() {
		//TODO Your code goes here
	}
}
