/**
 * A Climber is an Athlete that can also climb up to the right
 * and left as well as climb down to the right and left.
 * 
 * By default, climbers are constructed as athletes; however, 
 * they can also be constructed using a single argument representing 
 * the initial x location; in this case, they begin at the 
 * location (x,0), facing North, with exactly one beeper.
 * 
* @Monica
* @11/25/14
 *
 */

public class Climber extends Athlete 
{
   public Climber()
  {
   super(8, 1, Display.NORTH, 1);
  }
   public Climber(int x, int y, int dir, int beep)
  {
   super(x, y, dir, beep);
  }
   public void climbUpLeft()
  {
   move();
   move();
   turnLeft();
   move();
   turnRight();
  }
   public void climbDownLeft()
  {
   turnRight();
   move();
   turnLeft();
   move();
   move();
  }
   public void climbUpRight()
  {
   move();
   move();
   turnRight();
   move();
   turnLeft();
  }
   public void climbDownRight()
  {
   turnLeft();
   move();
   turnRight();
   move();
   move();
  }
  
}
