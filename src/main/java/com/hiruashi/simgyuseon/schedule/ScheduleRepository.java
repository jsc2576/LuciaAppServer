package com.hiruashi.simgyuseon.schedule;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ScheduleRepository {

	@Autowired
	SqlSession sqlSession;
	
	public Integer InsertSch(Schedule entity){
		return sqlSession.insert("com.hiruashi.simgyuseon.schedule.create", entity);
	}
	
	public List<Schedule> getSch(Schedule entity){
		return sqlSession.selectList("com.hiruashi.simgyuseon.schedule.getsch", entity);
	}
}
