package com.pheonix.agencyservice.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Phone {
	
	@NonNull
    private PhoneType type;

	@NonNull
    private int countryCode;
	
	@NonNull
    private int phoneNumber;
}
