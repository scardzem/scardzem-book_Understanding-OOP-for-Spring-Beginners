package aop005;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class MyAspect {
//	@Before("execution(* runSomething())")
//	public void before(JoinPoint joinPoint) {
//		System.out.println("얼굴 인식 확인 : 문을 열어라.");
//	}
//	@After("execution(* runSomething())")
//	public void lockDoor(JoinPoint joinPoint) {
//		System.out.println("외출 확인 : 문 잠가라.");
//	}
	
	//위의 주석 된 코드를 리팩터링. 중복되는 코드가 있어서 라고함. (313페이지)
	@Pointcut("execution(* runSomething())")
	public void iampc() {
		//여기엔 무엇을 작성해도 의미가 없음.
	}
	
	@Before("iampc()")
	public void before(JoinPoint joinPoint) {
		System.out.println("얼굴 인식 확인 : 문을 열어라.");
	}
	
	@After("iampc()")
	public void lockDoor(JoinPoint joinPoint) {
		System.out.println("외출 확인 : 문 잠가라.");
	}
}
