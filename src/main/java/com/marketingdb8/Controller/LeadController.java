package com.marketingdb8.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.marketingdb8.Service.LeadServices;
import com.marketingdb8.entities.Lead;

@Controller
public class LeadController {
	
	@Autowired
	private LeadServices leadserviceRepo;
	
	
	@RequestMapping("/viewleading")
	public String viewpage() {
		return "view_lead";
	}
	@RequestMapping("/saveLead")
	public String saveleadpage( Lead lead) {
	leadserviceRepo.saveLead(lead);
		return "view_lead";
		
	}
	
	@RequestMapping("/listAll143")
	public String listallDetails(ModelMap model) {
		List<Lead> allLeads = leadserviceRepo.getAllLeads();
		model.addAttribute("leads", allLeads);
		return "search_lead";
	}
	  @RequestMapping("/Delete")
	    public String deleteLead(@RequestParam("id") long id,ModelMap model ) {
		  leadserviceRepo.deleteOneLead(id);
	    	List<Lead> allLeads = leadserviceRepo.getAllLeads();
	        model.addAttribute("leads",allLeads);
	        return "search_lead";
	    }
	    
	    
	    @RequestMapping("/getLeadInfo")
	    public String getLeadInfo1(@RequestParam("id") long id,ModelMap model) {
	    	Lead lead = leadserviceRepo.getOneLead(id);
	    	model.addAttribute("leads", lead);
	    	return "update_lead";
	    	
}
	    @RequestMapping("/updateLead")
	    public String UpdateLead(Lead lead, ModelMap model) {
	    	leadserviceRepo.saveLead(lead);
	    	List<Lead> allLeads = leadserviceRepo.getAllLeads();
			model.addAttribute("leads", allLeads);
			return "search_lead";
}
}