package org.hassen.hopital;

import org.hassen.hopital.repositories.PatientRepository;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HopitalApplication {

	public static void main(String[] args) {
		SpringApplication.run(HopitalApplication.class, args);
	}

	// @Bean
	CommandLineRunner start(PatientRepository patientRepository){
		return args->{
			/*Page<Patient> lis=patientRepository.findAll(PageRequest.of(0,10));
			System.out.println(lis.getContent());
			System.out.println("***********");
			System.out.println(lis.getTotalPages());
			System.out.println(lis.getTotalElements());
			System.out.println(lis.getNumberOfElements());
			System.out.println(lis.getNumber());*/
		};
	}

}
