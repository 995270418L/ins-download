package com.steve.insdownloader;

import com.steve.framework.web.error.InsExceptionController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class InsDownloaderApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(InsDownloaderApplication.class, args);
	}

	@Autowired
	private InsExceptionController insExceptionController;

	@Override
	public void run(String... strings) throws Exception {
		System.out.println("#################################");
		insExceptionController.getErrorPath();
	}
}
