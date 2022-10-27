package com.marketingdb8.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marketingdb8.Repository.LeadRepository;
import com.marketingdb8.entities.Lead;

@Service
public class LeadServicesimpl implements LeadServices {

	
	@Autowired
	private LeadRepository leadRepo;

	@Override
	public void saveLead(Lead lead) {
		leadRepo.save(lead);
	}

	@Override
	public List<Lead> getAllLeads() {
		List<Lead> leads = leadRepo.findAll();
		
		
		return leads;
	}
	@Override
	public void deleteOneLead(long id) {
		leadRepo.deleteById(id);
		
		
		
	}

	@Override
	public Lead getOneLead(long id) {
		Optional<Lead> findById = leadRepo.findById(id);
		
		Lead leads = findById.get();
		return leads;
	}

}
