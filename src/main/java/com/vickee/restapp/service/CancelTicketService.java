package com.vickee.restapp.service;

import java.util.List;

import com.vickee.restapp.model.CancelTicket;

public interface CancelTicketService {
	
	public String addCancelTicket(CancelTicket cancel);
	public List<CancelTicket> getAllCancel();
	public CancelTicket approveRequest(int id);
	public CancelTicket rejectRequest(int id);
	CancelTicket fetchId(int cancelid);
//	CancelTicket fetchPnr(int pnrno);
	
}

