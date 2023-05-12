package aop004;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

//aop004 : POJO XML기반으로 aspect를 구현하는 예시 / before, after를 구현함.
public class Start {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("aop004/aop004.xml");
		
		Person romeo = context.getBean("boy", Person.class);
		Person juliet = (Person)context.getBean("girl");
		
		romeo.runSomething();
		juliet.runSomething();
	}

}
