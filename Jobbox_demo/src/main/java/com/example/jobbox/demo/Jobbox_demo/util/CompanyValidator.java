package com.example.jobbox.demo.Jobbox_demo.util;

import com.example.jobbox.demo.Jobbox_demo.exception.CompanyAlreadyExistsException;

public interface CompanyValidator {
	 boolean doesCompanyExist(String companyName) throws CompanyAlreadyExistsException;
}
