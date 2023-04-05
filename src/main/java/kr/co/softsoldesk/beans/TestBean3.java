package kr.co.softsoldesk.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class TestBean3 {

	private int data1;
	private String data2;
	private DataBean4 data3;
	private DataBean5 data4;
	
	//Required 가 버젼 5.대에서 사용하지 않으므로 생성자를 통해서 주입
	public TestBean3(@Value("200") int data1, @Value("software") String data2, DataBean4 data3, DataBean5 data4) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
		this.data4 = data4;
	}
	
	public int getData1() {
		return data1;
	}
	public String getData2() {
		return data2;
	}
	public DataBean4 getData3() {
		return data3;
	}
	public DataBean5 getData4() {
		return data4;
	}
	
	
}
