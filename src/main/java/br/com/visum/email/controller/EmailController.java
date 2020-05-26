package br.com.visum.email.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visum.email.service.EmailService;

/**
 * @author visum
 *
 */
@RestController
@RequestMapping("/emails")
public class EmailController {
	
	@Autowired
	private EmailService emailService;
	
	@GetMapping
	public String sendEmail() {
		return emailService.send();
	}

}
