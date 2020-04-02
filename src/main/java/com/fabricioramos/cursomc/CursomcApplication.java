package com.fabricioramos.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.fabricioramos.cursomc.services.S3Service;

@SpringBootApplication
public class CursomcApplication implements CommandLineRunner {

	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}
	@Autowired
	private S3Service s3Service;
	
	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\TEMP\\fotos\\leao.jpg");
	}

}
