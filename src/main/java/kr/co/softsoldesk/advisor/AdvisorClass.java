package kr.co.softsoldesk.advisor;

import org.aspectj.lang.ProceedingJoinPoint;


public class AdvisorClass {
	
	public void beforeMethod() {
		System.out.println("beforeMethod 호출");
	}
	public void afterMethod() {
		System.out.println("afterMethod 호출");
	}
	

	public int aroundIntMethod(ProceedingJoinPoint pjp) throws Throwable{ 
		System.out.println("aroundIntMethod 호출1");
		
		// 원래의 메소드를 호출하여 실행시점 명시하기
		int a1=(Integer)pjp.proceed();
		
		System.out.println("aroundIntMethod 호출2");
		
		return a1;
	}
	
	// 정상적으로 끝났을때
	public void afterReturningMethod() {
		System.out.println("afterReturningMethod 메소드 => 정상종료");
	}
	// 예외 발생할 떄 실행되는 메소드
	public void afterThrowingMethod() {
		System.out.println("afterThrowingMethod 메소드 => 예외발생");
	}
	
	
}
