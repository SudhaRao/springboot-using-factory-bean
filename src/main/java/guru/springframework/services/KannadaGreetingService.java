package guru.springframework.services;

import guru.springframework.repository.GreetingRepository;

public class KannadaGreetingService implements GreetingServices{
	
	private GreetingRepository greetingRepo;
	
	public KannadaGreetingService(GreetingRepository greetingRepo) {
		super();
		this.greetingRepo = greetingRepo;
	}

	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from  Kannada Greeting Service :: " +greetingRepo.getKannadaGreeting();
	}

}
