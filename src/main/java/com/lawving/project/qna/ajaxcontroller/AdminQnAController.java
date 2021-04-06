package com.lawving.project.qna.ajaxcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lawving.project.qna.model.service.QnAService;
import com.lawving.project.qna.model.vo.QnA;

@Controller
public class AdminQnAController {
	@Autowired
	private QnAService qnaService;
	
//	QNA 문의글 답변 작성/수정하기
	@RequestMapping(value = "update_answer.do", produces = "text/html; charset=utf-8")
	public String updateAnswerMethod(QnA qna) {
		QnA qnaOnelist = new QnA();
		qnaOnelist = qnaService.updateAnswer(qna);
		String answer = qnaOnelist.getQna_comment();
		return answer;
	}
	
//	QNA 문의글 답변 삭제하기
	@RequestMapping(value = "delete_answer.do", produces = "text/html; charset=utf-8")
	public String deleteAnswerMethod(int qna_idx) {
		int result = qnaService.deleteAnswer(qna_idx);
		if (result>0) {
			return "답변이 삭제되었습니다.";
		} else {
			return "답변을 삭제하지 못했습니다.";
		}
	}
}
