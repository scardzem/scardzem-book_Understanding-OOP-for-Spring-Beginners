package aop001;

public class Start {

	//AOP개념 설명을 위한 예시; 핵심 관심사와 횡단 관심사 설명을 위한 예시. Boy와 Girl에 공통되는 횡단 관심사와 각각 개별적인 핵심 관심사가 있다.
	
	public static void main(String[] args) {
		Boy romeo = new Boy();
		Girl Juliet = new Girl();
		
		romeo.runSomething();
		System.out.println("----------");
		Juliet.runSomething();
	}

}
