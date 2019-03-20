package com.dogshead.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "calligraphycharacter")
public class CalligraphyCharacter implements Serializable {

	public static final String TAG="calligraphy_character";
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int characterId;
	private String label;
	private String filePath;
	private String structure;
	private int topId;
	private int leftId;
	private int centerId;
	private int rightId;
	private int bottomId;
	private ChineseCharacter chineseCharacter;
	private int simplify;
	private int style;
	private PositionInfo positionInfo;
	private String author;
	private String work;
	private int priority;
	
	public CalligraphyCharacter(){}
	
	private CalligraphyCharacter(Builder builder){
		this.characterId=builder.characterId;
		this.label=builder.label;
		this.filePath=builder.filePath;
		this.structure=builder.structure;
		this.topId=builder.topId;
		this.leftId=builder.leftId;
		this.centerId=builder.centerId;
		this.rightId=builder.rightId;
		this.bottomId=builder.bottomId;
		this.chineseCharacter=builder.chineseCharacter;
		this.simplify=builder.simplify;
		this.style=builder.style;
		this.positionInfo=builder.positionInfo;
		this.author=builder.author;
		this.work=builder.work;
		this.priority=builder.priority;
	}
	
	public static class Builder{
		private int characterId=0;
		private String label="";
		private String filePath="";
		private String structure="";
		private int topId=0;
		private int leftId=0;
		private int centerId=0;
		private int rightId=0;
		private int bottomId=0;
		private ChineseCharacter chineseCharacter=null;
		private int simplify=-1;
		private int style=-1;
		private PositionInfo positionInfo=null;
		private String author="";
		private String work="";
		private int priority=-1;
		
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
		
		public Builder chineseCharacter(ChineseCharacter character){
			this.chineseCharacter=character;
			return this;
		}
		
		public Builder simplify(int simplify){
			this.simplify=simplify;
			return this;
		}
		
		public Builder style(int style){
			this.style=style;
			return this;
		}
		
		public Builder positionInfo(PositionInfo positionInfo){
			this.positionInfo=positionInfo;
			return this;
		}
		
		public Builder work(String work){
			this.work=work;
			return this;
		}
		
		public Builder author(String author){
			this.author=author;
			return this;
		}
		
		public Builder priority(int priority){
			this.priority=priority;
			return this;
		}
		
		public CalligraphyCharacter build(){
			return new CalligraphyCharacter(this);
		}
	}

	public String translateFilepath(){
		if(filePath==null||filePath.length()<8)return filePath;
		String bookId=filePath.substring(0, 8);
		String dir=bookId;
		String file=filePath.substring(8);
		return bookId+"/"+dir+"/"+file;
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
	 * @return the chineseCharacter
	 */
	public ChineseCharacter getChineseCharacter() {
		return chineseCharacter;
	}

	/**
	 * @param chineseCharacter the chineseCharacter to set
	 */
	public void setChineseCharacter(ChineseCharacter chineseCharacter) {
		this.chineseCharacter = chineseCharacter;
	}

	/**
	 * @return the simplify
	 */
	public int getSimplify() {
		return simplify;
	}

	/**
	 * @param simplify the simplify to set
	 */
	public void setSimplify(int simplify) {
		this.simplify = simplify;
	}

	/**
	 * @return the style
	 */
	public int getStyle() {
		return style;
	}

	/**
	 * @param style the style to set
	 */
	public void setStyle(int style) {
		this.style = style;
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
	 * @return the tag
	 */
	public static String getTag() {
		return TAG;
	}
	
	
}
