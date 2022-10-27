package com.marketingdb8.Service;

import java.util.List;

import com.marketingdb8.entities.Lead;

public interface LeadServices {
	public void saveLead(Lead lead);

	public List<Lead> getAllLeads();


	public  void deleteOneLead(long id);


	public Lead getOneLead(long id);
	
}
