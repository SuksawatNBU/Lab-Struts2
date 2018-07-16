package com.cct.labstruts2.core.interceptor.service;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.interceptor.domain.Booking;
import com.cct.labstruts2.core.interceptor.domain.BookingSearchCriteria;

public class BookingDAO {

	private static List<Booking> listResult = new ArrayList<Booking>();
	
	protected List<Booking> search(BookingSearchCriteria criteria) {
		System.out.println("Result size: " + listResult.size());
		List<Booking> results = new ArrayList<Booking>();
		for (Booking booking : listResult) {
			if (booking.getBookingName().startsWith(criteria.getData().getBookingName())
					|| criteria.getData().getBookingName().isEmpty()) {
				results.add(booking);	
			}
		}
		return results;
	}
	
	protected void checkDup(Booking data) throws Exception {
		for (Booking booking : listResult) {
			if (booking.getBookingName().equals(data.getBookingName())) {
				throw new Exception("Duplicate Data.");
			}
		}
	}
	
	protected void add(Booking data) {
		listResult.add(data);
		System.out.println("Result size: " + listResult.size());
	}
}
