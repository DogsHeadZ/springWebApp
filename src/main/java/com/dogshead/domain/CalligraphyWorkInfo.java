package com.dogshead.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Map;

public class CalligraphyWorkInfo implements Serializable {
	public static final String TAG="calligraphy_work_info";
	
	private Map<String,ArrayList<String>> workInfo;
	private String version;
	
	public CalligraphyWorkInfo(){}
	public CalligraphyWorkInfo(Map<String,ArrayList<String>> workInfo,String version){
		this.workInfo=workInfo;
		this.version=version;
	}
	
	public String[] getAuthors(){
		if(workInfo==null||workInfo.isEmpty())return null;
		String[] authors=new String[workInfo.size()];
		workInfo.keySet().toArray(authors);
		return authors;
	}
	
	public String[] getWorksByAuthor(String author){
		if(workInfo==null||workInfo.isEmpty())return null;
		if(!workInfo.containsKey(author)) return null;
		String[] works=new String[workInfo.get(author).size()];
		workInfo.get(author).toArray(works);
		return works;
	}
	
	public Map<String, ArrayList<String>> getWorkInfo() {
		return workInfo;
	}
	public void setWorkInfo(Map<String, ArrayList<String>> workInfo) {
		this.workInfo = workInfo;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public static String getTag() {
		return TAG;
	}
	
	
	
	
}
