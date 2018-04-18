package guru.springframework.repository;

import org.springframework.beans.factory.annotation.Autowired;

import guru.springframework.services.EnglishGreetingService;
import guru.springframework.services.GreetingServices;
import guru.springframework.services.KannadaGreetingService;
import guru.springframework.services.MalayalamGreetingService;

public class GreetingServicesFactory {
	
	
	@Autowired
	private GreetingRepository grtRepo;

	public GreetingServicesFactory(GreetingRepository grtRepo) {
		this.grtRepo = grtRepo;
	}
	
	public GreetingServices createGreetingService(String lang) {
		
		switch(lang) {
		
		case "en": 
			return new EnglishGreetingService(grtRepo);
		case "ka": 
			return new KannadaGreetingService(grtRepo);
		case "ma": 
			return new MalayalamGreetingService(grtRepo);
		default: 
			return new EnglishGreetingService(grtRepo);
		
		
		}
		
	}

}
