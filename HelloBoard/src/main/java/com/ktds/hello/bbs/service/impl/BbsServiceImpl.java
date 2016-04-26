package com.ktds.hello.bbs.service.impl;

import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.hello.bbs.service.BbsService;
import com.ktds.hello.bbs.vo.BbsVO;

public class BbsServiceImpl implements BbsService {

	@Override
	public ModelAndView doWriteBBS(BbsVO bbsVO, Errors errors) {
		
		ModelAndView view = new ModelAndView();
		
		if ( errors.hasErrors() ) {
			view.setViewName("bbs/write");
			view.addObject("bbsVO", bbsVO);
			return view;
		}
		else {
			return view;
		}
		
	}
	
	
	
}
