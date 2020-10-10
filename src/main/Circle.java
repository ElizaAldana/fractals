package main;

import processing.core.PApplet;

	public class Circle extends FiguresFr {

	PApplet app;

	
	public Circle (int posX, int posY, PApplet app, float grow) {
		super(posX,posY,app, grow);
		this.app = app;
		
	}
	
	public void drawFigure(int x, int y, float grow) {
		app.ellipse(x, y, grow, grow);
		if(grow > 2) {
			grow *= 0.75f;
		drawFigure(x, y, grow);
		  }
}
}