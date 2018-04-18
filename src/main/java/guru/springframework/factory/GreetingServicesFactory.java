package guru.springframework.factory;

import guru.springframework.services.EnglishGreetingService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.repository.GreetingRepository;
import guru.springframework.services.GreetingServices;
import guru.springframework.services.KannadaGreetingService;
import guru.springframework.services.MalayalamGreetingService;


public class GreetingServicesFactory {
	
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
