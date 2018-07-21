package com.cct.labstruts2.core.wildcard.service;

import java.util.List;

import com.cct.labstruts2.core.wildcard.domain.Email;
import com.cct.labstruts2.core.wildcard.domain.EmailSearchCriteria;

public class EmailManager {

	private EmailService service = null;
	
	public EmailManager() {
		this.service = new EmailService();
	}
	
	public List<Email> search(EmailSearchCriteria criteria) {
		return service.search(criteria);
	}
	
	public void add(Email data) throws Exception {
		service.add(data);
	}
}
