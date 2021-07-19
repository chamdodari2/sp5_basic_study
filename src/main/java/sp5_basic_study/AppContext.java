package sp5_basic_study;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppContext {
	
	
	@Bean
	public Greeter greeter() {
		Greeter format = new Greeter();
		format.setFormat("%s, 안녕하세요");
		return format;
	}

}
