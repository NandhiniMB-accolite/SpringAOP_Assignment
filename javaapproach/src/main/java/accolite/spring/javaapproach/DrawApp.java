package accolite.spring.javaapproach;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DrawApp {

	public static void main(String[] args) {
		ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

	    Triangle triangle = (Triangle)ctx.getBean("Triang");
	    triangle.draw();
	}
}
