package com.pheonix.agencyservice.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@RequiredArgsConstructor
public class CustomerEmailAddressUpdatedEvent {
	
	@NonNull
	private Customer customerDetails;

}
