package vista;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static ApplicationContext context;
	
	static {
		context = new ClassPathXmlApplicationContext("beans.xml");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		VistaVideojuegos vv = new VistaVideojuegos();
		vv.arrancar();
	}

}
