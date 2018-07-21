package com.cct.labstruts2.core.interceptor.service;

import java.util.List;

import com.cct.labstruts2.core.interceptor.domain.Booking;
import com.cct.labstruts2.core.interceptor.domain.BookingSearchCriteria;

public class BookingService {

	private BookingDAO dao = null;
	
	public BookingService() {
		this.dao = new BookingDAO();
	}
	
	protected List<Booking> search(BookingSearchCriteria criteria) {
		return dao.search(criteria);
	}
	
	protected void add(Booking data) throws Exception {
		// dao.checkDup(data);
		dao.add(data);
	}
}
