package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/loans")
public class LoanController {

	@GetMapping("/{number}")
	public String getLoan() {
		return "{ number: \"H00987987972342\", type: \"car\", loan: 400000, emi: 3258, tenure: 18 }";
	}
}
