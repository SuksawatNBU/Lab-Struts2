package com.cct.labstruts2.core.wildcard.service;

import java.util.ArrayList;
import java.util.List;

import com.cct.labstruts2.core.wildcard.domain.Email;
import com.cct.labstruts2.core.wildcard.domain.EmailSearchCriteria;

public class EmailDAO {

	private static List<Email> listResult = new ArrayList<Email>();
	
	protected List<Email> search(EmailSearchCriteria criteria) {
		System.out.println("Result size: " + listResult.size());
		List<Email> results = new ArrayList<Email>();
		for (Email email : listResult) {
			if (email.getEmailName() == null) {
				results.add(email);
			} else if (email.getEmailName().startsWith(criteria.getData().getEmailName())
					|| criteria.getData().getEmailName().isEmpty()) {
				results.add(email);	
			}
		}
		return results;
	}
	
	protected void checkDup(Email data) throws Exception {
		for (Email email : listResult) {
			if (email.getEmailName().equals(data.getEmailName())) {
				throw new Exception("Duplicate Data.");
			}
		}
	}
	
	protected void add(Email data) {
		listResult.add(data);
		System.out.println("Result size: " + listResult.size());
	}
}
