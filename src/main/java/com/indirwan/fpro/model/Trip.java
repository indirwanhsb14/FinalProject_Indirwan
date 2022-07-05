package com.indirwan.fpro.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "trip")
@NoArgsConstructor
public class Trip {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	public Trip(int fare, int journeyTime, Stop sourceStop, Stop destStop, Bus bus, Agency agency) {
		super();
		this.fare = fare;
		this.journeyTime = journeyTime;
		this.sourceStop = sourceStop;
		this.destStop = destStop;
		this.bus = bus;
		this.agency = agency;
	}

	private int fare;
	
	private int journeyTime;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "source_stop_id")
	private Stop sourceStop;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "dest_stop_id")
	private Stop destStop;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bus_id")
	private Bus bus;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "agency_id")
	private Agency agency;

}
