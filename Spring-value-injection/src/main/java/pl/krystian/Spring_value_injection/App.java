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
    	
    	cricket.setEmailAddress("first Email");
    	
    	
    	CricketCoach cricket2 = context.getBean("cricket", CricketCoach.class);
    	
    	cricket2.setEmailAddress("second email");
    	
    	
    	System.out.println(cricket.getEmailAddress());
    	System.out.println(cricket2.getEmailAddress());
    }
}
