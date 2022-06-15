package com.wondong.halre.wondonghalre;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class WondonghalreApplication {

	public static void main(String[] args) {
		SpringApplication.run(WondonghalreApplication.class, args);
	}

}
