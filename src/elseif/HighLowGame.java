//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0

package elseif;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100.
		int random = new Random().nextInt(101) + 1;
		// 2. Print out the random variable above
		System.out.println(random);
		// 11. Repeat steps 1 to 10 ten times

		// 1. Ask the user for a guess using a pop-up window, and save their response
		String answer = JOptionPane.showInputDialog(null, "What number am i thinking about from 1-100");
		// 4. Convert the answer to an int (Integer.parseInt(string))
		int sn = Integer.parseInt(answer);
		// 5. if the guess is correct
		for (int i = 0; i < 10; i++) {
			if (sn == random) {
				JOptionPane.showMessageDialog(null, "you win");
				// 6. Win
				// 12. Use "System.exit(0);" to quit the game if the user guessed the right
				// answer.
				System.exit(0);
				// 7. if the guess is high
				// 8. Tell them it's too high
			} else if (sn> random) {
			JOptionPane.showInputDialog(null, "Your number is too high. Try again");  
			} else if (sn< random) {
				JOptionPane.showInputDialog(null, "Your number is too low. Try Again");
				// 9. if the guess is low
			} // 10. Tell them it's too low
		}
	} // 13. Tell them they lose
}
