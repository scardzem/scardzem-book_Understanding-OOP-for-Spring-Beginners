package aop003;

import org.aspectj.lang.JoinPoint;

public class MyAspect {
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 열어라.");
//		System.out.println("열쇠로 문을 열고 집에 들어간다.");
	}
}
