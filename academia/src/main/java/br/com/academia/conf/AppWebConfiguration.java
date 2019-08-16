package br.com.academia.conf;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import br.com.academia.controller.HomeController;
import br.com.academia.daos.CategoriaDAO;

@EnableWebMvc
@ComponentScan(basePackageClasses = {HomeController.class, CategoriaDAO.class})
public class AppWebConfiguration {
	@Bean
	public InternalResourceViewResolver internalResourceViewResolver() {	
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/Views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
}
