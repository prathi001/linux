package demo.project.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableWebMvc

public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
//*if(demoModel1.isPresent())
		//demoModel1.setName(demoModel.getName() != null? demoModel.getName(): demoModel1.getName());
	//	demoModel.setId((demoModel.getId()));
		//return demoRepository.save(demoModel1)//*

