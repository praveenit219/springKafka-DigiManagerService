package com.pheonix.agencyservice.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;


@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Document(collection = "dgs.application")
public class DigitalService {
	
	@Id
    private String id;

    @NonNull
    private String app_no;

    @NonNull
    private String callerId;

    @NonNull
    private Date dateSubmitted;

    @NonNull
    private String appStatus;
    
    @NonNull
    private String svcName;
    
    @NonNull
    private String agencyId;
    
    @NonNull
    private String agencyName;
    
    
    @NonNull
    private Customer customerDetails;
    
    
    

}
