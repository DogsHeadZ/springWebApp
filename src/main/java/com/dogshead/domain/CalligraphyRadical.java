package com.dogshead.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CalligraphyRadical implements Serializable {

	public static final String TAG="calligraphy_radical";
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int radicalId;
	private String label;
	private String calligraphyCharacter;
	private String filePath;
	private String position;
	private String polygon;
	private ChineseRadical chineseRadical;
	private PositionInfo positionInfo;
	private int priority;
	private String author;
	private String work;
	private int charWidth;
	private int charHeight;
	
	public CalligraphyRadical(){}
	
	private CalligraphyRadical(Builder builder){
		this.radicalId=builder.radicalId;
		this.label=builder.label;
		this.calligraphyCharacter=builder.calligraphyCharacter;
		this.filePath=builder.filePath;
		this.position=builder.position;
		this.polygon=builder.polygon;
		this.chineseRadical=builder.chineseRadical;
		this.positionInfo=builder.positionInfo;
		this.priority=builder.priority;
		this.author=builder.author;
		this.work=builder.work;
		this.charWidth=builder.charWidth;
		this.charHeight=builder.charHeight;
	}
	
	public static class Builder{
		private int radicalId=0;
		private String label="";
		private String calligraphyCharacter="";
		private String filePath="";
		private String position="";
		private String polygon="";
		private ChineseRadical chineseRadical=null;
		private PositionInfo positionInfo=null;
		private int priority=-1;
		private String author="";
		private String work="";
		private int charWidth=0;
		private int charHeight=0;
		
		public Builder(){}
		
		public Builder radicalId(int radicalId){
			this.radicalId=radicalId;
			return this;
		}
		
		public Builder label(String label){
			this.label=label;
			return this;
		}
		
		public Builder character(String calligraphyCharacter){
			this.calligraphyCharacter=calligraphyCharacter;
			return this;
		}
		
		public Builder filePath(String filePath){
			this.filePath=filePath;
			return this;
		}
		
		public Builder position(String position){
			this.position=position;
			return this;
		}
		
		public Builder polygon(String polygon){
			this.polygon=polygon;
			return this;
		}
		
		public Builder chineseRadical(ChineseRadical chineseRadical){
			this.chineseRadical=chineseRadical;
			return this;
		}
		
		public Builder positionInfo(PositionInfo positionInfo){
			this.positionInfo=positionInfo;
			return this;
		}
		
		public Builder priority(int priority){
			this.priority=priority;
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
		
		public CalligraphyRadical build(){
			return new CalligraphyRadical(this);
		}
	}

	public String translateFilepath(){
		if(filePath==null||filePath.length()<8)return filePath;
		String bookId=filePath.substring(0, 8);
		String dir=bookId+"_e";
		String file=filePath.substring(8);
		return bookId+"/"+dir+"/"+file;
	} 
	
	/**
	 * @return the chineseRadical
	 */
	public ChineseRadical getChineseRadical() {
		return chineseRadical;
	}

	/**
	 * @param chineseRadical the chineseRadical to set
	 */
	public void setChineseRadical(ChineseRadical chineseRadical) {
		this.chineseRadical = chineseRadical;
	}

	/**
	 * @return the priority
	 */
	public int getPriority() {
		return priority;
	}

	/**
	 * @param priority the priority to set
	 */
	public void setPriority(int priority) {
		this.priority = priority;
	}

	/**
	 * @return the radicalId
	 */
	public int getRadicalId() {
		return radicalId;
	}

	/**
	 * @param radicalId the radicalId to set
	 */
	public void setRadicalId(int radicalId) {
		this.radicalId = radicalId;
	}

	/**
	 * @return the label
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label the label to set
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return the character
	 */
	
	

	/**
	 * @return the filePath
	 */
	public String getFilePath() {
		return filePath;
	}

	public String getCalligraphyCharacter() {
		return calligraphyCharacter;
	}

	public void setCalligraphyCharacter(String calligraphyCharacter) {
		this.calligraphyCharacter = calligraphyCharacter;
	}

	/**
	 * @param filePath the filePath to set
	 */
	public void setFilePath(String filePath) {
		this.filePath = filePath;
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
	 * @return the polygon
	 */
	public String getPolygon() {
		return polygon;
	}

	/**
	 * @param polygon the polygon to set
	 */
	public void setPolygon(String polygon) {
		this.polygon = polygon;
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
