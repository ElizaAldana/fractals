package main;

import processing.core.PApplet;

public abstract class FiguresFr {

	
	PApplet app;
	private int x;
	private int y;
	private float grow;
	
	public FiguresFr (int x, int y, PApplet app, float grow) {
	this.app = app;
	this.x = x;
	this.y = y;
	this.grow = grow;
	}

	protected abstract void drawFigure(int x, int y, float grow);

	
	public int getX() {
		return x;
	}


	public void setX(int x) {
		this.x = x;
	}


	public int getY() {
		return y;
	}


	public void setY(int y) {
		this.y = y;
	}


	public float getGrow() {
		return grow;
	}


	public void setGrow(float grow) {
		this.grow = grow;
	}

	
	
}
