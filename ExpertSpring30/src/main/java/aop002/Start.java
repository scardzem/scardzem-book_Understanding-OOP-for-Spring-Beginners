package aop002;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//aop002 : 어노테이션 기반으로 AOP를 구현함. before만 구현.

public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop002/aop002.xml");
		
		Person romeo = context.getBean("boy", Person.class);
		Person juliet = (Person)context.getBean("girl");
		
		romeo.runSomething();
		juliet.runSomething();
	}

}
