package com.indirwan.fpro.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.indirwan.fpro.model.Bus;

public interface BusRepository extends JpaRepository<Bus, Long> {
    @Query(value = "SELECT * FROM bus WHERE agency_id = :id", nativeQuery = true)
    List<Bus> findByAgencyId(Long id);
    
    Optional<Bus> findById(int busId);
}
