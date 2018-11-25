package org.sang;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class Test22JpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(Test22JpaApplication.class, args);
	}
}
