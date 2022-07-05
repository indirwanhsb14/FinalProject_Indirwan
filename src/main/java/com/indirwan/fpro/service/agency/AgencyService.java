package com.indirwan.fpro.service.agency;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.indirwan.fpro.model.Agency;
import com.indirwan.fpro.payload.request.AgencyRequest;
import com.indirwan.fpro.repository.AgencyRepository;

public interface AgencyService {

	Agency updatingAgency(Long id, AgencyRequest agencyDetail);

	Agency addNewAgency(AgencyRequest agencyRequest);

}
