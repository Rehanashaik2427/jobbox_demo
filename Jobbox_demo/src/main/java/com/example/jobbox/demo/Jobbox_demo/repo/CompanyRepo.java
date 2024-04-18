package com.example.jobbox.demo.Jobbox_demo.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.jobbox.demo.Jobbox_demo.model.Company;

public interface CompanyRepo extends JpaRepository<Company, Integer>{



	Optional<Company> findByCompanyName(String companyName);

	String save(String company);	
	
}
