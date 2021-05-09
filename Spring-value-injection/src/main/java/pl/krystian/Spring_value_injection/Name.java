package pl.krystian.Spring_value_injection;

import org.springframework.stereotype.Component;

@Component
public class Name {
	
	private String name;
	
	Name(){
		this.name = "Krystian";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
