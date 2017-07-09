package com.hiruashi.simgyuseon.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ScheduleService {

	@Autowired
	ScheduleRepository scheduleRepository;
	
	public Integer InsertSch(Schedule entity){
		return scheduleRepository.InsertSch(entity);
	}
	
	public List<Schedule> getSch(Schedule entity){
		return scheduleRepository.getSch(entity);
	}
}
