package accolite.spring.javaapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



@Configuration
public class AppConfig {
	
	@Bean(name="Triang")
	public Triangle getTriangle() {
		return new Triangle(15.5,20);	
	}
	
	@Bean(name="pointA")
	public Point getPointA() {
		return new Point(11,21);
	}

	@Bean(name="pointB")
	public Point getPointB() {
		return new Point(12,20);
	}

	@Bean(name="pointC")
	public Point getPointC() {
		return new Point(13,19);
	}

	@Bean(name="pointD")
	public Point getPointD() {
		return new Point(12,20);
	}

	

}
