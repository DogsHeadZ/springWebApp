package com.dogshead.dao;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.dogshead.domain.ChineseCharacter;

@Repository
public class ChineseCharacterDao extends BaseDao<ChineseCharacter>{
	private static final String GET_CHINESECHARACTER_BY_LABEL = "from ChineseCharacter u where u.label = ?";
	
	public ChineseCharacter getChineseCharacterByLabel(String chineseCharacterLabel){
	    @SuppressWarnings("unchecked")
		List<ChineseCharacter> users = (List<ChineseCharacter>)getHibernateTemplate().find(GET_CHINESECHARACTER_BY_LABEL,chineseCharacterLabel);
	    if (users.size() == 0) {
			return null;
		}else{
			return users.get(0);
		}
    }
}
