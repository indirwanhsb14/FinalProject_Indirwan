package com.indirwan.fpro.service.bus;

import com.indirwan.fpro.model.Bus;
import com.indirwan.fpro.payload.request.BusRequest;

public interface BusService {

	Bus addNewBus(BusRequest busRequest);

	Bus updatingBus(Long id, BusRequest busRequest);
}
