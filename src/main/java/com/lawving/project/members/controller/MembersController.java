package com.lawving.project.members.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.lawving.project.members.controller.MembersController;
import com.lawving.project.members.model.vo.Members;

@SessionAttributes({"loginUser","loginAdmin"})
@Controller
public class MembersController {
	@Autowired
	private BCryptPasswordEncoder bcryptPasswordEncoder;
	private Logger logger = LoggerFactory.getLogger(MembersController.class);
	@RequestMapping("go_signup.do")
	public String enrollView() {
		
		if(logger.isDebugEnabled()) // 프로젝트 배포시에 성능저하를 막기위해 logger의 레벨이 DEBUG인지 여부를 확인
		    logger.debug("회원등록페이지");
		
		return "member/signUp";
	}
	
	   @RequestMapping(value="go_login.do")
	   public String moveLoginPage() {
		   return "member/logIn";
	   }
	   
	   @RequestMapping(value="login.do")
	   public String loginCheck(String id, String pw) {
		   
		   
		   return "member/logIn";
	   }
}

