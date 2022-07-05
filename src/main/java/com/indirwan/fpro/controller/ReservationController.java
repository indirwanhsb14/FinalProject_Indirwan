package com.indirwan.fpro.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.indirwan.fpro.model.Ticket;
import com.indirwan.fpro.model.TripSchedule;
import com.indirwan.fpro.model.User;
import com.indirwan.fpro.payload.request.TicketRequest;
import com.indirwan.fpro.payload.response.MessageResponse;
import com.indirwan.fpro.repository.TicketRepository;
import com.indirwan.fpro.repository.TripScheduleRepository;
import com.indirwan.fpro.repository.UserRepository;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.Authorization;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/v1/ticket")
public class ReservationController {

	@Autowired
	TicketRepository ticketRepository;

	@Autowired
	UserRepository userRepository;

	@Autowired
	TripScheduleRepository tripScheduleRepository;

	@PostMapping("/")
	@ApiOperation(value = "", authorizations = { @Authorization(value = "apiKey") })
	@PreAuthorize("hasRole('ADMIN')")
	public ResponseEntity<?> addTicket(@Valid @RequestBody TicketRequest ticketRequest) {
		User user = userRepository.findById(ticketRequest.getPassegerId()).get();
		TripSchedule tripSchedule = tripScheduleRepository.findById(ticketRequest.getTripScheduleId()).get();
		Ticket ticket = new Ticket(ticketRequest.getSeatNumber(), ticketRequest.getCancellable(),
				ticketRequest.getJourneyDate(), user, tripSchedule);
		ticketRepository.save(ticket);
		return ResponseEntity
			.ok(new MessageResponse<Ticket>(true, "Success Adding Data", ticket));
	}
}
