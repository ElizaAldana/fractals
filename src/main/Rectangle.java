package main;

import processing.core.PApplet;

public class Rectangle extends FiguresFr implements Control{

	
	PApplet app;
	
	
	public Rectangle(int x, int y, float grow,PApplet app) {
		super(x,y,grow,app);
		this.app = app;
		
	}

	public void drawFigure() {
		app.rect(x, y, grow, grow);
		if(grow > 2) {
			grow *= 0.75f;
		drawFigure();
		  }
		
	}
	
	public void rotateSquare(int imp,float rotate) {
		//evalua si es par o impar
		if(imp%2==0) {
			app.rotate(rotate*15);
			drawFigure();
			app.rotate(rotate*-15);
		}else{
			drawFigure();
		}
		imp = imp+1;
		if(grow>2) {
			rotateSquare(imp,rotate);
		}
		}


	
}
