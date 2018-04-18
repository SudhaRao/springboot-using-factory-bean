package guru.springframework.services;

import guru.springframework.repository.GreetingRepository;

public class EnglishGreetingService implements GreetingServices{
	
	private GreetingRepository greetingRepo;
	
	public EnglishGreetingService(GreetingRepository greetingRepo) {
		this.greetingRepo = greetingRepo;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from English Greeting Service :: " + greetingRepo.getEnglishGreeting();
	}

}
