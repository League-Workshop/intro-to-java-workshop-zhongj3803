package day2;

import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;

public class FourSquare {
	
	// 2. Create a new Robot
	Robot lol = new Robot();

	void go() {
		// 4. Make the robot move as fast as possible
lol.setSpeed(1000000000);
		// 5. Set the pen width to 5
lol.setPenWidth(5);
		// 6. Do steps #7 to #8 four times...
for (int i = 0; i < 4; i++) {
	
			// 7. Set the pen color to random
	lol.setRandomPenColor();
			// 1. Call the drawSquare() method
		drawSquare();
	
			// 8. Turn the robot 90 degrees to the right
		lol.turn(90);
	}
	}

	/* 3. Fill in the code to draw a square inside the method below. */
	void drawSquare() {
		lol.penDown();
		for (int i = 0; i < 4; i++) {
			lol.move(100);
			lol.turn(90);
		}
	
		
		

		
		
	}

	public static void main(String[] args) {
		new FourSquare().go();
	}

}



