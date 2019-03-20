package com.dogshead.web;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dogshead.domain.CalligraphyCharacter;
import com.dogshead.service.CalligraphyService;

@Controller
public class CalligraphySearchController {
	
	private CalligraphyService calligraphyService;
	
	@Autowired
	public void setCalligraphyService(CalligraphyService calligraphyService) {
		this.calligraphyService = calligraphyService;
	}
	
	@RequestMapping(value = "/index", method = RequestMethod.GET)
	public ModelAndView searchCalligragh() {
		ModelAndView view =new ModelAndView();
		view.setViewName("searchCalligragh2");
		return view;
	}
	
	@RequestMapping(value = "/listCalligraphy", method = RequestMethod.GET)
	public ModelAndView listCalligraphy(HttpServletRequest request, CalligraphyCharacter calligraphyCharacter) {
		System.out.println(calligraphyCharacter.getLabel());
		ModelAndView view =new ModelAndView();
		List<CalligraphyCharacter> calligraphyCharacters = calligraphyService.getCalligraphyCharacterByLabel(
				calligraphyCharacter.getLabel());
		view.addObject("calligraphyCharacters",calligraphyCharacters);
		view.setViewName("listCalligraphy");
		return view;
	}
}
