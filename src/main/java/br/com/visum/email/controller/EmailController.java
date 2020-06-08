package br.com.visum.email.controller;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.visum.email.model.Answer;
import br.com.visum.email.model.AnswerDto;
import br.com.visum.email.repository.AnswerRepository;
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
	
	@Autowired
	private AnswerRepository repository;
	
	
	/**
	 * @param dto
	 */
	@PostMapping
	@Transactional
	@CrossOrigin
	@RequestMapping(consumes = "application/json", produces = "application/json")
	public ResponseEntity<?> sendEmail(@RequestBody AnswerDto dto) throws Exception{
		List<Answer> answers = dto.converte(dto);
		repository.saveAll(answers);
		emailService.send();
		return ResponseEntity.ok().body(answers);
	}

}
