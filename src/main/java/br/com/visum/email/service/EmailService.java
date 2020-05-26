package br.com.visum.email.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * @author visum
 *
 */
@Service
public class EmailService {
	
	@Autowired
	private JavaMailSender mailSander;
	
	
	public String send() {
		 SimpleMailMessage message = new SimpleMailMessage();
		 	message.setSubject("API VISUM EMAIL");
	        message.setText("Teste de envio via API REST FULL");
	        message.setTo("josepsjunior.df@gmail.com");
	        message.setTo("gabrielafonseca.civil@gmail.com");
	        message.setTo("tiagocostasantos@gmail.com");
	        message.setFrom("tiagocostasantos@gmail.com");
	
	        try {
	        	mailSander.send(message);
	            return "Email enviado com sucesso!";
	        } catch (Exception e) {
	            e.printStackTrace();
	            return "Erro ao enviar email.";
	        }
	}

}
