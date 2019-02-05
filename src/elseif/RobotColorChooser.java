//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class RobotColorChooser {
	public static void main(String[] args) {
		//1. Create a new Robot
		Robot elle=new Robot();
		//3. Ask the user what color they would like the robot to draw
		String a=JOptionPane.showInputDialog(null, " With what color do you want your robot to draw? ");
		//5. Use an if/else statement to set the pen color that the user requested
if(a.equals("red")) {
	elle.setPenColor(Color.RED);
}
else if(a.equals("blue")) {
   elle.setPenColor(Color.BLUE); 
}
else if (a.equals("pink")) {
	elle.setPenColor(Color.PINK);
}
else if (a.equals("yellow")) {
	elle.setPenColor(Color.YELLOW);
}
else if (a.equals("orange")) {
	elle.setPenColor(Color.ORANGE);
}
//6. If the user doesn’t enter anything, choose a random color

        //7. Put a loop around your code so that you keep asking the user for more colors & drawing them
		
		//4. Set the pen width to 10
		elle.setPenWidth(10);
	    //2. Make the robot draw a shape (this will take more than one line of code)
		elle.penDown();
		elle.setSpeed(100);
		elle.move(100);
        elle.setAngle(90);
        elle.move(100);
       elle.turn(90);
        elle.move(100);
        elle.turn(90);
        elle.move(100);
	}
}
