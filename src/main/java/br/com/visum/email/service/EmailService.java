package br.com.visum.email.service;

import java.util.List;

import javax.mail.internet.MimeMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import br.com.visum.email.model.Answer;
import br.com.visum.email.repository.AnswerRepository;

/**
 * @author visum
 *
 */
@Service
public class EmailService {

	@Autowired
	private JavaMailSender mailSander;


	public String send() {
		try {
			MimeMessage mail = mailSander.createMimeMessage();

			MimeMessageHelper helper = new MimeMessageHelper(mail);
			helper.setTo("tiagocostasantos@gmail.com");
			helper.setSubject("Respostas questionário VISUM");
			helper.setText("<!DOCTYPE html>\r\n" + 
					"<html lang=\"pt-br\">\r\n" + 
					"    <head>\r\n" + 
					"        <meta charset=\"UTF-8\">\r\n" + 
					"        <title>Email enviado com sucesso!</title>\r\n" + 
					"    </head>\r\n" + 
					"    <body>\r\n" + 
					"        <header style=\"text-align:center\">\r\n" + 
					"            Visum\r\n" + 
					"        </header>\r\n" + 
					"        <div class=\"principal\">\r\n" + 
					"            <h1>Respostas Enviadas com Sucesso</h1>\r\n" + 
					"            <p>Qualquer dúvida entre em contato conosco!</p>\r\n" + 
					"        </div>\r\n" + 
					"    </body>\r\n" + 
					"</html>", true);

			mailSander.send(mail);

			return "OK";

		} catch (Exception e) {
			e.printStackTrace();
			return "Error ao enviar email";
		}

	}

}
