package com.ktds.hello.bbs.service;

import org.springframework.validation.Errors;
import org.springframework.web.servlet.ModelAndView;

import com.ktds.hello.bbs.vo.BbsVO;

public interface BbsService {
	
	public ModelAndView doWriteBBS(BbsVO bbsVO, Errors errors);
	
}
