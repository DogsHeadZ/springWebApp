package com.dogshead.domain;

import java.io.Serializable;

public class PositionInfo implements Serializable {

	public static final String TAG="position_info";
	
	private int topX;
	private int topY;
	private int bottomX;
	private int bottomY;
	
	public PositionInfo(){}
	
	public PositionInfo(int topX,int topY,int bottomX,int bottomY){
		this.topX=topX;
		this.topY=topY;
		this.bottomX=bottomX;
		this.bottomY=bottomY;
	}

	/**
	 * @return the topX
	 */
	public int getTopX() {
		return topX;
	}

	/**
	 * @param topX the topX to set
	 */
	public void setTopX(int topX) {
		this.topX = topX;
	}

	/**
	 * @return the topY
	 */
	public int getTopY() {
		return topY;
	}

	/**
	 * @param topY the topY to set
	 */
	public void setTopY(int topY) {
		this.topY = topY;
	}

	/**
	 * @return the bottomX
	 */
	public int getBottomX() {
		return bottomX;
	}

	/**
	 * @param bottomX the bottomX to set
	 */
	public void setBottomX(int bottomX) {
		this.bottomX = bottomX;
	}

	/**
	 * @return the bottomY
	 */
	public int getBottomY() {
		return bottomY;
	}

	/**
	 * @param bottomY the bottomY to set
	 */
	public void setBottomY(int bottomY) {
		this.bottomY = bottomY;
	}

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return TAG;
	}
	
	
}
