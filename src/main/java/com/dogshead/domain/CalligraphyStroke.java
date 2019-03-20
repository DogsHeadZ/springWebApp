package com.dogshead.domain;

import java.io.Serializable;

public class CalligraphyStroke implements Serializable {

	public static final String TAG="calligraphy_stroke";
	
	private int strokeId;
	private int type;
	private String filePath;
	private PositionInfo positionInfo;
	private String author;
	private String work;
	private int charWidth;
	private int charHeight;
	
	public CalligraphyStroke(){}
	
	private CalligraphyStroke(Builder builder){
		this.strokeId=builder.strokeId;
		this.type=builder.type;
		this.filePath=builder.filePath;
		this.positionInfo=builder.positionInfo;
		this.author=builder.author;
		this.work=builder.work;
		this.charHeight=builder.charHeight;
		this.charWidth=builder.charWidth;
	}
	
	public static class Builder{
		private int strokeId=0;
		private int type=0;
		private String filePath="";
		private PositionInfo positionInfo=null;
		private String author="";
		private String work="";
		private int charWidth=0;
		private int charHeight=0;
		
		public Builder(){}
		
		public Builder strokeId(int strokeId){
			this.strokeId=strokeId;
			return this;
		}
		
		public Builder type(int type){
			this.type=type;
			return this;
		}
		
		public Builder filePath(String filePath){
			this.filePath=filePath;
			return this;
		}
		
		public Builder positionInfo(PositionInfo positionInfo){
			this.positionInfo=positionInfo;
			return this;
		}
		
		public Builder author(String author){
			this.author=author;
			return this;
		}
		
		public Builder work(String work){
			this.work=work;
			return this;
		}
		
		public Builder charWidth(int charWidth){
			this.charWidth=charWidth;
			return this;
		}
		
		public Builder charHeight(int charHeight){
			this.charHeight=charHeight;
			return this;
		}
		
		public CalligraphyStroke build(){
			return new CalligraphyStroke(this);
		}
	}

	/**
	 * @return the strokeId
	 */
	public int getStrokeId() {
		return strokeId;
	}

	/**
	 * @param strokeId the strokeId to set
	 */
	public void setStrokeId(int strokeId) {
		this.strokeId = strokeId;
	}

	/**
	 * @return the type
	 */
	public int getType() {
		return type;
	}

	/**
	 * @param type the type to set
	 */
	public void setType(int type) {
		this.type = type;
	}

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}

	/**
	 * @return the positionInfo
	 */
	public PositionInfo getPositionInfo() {
		return positionInfo;
	}

	/**
	 * @param positionInfo the positionInfo to set
	 */
	public void setPositionInfo(PositionInfo positionInfo) {
		this.positionInfo = positionInfo;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the work
	 */
	public String getWork() {
		return work;
	}

	/**
	 * @param work the work to set
	 */
	public void setWork(String work) {
		this.work = work;
	}

	/**
	 * @return the charWidth
	 */
	public int getCharWidth() {
		return charWidth;
	}

	/**
	 * @param charWidth the charWidth to set
	 */
	public void setCharWidth(int charWidth) {
		this.charWidth = charWidth;
	}

	/**
	 * @return the charHeight
	 */
	public int getCharHeight() {
		return charHeight;
	}

	/**
	 * @param charHeight the charHeight to set
	 */
	public void setCharHeight(int charHeight) {
		this.charHeight = charHeight;
	}

	/**
	 * @return the tag
	 */
	public static String getTag() {
		return TAG;
	}
	
}
