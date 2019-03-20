package com.dogshead.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dogshead.dao.ChineseRadicalDao;
import com.dogshead.domain.CalligraphyCharacter;
import com.dogshead.domain.ChineseCharacter;
import com.dogshead.domain.ChineseRadical;
import com.dogshead.service.CalligraphyService;
import com.dogshead.service.RadicalService;

@Controller
public class RadicalController {
	
	private RadicalService radicalService;
	
	private CalligraphyService calligraphyService;
	
	@RequestMapping(value = "/radicalSearch", method = RequestMethod.GET)
	public ModelAndView searchCalligragh(CalligraphyCharacter calligraphyCharacter) {
		System.out.println(calligraphyCharacter.getLabel());
		ModelAndView view =new ModelAndView();
		if(calligraphyCharacter.getTopId()>0) {
			ChineseRadical chineseRadicalTop = radicalService.getChineseRadicalByRadicalId(calligraphyCharacter.getTopId());
			view.addObject("chineseRadicalTop",chineseRadicalTop);
		}
		
		if(calligraphyCharacter.getLeftId()>0) {
			ChineseRadical chineseRadicalLeft = radicalService.getChineseRadicalByRadicalId(calligraphyCharacter.getLeftId());
			view.addObject("chineseRadicalLeft",chineseRadicalLeft);
		}
		
		if(calligraphyCharacter.getCenterId()>0) {
			ChineseRadical chineseRadicalCenter = radicalService.getChineseRadicalByRadicalId(calligraphyCharacter.getCenterId());
			view.addObject("chineseRadicalCenter",chineseRadicalCenter);
		}
		
		if(calligraphyCharacter.getRightId()>0) {
			ChineseRadical chineseRadicalRight = radicalService.getChineseRadicalByRadicalId(calligraphyCharacter.getRightId());
			view.addObject("chineseRadicalRight",chineseRadicalRight);
		}
		
		if(calligraphyCharacter.getBottomId()>0) {
			ChineseRadical chineseRadicalBottom = radicalService.getChineseRadicalByRadicalId(calligraphyCharacter.getBottomId());
			view.addObject("chineseRadicalBottom",chineseRadicalBottom);
		}
		view.setViewName("radicalSearch");
		return view;
	}
	
	@RequestMapping(value = "/listRadical", method = RequestMethod.GET)
	public ModelAndView listRadical() {
		ModelAndView view =new ModelAndView();
		view.setViewName("listRadical");
		return view;
	}

	@Autowired
	public void setRadicalService(RadicalService radicalService) {
		this.radicalService = radicalService;
	}
	
	@Autowired
	public void setCalligraphyService(CalligraphyService calligraphyService) {
		this.calligraphyService = calligraphyService;
	}
	
	
}
