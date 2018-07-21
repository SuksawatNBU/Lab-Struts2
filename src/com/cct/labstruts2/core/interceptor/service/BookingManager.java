package com.cct.labstruts2.core.interceptor.service;

import java.util.List;

import com.cct.labstruts2.core.interceptor.domain.Booking;
import com.cct.labstruts2.core.interceptor.domain.BookingSearchCriteria;

public class BookingManager {

	private BookingService service = null;
	
	public BookingManager() {
		this.service = new BookingService();
	}
	
	public List<Booking> search(BookingSearchCriteria criteria) {
		return service.search(criteria);
	}
	
	public void add(Booking data) throws Exception {
		service.add(data);
	}
}
