package com.dogshead.domain;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class LogInfo implements Serializable {

	public static final String TAG="log_info";
	
	private int infoId;
	private int characterId;
	private Point point;
	private ArrayList<Point> polygon;
	private String position;
	private String time;
	private String deviceId;
	private float scale;
	private int offsetX;
	private int offsetY;
	
	public LogInfo(){
		SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date=new Date();
		time=format.format(date);
	}
	
	private LogInfo(Builder builder){
		SimpleDateFormat format=new SimpleDateFormat("yyyy.MM.dd HH:mm:ss");
		Date date=new Date();
		time=format.format(date);
		this.infoId=builder.infoId;
		this.characterId=builder.characterId;
		this.point=builder.point;
		this.polygon=builder.polygon;
		this.position=builder.position;
		this.deviceId=builder.deviceId;
		this.scale=builder.scale;
		this.offsetX=builder.offsetX;
		this.offsetY=builder.offsetY;
	}
	
	public static class Builder{
		private int infoId=0;
		private int characterId=0;
		private Point point;
		private ArrayList<Point> polygon=null;
		private String position="";
		private String deviceId="";
		private float scale=1f;
		private int offsetX=0;
		private int offsetY=0;
		
		public Builder(){}
		
		public Builder infoId(int infoId){
			this.infoId=infoId;
			return this;
		}
		
		public Builder characterId(int characterId){
			this.characterId=characterId;
			return this;
		}
		
		public Builder point(Point point){
			this.point=point;
			return this;
		}
		
		public Builder polygon(ArrayList<Point> polygon){
			this.polygon=polygon;
			return this;
		}
		
		public Builder position(String position){
			this.position=position;
			return this;
		}
		
		public Builder deviceId(String deviceId){
			this.deviceId=deviceId;
			return this;
		}
		
		public Builder scale(float scale){
			this.scale=scale;
			return this;
		}
		
		public Builder offsetX(int offsetX){
			this.offsetX=offsetX;
			return this;
		}
		
		public Builder offsetY(int offsetY){
			this.offsetY=offsetY;
			return this;
		}
		
		public LogInfo build(){
			return new LogInfo(this);
		}
	}

	/**
	 * @return the infoId
	 */
	public int getInfoId() {
		return infoId;
	}

	/**
	 * @param infoId the infoId to set
	 */
	public void setInfoId(int infoId) {
		this.infoId = infoId;
	}

	/**
	 * @return the characterId
	 */
	public int getCharacterId() {
		return characterId;
	}

	/**
	 * @param characterId the characterId to set
	 */
	public void setCharacterId(int characterId) {
		this.characterId = characterId;
	}

	

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the deviceId
	 */
	public String getDeviceId() {
		return deviceId;
	}

	/**
	 * @param deviceId the deviceId to set
	 */
	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return TAG;
	}

	public ArrayList<Point> getPolygon() {
		return polygon;
	}

	public void setPolygon(ArrayList<Point> polygon) {
		this.polygon = polygon;
	}

	public float getScale() {
		return scale;
	}

	public void setScale(float scale) {
		this.scale = scale;
	}

	public int getOffsetX() {
		return offsetX;
	}

	public void setOffsetX(int offsetX) {
		this.offsetX = offsetX;
	}

	public int getOffsetY() {
		return offsetY;
	}

	public void setOffsetY(int offsetY) {
		this.offsetY = offsetY;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
