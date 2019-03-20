package com.dogshead.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogshead.dao.CalligraphyCharacterDao;
import com.dogshead.dao.ChineseCharacterDao;

public class Test2 {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"dao.xml"});

		
	}
	
}
