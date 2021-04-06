package com.lawving.project.members.model.service;

import java.util.ArrayList;

import com.lawving.project.members.model.vo.Members;

public interface MembersService {
	Members insertloginCheck(Members members);
	
	String logOut(String members_id);
	
	int insertMembers(Members members);
	
	String selectcheckId(String id);
	
	String selectSendEmail(String email);
	
	int selectCheckEmail(int snsnum);
	
	Members selectFindId(Members members);
	
	Members selectFindPw(Members members);
	
	Members selectGoMpage(Members members);
	
	int deleteMembers(String idx);
	
	int updateMembers(Members members);
	
	ArrayList<String> selectMembersList();
	
	Members selectMembersOnelist(int members_idx);
	
	Members searchMemers(String String);
	
}