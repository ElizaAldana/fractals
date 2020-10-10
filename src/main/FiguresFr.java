package main;

import processing.core.PApplet;

public abstract class FiguresFr {

	
	PApplet app;
	public int x;
	public int y;
	public float grow;
	
	public FiguresFr (int x, int y, float grow, PApplet app) {
	this.app = app;
	this.x = x;
	this.y = y;
	this.grow = grow;
	}

	protected abstract void drawFigure();



	public float getGrow() {
		return grow;
	}


	public void setGrow(float grow) {
		this.grow = grow;
	}

	
	
}
