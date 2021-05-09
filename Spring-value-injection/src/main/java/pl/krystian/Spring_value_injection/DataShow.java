package pl.krystian.Spring_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DataShow {

	
	@Autowired
	@Qualifier("randomFortuneService")
	FortuneService fortuneService;

	
	public String getData() {
		return fortuneService.getMessage();
	}
	
}
