package day2;

import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class MyFirstJavaProgram {
	
	public static void main(String[] args) {
		
		// START HERE
		System.out.println("Hello World!");
		Robot hello = new Robot();
		hello.setPenColor(32, 56, 237);
		hello.penDown();
		hello.move(100);
		hello.turn(90);
		hello.move(100);
		hello.turn(90);
		hello.move(100);
		hello.turn(90);
		hello.move(100);
		hello.turn(90);
		hello.penUp();
		hello.move(-100);
	
		
		
	}
}
