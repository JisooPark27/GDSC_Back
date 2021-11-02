package seoultech.gdsc.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringBootRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootRunner.class, args);
	}

}
