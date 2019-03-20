package com.dogshead.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
public class ChineseRadical implements Serializable {

	public static final String TAG="Chinese_radical";
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int radicalId;
	private String label;
	private String chineseCharacter;
	private String filePath;
	private PositionInfo positionInfo;
	private String strokeOrder;
	private String position;
	private String strokes;
	
	public ChineseRadical(){}
	
	private ChineseRadical(Builder builder){
		this.radicalId=builder.radicalId;
		this.label=builder.label;
		this.chineseCharacter=builder.chineseCharacter;
		this.filePath=builder.filePath;
		this.positionInfo=builder.positionInfo;
		this.strokeOrder=builder.strokeOrder;
		this.position=builder.position;
		this.strokes=builder.strokes;
	}
	
	public static class Builder{
		private int radicalId=0;
		private String label="";
		private String chineseCharacter="";
		private String filePath="";
		private PositionInfo positionInfo=null;
		private String strokeOrder="";
		private String position="";
		private String strokes="";
		
		public Builder(){}
		
		public Builder radicalId(int radicalId){
			this.radicalId=radicalId;
			return this;
		}
		
		public Builder label(String label){
			this.label=label;
			return this;
		}
		
		public Builder character(String chineseCharacter){
			this.chineseCharacter=chineseCharacter;
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
		
		public Builder strokeOrder(String strokeOrder){
			this.strokeOrder=strokeOrder;
			return this;
		}
		
		public Builder position(String position){
			this.position=position;
			return this;
		}
		
		public Builder strokes(String strokes){
			this.strokes=strokes;
			return this;
		}
		
		public ChineseRadical build(){
			return new ChineseRadical(this);
		}
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

	

	public String getChineseCharacter() {
		return chineseCharacter;
	}

	public void setChineseCharacter(String chineseCharacter) {
		this.chineseCharacter = chineseCharacter;
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
	
	
	

}
