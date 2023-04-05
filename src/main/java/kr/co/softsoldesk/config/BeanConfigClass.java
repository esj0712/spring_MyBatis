package kr.co.softsoldesk.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softsoldesk.beans.DataBean3;
import kr.co.softsoldesk.beans.DataBean4;
import kr.co.softsoldesk.beans.DataBean5;
import kr.co.softsoldesk.beans.TestBean3;

@Configuration //필수!!
@ComponentScan(basePackages = "kr.co.softsoldesk.beans")
public class BeanConfigClass {
	
	@Bean
	public DataBean3 obj4(){
		return new DataBean3();
	}
	@Bean
	public DataBean3 obj5(){
		return new DataBean3();
	}
	
	@Bean
	public TestBean3 java3() {
		TestBean3 t2=new TestBean3(300, "soft", new DataBean4(), new DataBean5());
		return t2;
		
	}
}
