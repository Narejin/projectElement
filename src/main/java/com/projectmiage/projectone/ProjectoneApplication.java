package com.projectmiage.projectone;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import com.projectmiage.projectone.entity.Famille;
import com.projectmiage.projectone.repository.FamilleRepository;

@SpringBootApplication
@RestController
public class ProjectoneApplication {
	
	@Autowired
	FamilleRepository familleRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ProjectoneApplication.class, args);
	}

	@GetMapping("/helloWorld")
	public String getHelloWorld() {
		return "HelloWorld";
	}

	@GetMapping("/helloWorld/{text}")
	public String getUserText(@PathVariable String text) {
		return text;
	}

	@GetMapping("/getFamilles")
	public List<Famille> getAllFamilles() {
		return familleRepository.getFamilles();
	}
	
	@GetMapping("/getFamille/{id}")
	public Famille getOneFamille(@PathVariable Long id) {
		return familleRepository.getFamille(id);
	}

}

