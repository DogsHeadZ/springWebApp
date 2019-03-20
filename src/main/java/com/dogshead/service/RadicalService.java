package com.dogshead.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dogshead.dao.ChineseRadicalDao;
import com.dogshead.domain.ChineseRadical;

@Service
public class RadicalService {
	private ChineseRadicalDao chineseRadicalDao;

	public ChineseRadical getChineseRadicalByRadicalId(int chineseRadicalId){
	    return chineseRadicalDao.getChineseRadicalByRadicalId(chineseRadicalId);
    }
	
	@Autowired
	public void setChineseRadicalDao(ChineseRadicalDao chineseRadicalDao) {
		this.chineseRadicalDao = chineseRadicalDao;
	}
	
	
}
