package guru.springframework.repository;

import org.springframework.stereotype.Component;

@Component
public class GreetingRepositoryImpl implements GreetingRepository{

	@Override
	public String getEnglishGreeting() {
		// TODO Auto-generated method stub
		return "Hello !!!";
	}

	@Override
	public String getMalayalamGreeting() {
		// TODO Auto-generated method stub
		return "Namaste";
	}

	@Override
	public String getKannadaGreeting() {
		// TODO Auto-generated method stub
		return "Namaskara";
	}

}
