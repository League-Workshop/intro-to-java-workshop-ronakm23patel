package section2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
	Robot jr = new Robot();
	jr.penDown();
	jr.setPenColor(Color.BLUE);
	jr.setSpeed(200);
	for (int i=0; i<4; i++) {
	jr.move(200);
	jr.turn(90);
	}
	}
}
