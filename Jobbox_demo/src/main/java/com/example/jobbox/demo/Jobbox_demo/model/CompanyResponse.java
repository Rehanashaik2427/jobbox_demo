package com.example.jobbox.demo.Jobbox_demo.model;

import lombok.Data;

@Data
public class CompanyResponse {
	
	private Company company;

	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	
	@Override
	public String toString() {
		return "CompanyResponse [company=" + company +  ", getCompany()=" + getCompany()
				+  "]";
	}
}
