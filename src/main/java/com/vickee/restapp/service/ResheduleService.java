package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.Reschedule;

public interface ResheduleService {
	
	public String addReshedule(Reschedule re);
	public List<Reschedule> getAllSchedule();
	public Reschedule approveRequest(int id);
	public Reschedule rejectRequest(int id);
}
