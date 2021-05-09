package pl.krystian.Spring_value_injection;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	public String getMessage() {
		return "Database";
	}

}
