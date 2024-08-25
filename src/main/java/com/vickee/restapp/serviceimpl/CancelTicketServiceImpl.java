package com.vickee.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vickee.restapp.model.CancelTicket;
import com.vickee.restapp.repository.CancelTicketRepo;
import com.vickee.restapp.service.CancelTicketService;

@Service
public class CancelTicketServiceImpl implements CancelTicketService {
	
	@Autowired
	CancelTicketRepo repo;
	@Override
	public String addCancelTicket(CancelTicket cancel) {
		if(cancel!=null) {
			repo.save(cancel);
			return "success";
		}
		else {
			return "failure";
		}
	}
	@Override
	public List<CancelTicket> getAllCancel() {
		return repo.findAll();
	}

	@Override
	public CancelTicket approveRequest(int id) {
		CancelTicket request = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
        request.setStatus("approved");
        return repo.save(request);
	}
	
	@Override
	public CancelTicket rejectRequest(int id) {
		   CancelTicket request = repo.findById(id).orElseThrow(() -> new RuntimeException("Request not found"));
	        request.setStatus("rejected");
	        return repo.save(request);
	}
	@Override
	public CancelTicket fetchId(int cancelid) {
		return repo.findById(cancelid).get();
	}
//	@Override
//	public CancelTicket fetchPnr(int pnrno) {
//		return repo.findById(pnrno).get();
//	}
//	
}
