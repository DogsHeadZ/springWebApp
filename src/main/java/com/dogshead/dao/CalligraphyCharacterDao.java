package com.dogshead.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dogshead.domain.CalligraphyCharacter;
import com.dogshead.domain.ChineseCharacter;

@Repository
public class CalligraphyCharacterDao extends BaseDao<CalligraphyCharacter>{
	private static final String GET_CALLIGRAPHYCHARACTER_BY_LABEL = "from CalligraphyCharacter u where u.label = ?";
	
	public List<CalligraphyCharacter> getCalligraphyCharacterByLabel(String calligraphyCharacterLabel){
	    @SuppressWarnings("unchecked")
		List<CalligraphyCharacter> CalligraphyCharacters = (List<CalligraphyCharacter>)getHibernateTemplate().find(GET_CALLIGRAPHYCHARACTER_BY_LABEL,calligraphyCharacterLabel);
	    if (CalligraphyCharacters.size() == 0) {
			return null;
		}else{
			return CalligraphyCharacters;
		}
    }
}
