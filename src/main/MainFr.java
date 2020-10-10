package main;

import processing.core.PApplet;

public class MainFr extends PApplet {
	
	Circle circle;
	Rectangle rectangle;
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main("main.MainFr");
	}
	
	
	
	public void settings() {
		size(600,500);
	}
	
	public void setup() {

	}
	
	public void draw() {
		//mueve el punto cero del mapa a la coordenada que quiera
		translate(300,250);
		background(176,224,230);
		rectMode(CENTER);
		//mouseY hace el crecimiento de la figura
		//circleDraw(0,0,mouseY);
		rectangleDraw(0,0,mouseY,0,mouseY/30);
	}
	
	public void circleDraw(int x, int y, float grow) {
		circle = new Circle(x,y,grow,this);
		circle.drawFigure();
	}
	
	public void rectangleDraw(int x, int y, float grow,int imp,float rotate) {
		rectangle = new Rectangle(x,y,grow,this);
		rectangle.drawFigure();
		rectangle.rotateSquare(imp,rotate);
	}
}
