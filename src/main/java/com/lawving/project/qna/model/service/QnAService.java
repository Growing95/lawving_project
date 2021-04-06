package com.lawving.project.qna.model.service;

import java.util.ArrayList;

import com.lawving.project.qna.model.vo.QnA;

public interface QnAService {
	public abstract ArrayList<QnA> selectQuestionList();
	public abstract ArrayList<QnA> searchQuestion(String keyword, String category);
	public abstract QnA selectQuestionOnelist(int qna_idx);
	public abstract int insertQuestion(QnA qna);
	public abstract int deleteQuestion(int qna_idx);
	public abstract int chkdeleteQuestion(int[] qna_idx);
	public abstract QnA updateAnswer(QnA qna);
	public abstract int deleteAnswer(int qna_idx);
}
