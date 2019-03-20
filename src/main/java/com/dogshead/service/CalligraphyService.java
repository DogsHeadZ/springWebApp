package com.dogshead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogshead.dao.CalligraphyCharacterDao;
import com.dogshead.domain.CalligraphyCharacter;

@Service
public class CalligraphyService {
	private CalligraphyCharacterDao calligraphyCharacterDao;

	@Autowired
	public void setCalligraphyCharacterDao(CalligraphyCharacterDao calligraphyCharacterDao) {
		this.calligraphyCharacterDao = calligraphyCharacterDao;
	}
	
	public List<CalligraphyCharacter> getCalligraphyCharacterByLabel(String calligraphyCharacterLabel){
		return calligraphyCharacterDao.getCalligraphyCharacterByLabel(calligraphyCharacterLabel);
    }
	
}
