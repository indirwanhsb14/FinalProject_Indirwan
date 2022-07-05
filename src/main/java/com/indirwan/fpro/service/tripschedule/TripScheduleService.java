package com.indirwan.fpro.service.tripschedule;

import java.text.ParseException;

import com.indirwan.fpro.model.TripSchedule;
import com.indirwan.fpro.payload.request.TripScheduleRequest;

public interface TripScheduleService {
	TripSchedule addNewTrip(TripScheduleRequest tripScheduleRequest) throws ParseException;

	TripSchedule updatingTrip(Long id, TripScheduleRequest tripScheduleRequest) throws ParseException;
}
