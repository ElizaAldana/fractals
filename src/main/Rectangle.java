package main;

import processing.core.PApplet;

public class Rectangle extends FiguresFr{

	
	PApplet app;
	
	
	public Rectangle(int x, int y, PApplet app, float grow) {
		super(x,y,app,grow);
		this.app = app;
		
	}

	public void drawFigure(int x, int y, float grow) {
		app.rect(x, y, grow, grow);
		if(grow > 2) {
			grow *= 0.75f;
		drawFigure(x, y, grow);
		  }
}
}
