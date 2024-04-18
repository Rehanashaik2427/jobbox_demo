package com.example.jobbox.demo.Jobbox_demo.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.jobbox.demo.Jobbox_demo.exception.CompanyAlreadyExistsException;
import com.example.jobbox.demo.Jobbox_demo.model.Company;
import com.example.jobbox.demo.Jobbox_demo.repo.CompanyRepo;

@Component
public class CompanyValidatorImpl implements CompanyValidator{

	@Autowired
    private CompanyRepo companyRepo;
	
		    @Override
		    public boolean doesCompanyExist(String companyName) throws CompanyAlreadyExistsException {
		    	java.util.Optional<Company> existingCompany = companyRepo.findByCompanyName(companyName);
		        if (existingCompany.isPresent()) {
		            throw new CompanyAlreadyExistsException(companyName + " company already exists");
		        }
		        return false;
		    
	}

}
