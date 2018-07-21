package com.cct.labstruts2.core.wildcard.service;

import java.util.List;

import com.cct.labstruts2.core.wildcard.domain.Email;
import com.cct.labstruts2.core.wildcard.domain.EmailSearchCriteria;

public class EmailService {

	private EmailDAO dao = null;
	
	public EmailService() {
		this.dao = new EmailDAO();
	}
	
	protected List<Email> search(EmailSearchCriteria criteria) {
		return dao.search(criteria);
	}
	
	protected void add(Email data) throws Exception {
		// dao.checkDup(data);
		dao.add(data);
	}
}
