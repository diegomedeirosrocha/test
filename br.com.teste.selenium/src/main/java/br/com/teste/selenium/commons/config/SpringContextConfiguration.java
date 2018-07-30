package br.com.teste.selenium.commons.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:/a/test-config.properties")
@ComponentScan(basePackages = "br.com.teste.selenium")
public class SpringContextConfiguration {

	@Bean
	public static SpringContextConfiguration propertySpringContextConfiguration() {
		return new SpringContextConfiguration();
	}

}
