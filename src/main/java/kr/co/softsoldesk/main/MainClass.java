package kr.co.softsoldesk.main;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.co.softsoldesk.beans.JdbcBean;
import kr.co.softsoldesk.config.BeanConfigClass;
import kr.co.softsoldesk.mapper.MapperInterface;

public class MainClass {

	public static void main(String[] args) {
		
		System.out.println("-------------------------------JAVA----------------------------------");

		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		MapperInterface mapper=ctx.getBean("test_mapper", MapperInterface.class);
		
		JdbcBean bean2=new JdbcBean();
		//bean2.setInt_data(12);
		//bean2.setStr_data("Project Setting");
		//mapper.insert_data(bean2);
		
		// select
		List<JdbcBean> list=mapper.select_data();
		for(JdbcBean bean1:list){
			System.out.println("int_data : "+bean1.getInt_data());
			System.out.println("str_data : "+bean1.getStr_data());
			System.out.println("---------------------------------");
		}
		// updata
		//JdbcBean bean3=new JdbcBean();
		//bean3.setStr_data("aaaaa");
		//bean3.setInt_data(10);
		//mapper.update_data(bean3);
		
		// delete
		mapper.delete_data(10);
		
		
		
		System.out.println("저장완료");
		ctx.close();
	}

}
