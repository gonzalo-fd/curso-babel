package spring4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main4 {
	private static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans4.xml");
	}
	
	public static void main(String[] args) {
		Coche coche = context.getBean("coche",Coche.class);
		System.out.println(coche);
	}
}
