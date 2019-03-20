package com.dogshead.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.dogshead.domain.CalligraphyCharacter;
import com.dogshead.domain.ChineseRadical;

@Repository
public class ChineseRadicalDao extends BaseDao<ChineseRadical>{
	private static final String GET_CHINESERADICL_BY_RADICALID = "from ChineseRadical u where u.radicalId = ?";
	
	public ChineseRadical getChineseRadicalByRadicalId(int chineseRadicalId){
	    @SuppressWarnings("unchecked")
		List<ChineseRadical> chineseRadicals = (List<ChineseRadical>)getHibernateTemplate().find(GET_CHINESERADICL_BY_RADICALID,chineseRadicalId);
	    if (chineseRadicals.size() == 0) {
			return null;
		}else{
			return chineseRadicals.get(0);
		}
    }
}
