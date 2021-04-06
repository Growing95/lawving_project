package com.ict.lawving.qna.model.vo;

import java.io.Serializable;
import java.sql.Date;

public class QnA implements Serializable{
	private final static long serialVersionUID = 1L;
	private int qna_idx;
	private int members_idx;
	private String qna_category;
	private String qna_title;
	private String qna_writer;
	private String qna_content;
	private String qna_view;
	private Date qna_req_q;
	private int qna_hit;
	private String qna_status;
	private String qna_comment_writer;
	private String qna_comment;
	private Date qna_reg_a;
	
	public QnA() {}
	public QnA(int qna_idx, int members_idx, String qna_category, String qna_title, String qna_writer,
			String qna_content, String qna_view, Date qna_req_q, int qna_hit, String qna_status,
			String qna_comment_writer, String qna_comment, Date qna_reg_a) {
		super();
		this.qna_idx = qna_idx;
		this.members_idx = members_idx;
		this.qna_category = qna_category;
		this.qna_title = qna_title;
		this.qna_writer = qna_writer;
		this.qna_content = qna_content;
		this.qna_view = qna_view;
		this.qna_req_q = qna_req_q;
		this.qna_hit = qna_hit;
		this.qna_status = qna_status;
		this.qna_comment_writer = qna_comment_writer;
		this.qna_comment = qna_comment;
		this.qna_reg_a = qna_reg_a;
	}

	public int getQna_idx() {return qna_idx;}
	public void setQna_idx(int qna_idx) {this.qna_idx = qna_idx;}
	public int getMembers_idx() {return members_idx;}
	public void setMembers_idx(int members_idx) {this.members_idx = members_idx;}
	public String getQna_category() {return qna_category;}
	public void setQna_category(String qna_category) {this.qna_category = qna_category;}
	public String getQna_title() {return qna_title;}
	public void setQna_title(String qna_title) {this.qna_title = qna_title;}
	public String getQna_writer() {return qna_writer;}
	public void setQna_writer(String qna_writer) {this.qna_writer = qna_writer;}
	public String getQna_content() {return qna_content;}
	public void setQna_content(String qna_content) {this.qna_content = qna_content;}
	public String getQna_view() {return qna_view;}
	public void setQna_view(String qna_view) {this.qna_view = qna_view;}
	public Date getQna_req_q() {return qna_req_q;}
	public void setQna_req_q(Date qna_req_q) {this.qna_req_q = qna_req_q;}
	public int getQna_hit() {return qna_hit;}
	public void setQna_hit(int qna_hit) {this.qna_hit = qna_hit;}
	public String getQna_status() {return qna_status;}
	public void setQna_status(String qna_status) {this.qna_status = qna_status;}
	public String getQna_comment_writer() {return qna_comment_writer;}
	public void setQna_comment_writer(String qna_comment_writer) {
		this.qna_comment_writer = qna_comment_writer;}
	public String getQna_comment() {return qna_comment;}
	public void setQna_comment(String qna_comment) {this.qna_comment = qna_comment;}
	public Date getQna_reg_a() {return qna_reg_a;}
	public void setQna_reg_a(Date qna_reg_a) {this.qna_reg_a = qna_reg_a;}
	public static long getSerialversionuid() {return serialVersionUID;}
	
	@Override
	public String toString() {
		return "QnA [qna_idx=" + qna_idx 
				+ ", members_idx=" + members_idx 
				+ ", qna_category=" + qna_category
				+ ", qna_title=" + qna_title 
				+ ", qna_writer=" + qna_writer 
				+ ", qna_content=" + qna_content
				+ ", qna_view=" + qna_view 
				+ ", qna_req_q=" + qna_req_q 
				+ ", qna_hit=" + qna_hit 
				+ ", qna_status=" + qna_status 
				+ ", qna_comment_writer=" + qna_comment_writer 
				+ ", qna_comment=" + qna_comment
				+ ", qna_reg_a=" + qna_reg_a + "]";
	}
}