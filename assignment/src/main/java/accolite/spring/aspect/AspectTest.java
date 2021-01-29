package accolite.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class AspectTest {

	@After("execution(public void accolite.spring.assignment.Question.displayInfo())")
	public void nameTest() {
		System.out.println("In Aspect After Set Name");
	}
	
   @AfterReturning("execution(public void displayInfo())")
	public void ReturningAdvice() {
		System.out.println("In Aspect After Returning Set Name");
	}

	@AfterThrowing("execution(public void getName())")
	public void ThrowingAdvice() {
		System.out.println("In Aspect After throwing Display Info ");
	}
	
	@Around("execution(public void displayInfo())")
	public void AroundTest() {
		System.out.println("In Aspect Around Dispaly info, Time take is ");
		System.out.println(System.currentTimeMillis());
	}

}
