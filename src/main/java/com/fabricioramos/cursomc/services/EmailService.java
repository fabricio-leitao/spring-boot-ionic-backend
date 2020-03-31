package com.fabricioramos.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.fabricioramos.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
}
