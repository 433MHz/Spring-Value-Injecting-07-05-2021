package pl.krystian.Spring_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	@Autowired
	private Name name;

	public String getData() {
		return this.name.getName();
	}

	
}

