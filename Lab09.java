/**
 * A robot moves along a row, collecting piles of beepers and placing them one square to
 * the right.
 * 
 * @author <...>
 * @version <...>
 *
 */

import edu.fcps.karel2.Display; 
import javax.swing.JOptionPane;

public class Lab09 {
	 
	 public static void main(String[] args) {
		 String map = JOptionPane.showInputDialog("Which map?");
		 Display.openWorld("maps/"+map+".map");
		 Display.setSize(10, 10);
		 Athlete athena = new Athlete(1, 1, Display.EAST, 0);
       
       int count1 = 0;
   
   while (athena.frontIsClear()&&!athena.nextToABeeper()){
      athena.move();
	 }
   while (athena.frontIsClear()&&athena.nextToABeeper()){
      athena.pickBeeper();
      count1++;
      }
 }
 }