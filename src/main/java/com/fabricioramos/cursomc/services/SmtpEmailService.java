package com.fabricioramos.cursomc.services;

<<<<<<< HEAD
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.MailSender;
=======
>>>>>>> 3cc36185f7f8e94f6fce9d8b17b816f51794933d
import org.springframework.mail.SimpleMailMessage;

public class SmtpEmailService extends AbstractEmailService {

<<<<<<< HEAD
	@Autowired
	private MailSender mailSender;
	
	private static final Logger LOG =  LoggerFactory.getLogger(MockEmailService.class);
	
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		LOG.info("Enviando email...");
		mailSender.send(msg);
		LOG.info("Email enviado!");
=======
	@Override
	public void sendEmail(SimpleMailMessage msg) {
		// TODO Auto-generated method stub
		
>>>>>>> 3cc36185f7f8e94f6fce9d8b17b816f51794933d
	}

}
