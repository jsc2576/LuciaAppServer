package com.hiruashi.simgyuseon.schedule;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hiruashi.simgyuseon.gallery.Gallery;

@Controller
public class ScheduleController {

	@Autowired
	ScheduleService scheduleService;
	
	
	/**
	 * schedule upload main page
	 * @param entity
	 * @return
	 */
	@RequestMapping("/sch")
	public String ScheduleMain(@ModelAttribute Schedule entity){
		return "schedule";
	}
	
	/**
	 * schedule upload
	 * @param entity
	 * @return
	 */
	@RequestMapping(value="/sch/insert", method=RequestMethod.POST)
	@ResponseBody
	public Integer InsertSch(@ModelAttribute Schedule entity){
		return scheduleService.InsertSch(entity);
	}
	
	
	/**
	 * get schedule list 
	 * @param entity
	 * @return
	 */
	@RequestMapping(value="/sch/get", method=RequestMethod.POST)
	@ResponseBody
	public List<Schedule> getSch(@RequestBody Schedule entity){
		return scheduleService.getSch(entity);
	}
}
