package pl.krystian.Spring_value_injection;

import org.springframework.beans.factory.annotation.Autowired;
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
    	
    	DataShow data = (DataShow) context.getBean("dataShow");
    	
    	System.out.println(data.getData());
    }
}


