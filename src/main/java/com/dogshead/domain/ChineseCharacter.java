package com.dogshead.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "chinesecharacter")
public class ChineseCharacter implements Serializable {
	public static final String TAG="Chinese_character";
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int characterId;
	private String label;
	private String filePath;
	private int strokeNum;
	private String structure;
	private int topId;
	private int leftId;
	private int centerId;
	private int rightId;
	private int bottomId;
	private String strokeOrder;
	private int type;
	private int width;
	private int height;
	private String strokes;
	
	public ChineseCharacter(){}
	
	private ChineseCharacter(Builder builder){
		this.characterId=builder.characterId;
		this.label=builder.label;
		this.filePath=builder.filePath;
		this.strokeNum=builder.strokeNum;
		this.structure=builder.structure;
		this.topId=builder.topId;
		this.leftId=builder.leftId;
		this.centerId=builder.centerId;
		this.rightId=builder.rightId;
		this.bottomId=builder.bottomId;
		this.strokeOrder=builder.strokeOrder;
		this.type=builder.type;
		this.width=builder.width;
		this.height=builder.height;
		this.strokes=builder.strokes;
		
	}
	
	public static class Builder{
		private int characterId=0;
		private String label="";
		private String filePath="";
		private int strokeNum=0;
		private String structure="";
		private int topId=0;
		private int leftId=0;
		private int centerId=0;
		private int rightId=0;
		private int bottomId=0;
		private String strokeOrder="";
		private int type=0;
		private int width=0;
		private int height=0;
		private String strokes="";
		
		public Builder(){}
		public Builder characterId(int characterId){
			this.characterId=characterId;
			return this;
		}
		
		public Builder label(String label){
			this.label=label;
			return this;
		}
		
		public Builder filePath(String filePath){
			this.filePath=filePath;
			return this;
		}
		
		public Builder strokeNum(int strokeNum){
			this.strokeNum=strokeNum;
			return this;
		}
		
		public Builder structure(String structure){
			this.structure=structure;
			return this;
		}
		
		public Builder topId(int topId){
			this.topId=topId;
			return this;
		}
		
		public Builder leftId(int leftId){
			this.leftId=leftId;
			return this;
		}
		
		public Builder centerId(int centerId){
			this.centerId=centerId;
			return this;
		}
		
		public Builder rightId(int rightId){
			this.rightId=rightId;
			return this;
		}
		
		public Builder bottomId(int bottomId){
			this.bottomId=bottomId;
			return this;
		}
		
		public Builder strokeOrder(String strokeOrder){
			this.strokeOrder=strokeOrder;
			return this;
		}
		
		public Builder type(int type){
			this.type=type;
			return this;
		}
		
		public Builder width(int width){
			this.width=width;
			return this;
		}
		
		public Builder height(int height){
			this.height=height;
			return this;
		}
		
		public Builder strokes(String strokes){
			this.strokes=strokes;
			return this;
		}
		
		public ChineseCharacter build(){
			return new ChineseCharacter(this);
		}
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
	
	public String getFilePath() {
		return filePath;
	}

	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	
	/**
	 * @return the strokeNum
	 */
	public int getStrokeNum() {
		return strokeNum;
	}
	/**
	 * @param strokeNum the strokeNum to set
	 */
	public void setStrokeNum(int strokeNum) {
		this.strokeNum = strokeNum;
	}
	/**
	 * @return the structure
	 */
	public String getStructure() {
		return structure;
	}
	/**
	 * @param structure the structure to set
	 */
	public void setStructure(String structure) {
		this.structure = structure;
	}
	/**
	 * @return the topId
	 */
	public int getTopId() {
		return topId;
	}
	/**
	 * @param topId the topId to set
	 */
	public void setTopId(int topId) {
		this.topId = topId;
	}
	/**
	 * @return the leftId
	 */
	public int getLeftId() {
		return leftId;
	}
	/**
	 * @param leftId the leftId to set
	 */
	public void setLeftId(int leftId) {
		this.leftId = leftId;
	}
	/**
	 * @return the centerId
	 */
	public int getCenterId() {
		return centerId;
	}
	/**
	 * @param centerId the centerId to set
	 */
	public void setCenterId(int centerId) {
		this.centerId = centerId;
	}
	/**
	 * @return the rightId
	 */
	public int getRightId() {
		return rightId;
	}
	/**
	 * @param rightId the rightId to set
	 */
	public void setRightId(int rightId) {
		this.rightId = rightId;
	}
	/**
	 * @return the bottomId
	 */
	public int getBottomId() {
		return bottomId;
	}
	/**
	 * @param bottomId the bottomId to set
	 */
	public void setBottomId(int bottomId) {
		this.bottomId = bottomId;
	}
	/**
	 * @return the strokeOrder
	 */
	public String getStrokeOrder() {
		return strokeOrder;
	}
	/**
	 * @param strokeOrder the strokeOrder to set
	 */
	public void setStrokeOrder(String strokeOrder) {
		this.strokeOrder = strokeOrder;
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
	 * @return the width
	 */
	public int getWidth() {
		return width;
	}
	/**
	 * @param width the width to set
	 */
	public void setWidth(int width) {
		this.width = width;
	}
	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}
	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * @return the strokes
	 */
	public String getStrokes() {
		return strokes;
	}
	/**
	 * @param strokes the strokes to set
	 */
	public void setStrokes(String strokes) {
		this.strokes = strokes;
	}
	/**
	 * @return the tag
	 */
	public static String getTag() {
		return TAG;
	}
	
	
	
	
	

}
