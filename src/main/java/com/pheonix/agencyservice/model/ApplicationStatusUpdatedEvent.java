package com.pheonix.agencyservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class ApplicationStatusUpdatedEvent {

	@Id
	private String id;

	@NonNull
	private String app_no;

	@NonNull
	private Date dateSubmitted;
	
	@NonNull
    private String appStatus;

	@NonNull
	private String svcName;

	@NonNull
	private String agencyId;

	@NonNull
	private Customer customerDetails;

}
