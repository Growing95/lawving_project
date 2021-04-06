package com.lawving.project.qna.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lawving.project.qna.model.dao.QnADao;
import com.lawving.project.qna.model.vo.QnA;

@Service("qnaDao")
public class QnAServiceImpliment implements QnAService {
	@Autowired
	private QnADao qnaDao;

//	QNA 목록 조회하기
	@Override
	public ArrayList<QnA> selectQuestionList() {
		return qnaDao.selectQuestionList();
	}

//	QNA 검색
	@Override
	public ArrayList<QnA> searchQuestion(String keyword, String category) {
		return qnaDao.searchQuestion(keyword, category);
	}

//	QNA 목록 상세보기
	@Override
	public QnA selectQuestionOnelist(int qna_idx) {
		return qnaDao.selectQuestionOnelist(qna_idx);
	}

//	QNA 문의 작성하기
	@Override
	public int insertQuestion(QnA qna) {
		return qnaDao.insertQuestion(qna);
	}

//	QNA 문의 삭제하기
	@Override
	public int deleteQuestion(int qna_idx) {
		return qnaDao.deleteQuestion(qna_idx);
	}

//	체크된 QNA 문의 삭제하기 (관리자 전용) -> 보류
	@Override
	public int chkdeleteQuestion(int[] qna_idx) {return 0;}

//	QNA 문의글 답변 작성/수정하기
	@Override
	public QnA updateAnswer(QnA qna) {
		return qnaDao.updateAnswer(qna);
	}

//	QNA 문의글 답변 삭제하기
	@Override
	public int deleteAnswer(int qna_idx) {
		return qnaDao.deleteAnswer(qna_idx);
	}
}
