package br.com.visum.email.controller;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visum.email.model.AnswerDto;
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
	
	
	/**
	 * @param dto
	 */
	@PostMapping
	@Transactional
	@CrossOrigin
	@RequestMapping(consumes = "application/json", produces = "application/json")
	public void sendEmail(@RequestBody AnswerDto dto) {
		emailService.saveAnswer(dto.getAnswers());
	}

}
