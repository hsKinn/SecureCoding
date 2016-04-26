package com.ktds.hello.bbs.web;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.hello.bbs.service.BbsService;
import com.ktds.hello.bbs.vo.BbsVO;

@Controller
public class BBSController {
	
	private BbsService bbsService;
	
	
	public void setBbsService(BbsService bbsService) {
		this.bbsService = bbsService;
	}

	@RequestMapping("/write")
	public ModelAndView viewWritePage() {
		ModelAndView view = new ModelAndView();
		view.setViewName("bbs/write");
		
		return view;
	}
	
	@RequestMapping("/doWriteAction")
	public ModelAndView doWriteBBS(@Valid BbsVO bbsVO, Errors errors) {
		return bbsService.doWriteBBS(bbsVO, errors);
	}
	
	
	
}
