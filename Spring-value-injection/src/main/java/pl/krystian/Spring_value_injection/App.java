package pl.krystian.Spring_value_injection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
    	
    	CricketCoach cricket = context.getBean("cricket", CricketCoach.class);
    	
    	System.out.println(cricket.getEmailAddress() + " " + cricket.getTeam());
    }
}
