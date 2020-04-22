package _09_obedient_robot;

import java.awt.Color;

import javax.swing.JOptionPane;

import org.jointheleague.graphical.robot.Robot;

public class ObedientRobot {
	/*
	1.This recipe practices writing and calling void methods.
	2.Make a new class, create a main method, and show the robot. 
	3.Have the robot draw a square. 
	4.Put this code into a drawSquare() method. 
	5.Have the robot draw a triangle. 
	6.Put this code into a drawTriangle() method. 
	7.Have the robot draw a circle. 
	8.Put this code into a drawCircle() method. 
	9.Ask the user which shape they want. Draw the appropriate shape depending on their answer (call the right method). 
	10.Ask the user which color they want. Give them some choices so you don't have to accomodate every possible color. Color the the shape depending on their answer. 
	*/
	static Robot robo = new Robot();
	
	public static void main(String[] args) {
		robo.penDown();
		robo.setSpeed(50);
		String shape = JOptionPane.showInputDialog("What shape would you like to draw?\nSquare            Triangle            Circle");
		if (shape.equalsIgnoreCase("square")) {
			drawSquare();
		}else if (shape.equalsIgnoreCase("triangle")) {
			drawTriangle();
		}else {
			drawCircle();
		}
	}
	
	public static void drawSquare() {
		String color = JOptionPane.showInputDialog("What color would you like to use?\nRed      Green      Blue");
		if (color.equalsIgnoreCase("red")) {
			robo.setPenColor(Color.RED);
		}else if (color.equalsIgnoreCase("green")){
			robo.setPenColor(Color.GREEN);
		}else {
			robo.setPenColor(Color.BLUE);
		}
		for (int i = 0; i < 4; i++) {
			robo.move(100);
			robo.turn(90);
		}
	}
	
	public static void drawTriangle() {
		String color1 = JOptionPane.showInputDialog("What color would you like to use?\nRed      Green      Blue");
		if (color1.equalsIgnoreCase("red")) {
			robo.setPenColor(Color.RED);
		}else if (color1.equalsIgnoreCase("green")){
			robo.setPenColor(Color.GREEN);
		}else {
			robo.setPenColor(Color.BLUE);
		}
		for (int j = 0; j < 3; j++) {
			robo.turn(120);
			robo.move(100);
		}
	}
	
	public static void drawCircle() {
		String color2 = JOptionPane.showInputDialog("What color would you like to use?\nRed      Green      Blue");
		if (color2.equalsIgnoreCase("red")) {
			robo.setPenColor(Color.RED);
		}else if (color2.equalsIgnoreCase("green")){
			robo.setPenColor(Color.GREEN);
		}else {
			robo.setPenColor(Color.BLUE);
		}
		for (int b = 0; b < 36; b++) {
			robo.move(10);
			robo.turn(10);
		}
	}
}
