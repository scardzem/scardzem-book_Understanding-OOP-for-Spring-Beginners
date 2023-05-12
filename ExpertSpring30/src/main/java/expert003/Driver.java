package expert003;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("expert003/expert003.xml");
		
		Car car = context.getBean("car", Car.class);
		System.out.println(car.getTireBrand());  
		//expert003.xml에서 차를 구매하면 타이어도 장착된 채로 구매할 수 있게 되어 있다.
	}

}
