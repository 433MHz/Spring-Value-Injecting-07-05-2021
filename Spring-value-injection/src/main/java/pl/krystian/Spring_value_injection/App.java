package pl.krystian.Spring_value_injection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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
    	
    	Coach coach = context.getBean("cricketCoach", Coach.class);
    	
    	System.out.println(coach.getData());
    	
    	context.close();
    }
}


