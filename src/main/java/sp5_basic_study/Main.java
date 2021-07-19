package sp5_basic_study;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx= new AnnotationConfigApplicationContext(AppContext.class); //스프링 설정클래스
	Greeter format = ctx.getBean("greeter",Greeter.class);
	String msg = format.greet("스프링");
	System.out.println(msg);
	ctx.close();
	}

}
