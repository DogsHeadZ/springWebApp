package com.dogshead.domain;

import java.io.Serializable;

public class Point implements Serializable {

	public static final String TAG="point";
	
	private int x;
	private int y;
	
	public Point(int x,int y){
		this.x=x;
		this.y=y;
	}
	
	public Point(){
		x=0;
		y=0;
	}

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

	public static String getTag() {
		return TAG;
	}
	
	
}
