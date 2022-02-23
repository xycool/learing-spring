package kr.co.softcampus.main;

//import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.ch14.MainClass14;

public class MainClass {

	public static void main(String[] args) {
		
		// 14강, 자동주입
		MainClass14 mc = new MainClass14();		
		mc.run(args);
		
		
		
//		// TODO Auto-generated method stub
//		// beans.xml 파일을 로딩한다.
//		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
//		
//		// xml에 정의한 bean 객체의 주소값을 가져온다.
//		HelloWorld hello1 = (HelloWorld)ctx.getBean("hello");
//		callMethod(hello1);
//		
//		HelloWorld hello2 = ctx.getBean("hello", HelloWorld.class);
//		callMethod(hello2);
//		
//		ctx.close();
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
