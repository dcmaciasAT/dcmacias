package com.atsistemas.dcmacias;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.atsistemas.dcmacias.config.Swagger2Config;

@SpringBootApplication
@EnableAutoConfiguration(exclude = {DataSourceAutoConfiguration.class, HibernateJpaAutoConfiguration.class})
@ComponentScan(basePackages = {"com.atsistemas.dcmacias.*"})
@EnableJpaRepositories(basePackages="com.atsistemas.dcmacias.repositories")
@Import(Swagger2Config.class)
public class ApirestApplication implements WebMvcConfigurer{

	public static void main(String[] args) {
		SpringApplication.run(ApirestApplication.class, args);
	}

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
 
           registry.addResourceHandler("swagger-ui.html")
                    .addResourceLocations("classpath:/META-INF/resources/");
 
    }
	
	
//	 @EventListener(ApplicationReadyEvent.class)
//	   public void populateAfterStartup() {
//	  }
}
