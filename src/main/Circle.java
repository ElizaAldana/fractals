package main;

import processing.core.PApplet;

	public class Circle extends FiguresFr {

	PApplet app;

	
	public Circle (int x, int y, float grow, PApplet app) {
		super(x,y,grow,app);
		this.app = app;
		
	}
	
	public void drawFigure() {
		app.ellipse(x, y, grow, grow);
		if(grow > 2) {
			grow *= 0.75f;
		drawFigure();
		  }
}


}