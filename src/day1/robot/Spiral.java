package day1.robot;

import org.jointheleague.graphical.robot.Robot;

public class Spiral {

	public static void main(String[] args) {
		
		Robot Vy=new Robot();
		
Vy.penDown();
		
   Vy.setSpeed(10);
		
for (int i = 0; i < 75 ; i++) {
			
	Vy.setRandomPenColor();
			
	Vy.move(5*i);
			
	Vy.turn(360/);
			
	
			// 9. Set the pen width to i
Vy.setPenWidth(i);
	}
}
}