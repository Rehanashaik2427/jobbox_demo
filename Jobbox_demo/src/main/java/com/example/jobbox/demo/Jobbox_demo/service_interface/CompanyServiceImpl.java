package com.example.jobbox.demo.Jobbox_demo.service_interface;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.jobbox.demo.Jobbox_demo.model.Company;
import com.example.jobbox.demo.Jobbox_demo.repo.CompanyRepo;
import com.example.jobbox.demo.Jobbox_demo.util.CompanyValidator;

@Service
public class CompanyServiceImpl implements CompanyServiceInterface {

	@Autowired
	public CompanyRepo companyRepo;

	@Autowired
	private CompanyValidator companyValidator;

	@Override
	public Company companyRegistration(Company company) {
		// Delegate company existence check to CompanyValidator
		companyValidator.doesCompanyExist(company.getCompanyName());

		// Save the company if it doesn't exist
		company = companyRepo.save(company);
		return company;

	}

}
