package kr.co.softsoldesk.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.TestBean1;
import kr.co.softsoldesk.beans.TestBean2;
import kr.co.softsoldesk.beans.TestBean3;
import kr.co.softsoldesk.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		
		System.out.println("====================================JAVA=======================================");
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		System.out.println("--------------------------------------------------");
		TestBean1 t1=ctx.getBean(TestBean1.class);
		System.out.println("t1 : "+t1.getData1());
		System.out.println("t2 : "+t1.getData2());
		System.out.println("t3 : "+t1.getData3());
		System.out.println("t4 : "+t1.getData4());
		System.out.println("t5 : "+t1.getData5());
		System.out.println("--------------------------------------------------");
		TestBean2 t2=ctx.getBean(TestBean2.class);
		System.out.println("t1 : "+t2.getData1());
		System.out.println("t2 : "+t2.getData2());
		System.out.println("t3 : "+t2.getData3());
		System.out.println("t4 : "+t2.getData4());
		System.out.println("--------------------------------------------------");
		TestBean3 java3=ctx.getBean("java3",TestBean3.class);
		System.out.println("t1 : "+java3.getData1());
		System.out.println("t2 : "+java3.getData2());
		System.out.println("t3 : "+java3.getData3());
		System.out.println("t4 : "+java3.getData4());
		System.out.println("--------------------------------------------------");
		
		ctx.close();
	}

}
