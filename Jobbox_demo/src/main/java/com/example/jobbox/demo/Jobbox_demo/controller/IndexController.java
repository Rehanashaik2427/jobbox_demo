package com.example.jobbox.demo.Jobbox_demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.example.jobbox.demo.Jobbox_demo.exception.CompanyAlreadyExistsException;
import com.example.jobbox.demo.Jobbox_demo.model.Company;
import com.example.jobbox.demo.Jobbox_demo.model.CompanyResponse;
import com.example.jobbox.demo.Jobbox_demo.service_interface.CompanyServiceImpl;

@Controller
public class IndexController {

	@Autowired
	private CompanyServiceImpl companyServiceImpl;
	
	 
	 @GetMapping("/index")
	 public String index() {
	     return "index.html";
	 }
	 
	   
//	    @PostMapping("/index")
//	    public ResponseEntity<Company> registration(@ModelAttribute Company company){
//	        // Call the service to save data to the database
//	    	company.setJobboxEmail(company.getCompanyName() + "@jobbox.com");
//	        Company response = companyServiceImpl.companyRegistration(company);
//	        return new ResponseEntity<>(response, HttpStatus.OK);
//	    }
	    
	    
	    @PostMapping("/index")
	    public RedirectView registration(@ModelAttribute Company company){
	        // Call the service to save data to the database
	    	company.setJobboxEmail(company.getCompanyName() + "@jobbox.com");
	        Company response = companyServiceImpl.companyRegistration(company);
	        //return new ResponseEntity<>(response, HttpStatus.OK);

	        return new RedirectView("/successmsg.html");
	    }
    
	    
}
