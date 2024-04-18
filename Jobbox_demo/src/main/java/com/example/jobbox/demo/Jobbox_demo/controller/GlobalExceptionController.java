package com.example.jobbox.demo.Jobbox_demo.controller;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.view.RedirectView;

import com.example.jobbox.demo.Jobbox_demo.exception.CompanyAlreadyExistsException;

@ControllerAdvice
public class GlobalExceptionController {


	
	  	@GetMapping("/error")
	    @ExceptionHandler(CompanyAlreadyExistsException.class)
	    public RedirectView handleCompanyAlreadyException(CompanyAlreadyExistsException e) {
	  
	        return new RedirectView("/error.html");
	    }

  


}
