package com.dogshead.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dogshead.dao.ChineseCharacterDao;

public class test {

	public static void main(String[] args) throws Exception{
		ChineseCharacter character = new ChineseCharacter();
		character.setCharacterId(1);

		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"dao.xml"});

		ChineseCharacterDao characterDao = (ChineseCharacterDao)ac.getBean("chineseCharacterDao");
		ChineseCharacter character2 = characterDao.getChineseCharacterByLabel("仁");
		System.out.println(character2.getBottomId());
		//characterDao.add(character);
		//UserDao userDao = (UserDao) ac.getBean("userDao");

		//userDao.add(user);
		/*
		user = userDao.findById(2);

		System.out.println(user.getName());

		user.setName("СС");

		userDao.update(user);*/

	}

}
