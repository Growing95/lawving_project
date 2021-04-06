package com.lawving.project.members.model.dao;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lawving.project.members.model.vo.Members;

@Repository("MembersDao")
public class MembersDao {
	
	@Autowired
	SqlSessionTemplate sqlSession;

	public Members insertloginCheck(Members members) {
		return members ;
	}
		
}
