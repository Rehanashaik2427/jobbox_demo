package com.example.jobbox.demo.Jobbox_demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "company")
public class Company {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

  
    @Column(nullable =  false)
    private String companyName;
    private String contactNumber;
    private String companyEmail;
    private String location;
    private String date;

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
   

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }


    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getCompanyEmail() {
        return companyEmail;
    }

    public void setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    public void setDate(String date) {
    	this.date = date;
    }

    public String getDate() {
    	return date;
    }
    
    private String jobboxEmail;

    // Getters and setters for jobboxEmail
    public String getJobboxEmail() {
        return jobboxEmail;
    }

    public void setJobboxEmail(String jobboxEmail) {
        this.jobboxEmail = jobboxEmail;
    }
    // toString method

    @Override
    public String toString() {
        return "Company{" +
        		"id="+ id +
                ", companyName='" + companyName + '\'' +
                ", contactNumber='" + contactNumber + '\'' +
                ", companyEmail='" + companyEmail + '\'' +
                ", location='" + location + '\'' +
                ", date and time ='" +  date + '\'' +
                ", jobboxEmail='" + jobboxEmail + '\'' +
                '}';
    }
    
    
    
}
