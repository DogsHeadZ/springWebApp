package com.dogshead.domain;


import java.util.List;



import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;
/*

* ����

*/

import com.dogshead.domain.User2;
import com.dogshead.dao.UserDao2;

public class TestSpring {

	public static void main(String[] args) throws Exception {

		User2 user = new User2("小周");
		

		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"dao.xml"});

		UserDao2 userDao = (UserDao2) ac.getBean("userDao2");

		userDao.add(user);
/*
		user = userDao.findById(2);

		System.out.println(user.getName());

		user.setName("СС");

		userDao.update(user);*/

		

	

	}

}
