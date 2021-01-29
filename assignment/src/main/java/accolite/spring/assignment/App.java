package accolite.spring.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext factory = new FileSystemXmlApplicationContext("assignment.xml");
    	Question q= (Question)factory.getBean("q");
    	q.displayInfo();
    	
    }
}
