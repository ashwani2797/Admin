package in.examrack.Admin;

import in.examrack.Admin.services.SampleService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdminApplication {
	private static ApplicationContext applicationContext;

	public static void main(String[] args) {

		applicationContext = SpringApplication.run(AdminApplication.class, args);
		displayAllBeans();
	}

	@Bean
	public ApplicationContext applicationContext(){
		return applicationContext;
	}

	@Bean
	@Qualifier("rename")
	public SampleService sampleSer(){
		return  new SampleService("Bean from app");
	}

	public static void displayAllBeans() {
		String[] allBeanNames = applicationContext.getBeanDefinitionNames();
		for(String beanName : allBeanNames) {
			System.out.println(beanName);
		}
	}
}
