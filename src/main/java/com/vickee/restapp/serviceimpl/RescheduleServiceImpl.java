package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.vickee.restapp.model.Reschedule;
import com.vickee.restapp.repository.RescheduleRepo;
import com.vickee.restapp.service.ResheduleService;

@Service
public class RescheduleServiceImpl implements ResheduleService {
	
	@Autowired
	RescheduleRepo repo;
	@Override
	public String addReshedule(Reschedule re) {
		if(re!=null) {
			repo.save(re);
			return "success";
		}
		else {
			return "failure";
		}
	}

	@Override
	public List<Reschedule> getAllSchedule() {
		return repo.findAll();
	}

	@Override
	public Reschedule approveRequest(int id) {
		Reschedule request = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
        request.setStatus("approved");
        return repo.save(request);
	}

	@Override
	public Reschedule rejectRequest(int id) {
		   Reschedule request = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
	        request.setStatus("rejected");
	        return repo.save(request);
	}

}
