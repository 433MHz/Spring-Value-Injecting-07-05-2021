package pl.krystian.Spring_value_injection;

public class CricketCoach {

	private String emailAddress;
	private String team;
	
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getTeam() {
		return team;
	}
	public void setTeam(String team) {
		this.team = team;
	}
	
	
	public void BeanInitialized() {
    	System.out.println("Bean is now initialized");
    }

    public void BeanDestroyed() {
    	System.out.println("Bean is closing now");
    }
}

