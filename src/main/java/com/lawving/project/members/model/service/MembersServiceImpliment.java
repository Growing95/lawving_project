package com.lawving.project.members.model.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;

import com.lawving.project.members.model.dao.MembersDao;
import com.lawving.project.members.model.vo.Members;

public class MembersServiceImpliment implements MembersService{
	@Autowired
	private MembersDao membersDao;

	@Override
	public Members insertloginCheck(Members members) {
		Members loginUser = membersDao.insertloginCheck(members);
		return loginUser;
	}

	@Override
	public String logOut(String members_id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insertMembers(Members members) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String selectcheckId(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String selectSendEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int selectCheckEmail(int snsnum) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Members selectFindId(Members members) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Members selectFindPw(Members members) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Members selectGoMpage(Members members) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int deleteMembers(String idx) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateMembers(Members members) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ArrayList<String> selectMembersList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Members selectMembersOnelist(int members_idx) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Members searchMemers(String String) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
