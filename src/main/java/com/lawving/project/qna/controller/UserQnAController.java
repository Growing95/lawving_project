package com.lawving.project.qna.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lawving.project.qna.model.service.QnAService;
import com.lawving.project.qna.model.vo.QnA;

@Controller
public class UserQnAController {
	@Autowired
	private QnAService qnaService;
	
//	QNA 목록 조회하기
	@RequestMapping("list_qna.do")
	public String selectQuestionListMethod() {
		ArrayList<QnA> qnaList = new ArrayList<QnA>();
		qnaList = qnaService.selectQuestionList();
		return "qna/qnaList";
	}
	
//	QNA 검색
	@RequestMapping("search_qna.do")
	public String searchQuestionMethod(String keyword, String category) {
		ArrayList<QnA> qnaList = new ArrayList<QnA>();
		qnaList = qnaService.searchQuestion(keyword, category);
		return "qna/qnaList";
	}
	
//	QNA 목록 상세보기
	@RequestMapping("onelist_qna.do")
	public String selectQuestionOnelistMethod(int qna_idx) {
		QnA qnaOnelist = new QnA();
		qnaOnelist = qnaService.selectQuestionOnelist(qna_idx);
		return "qna/qnaOnelist";
	}
	
//	QNA 문의 작성하기
	@RequestMapping("insert_qna.do")
	public String insertQuestionMethod(QnA qna) {
		int result = 0;
		result = qnaService.insertQuestion(qna);
		return "redirect:list_qna.do";
	}
	
//	QNA 문의 삭제하기
	@RequestMapping("delete_qna.do")
	public String deleteQuestionMethod(int qna_idx, int members_idx, int members_lev) {
		int result = 0;
		result = qnaService.deleteQuestion(qna_idx);
//		로그인 한 유저가 회원이라면 목록으로 돌아간다.
		if (members_lev==1) {
			return "redirect:list_qna.do";
//		로그인 한 유저가 관리자라면 insert_limitmember.do로 redirect한다.
		} else {
			return "redirect:insert_limitmember.do?member_idx="+members_idx;
		}
	}
}
