package com.indirwan.fpro.service.ticket;

import java.text.ParseException;

import com.indirwan.fpro.model.Ticket;
import com.indirwan.fpro.payload.request.TicketRequest;


public interface TicketService {
	Ticket bookingTicket(TicketRequest ticketRequest) throws ParseException;

	Ticket updatingTicket(Long id, TicketRequest ticketRequest) throws ParseException;
}