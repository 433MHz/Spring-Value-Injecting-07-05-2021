package pl.krystian.Spring_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CricketCoach implements Coach{

	private Name name;

	public String getData() {
		return this.name.getName();
	}

	
	@Autowired
	public void setName(Name name) {
		this.name = name;
	}
	
}

