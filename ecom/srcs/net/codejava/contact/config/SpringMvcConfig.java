package net.codejava.contact.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.multipart.commons.CommonsMultipartResolver;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


import net.codejava.contact.dao.BoekenDAO;
import net.codejava.contact.dao.BoekenDAOImpl;
import net.codejava.contact.dao.ShoppingDAO;
import net.codejava.contact.dao.ShoppingDAOImpl;
import net.codejava.contact.service.ShoppingService;
import net.codejava.contact.service.ShoppingServiceImpl;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "net.codejava.contact")
@EnableTransactionManagement
public class SpringMvcConfig implements WebMvcConfigurer{

	@Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry
          .addResourceHandler("/resources/**")
          .addResourceLocations("/resources/");
    }
	
	
	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("com.mysql.jdbc.Driver");
		dataSource.setUrl("jdbc:mysql://localhost:3306/db_books?serverTimezone=Europe/Amsterdam");
		dataSource.setUsername("root");
		dataSource.setPassword("34dilv;1223gKK");
		
		return dataSource;
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		
		return resolver;
	}
	
	@Bean
	public PlatformTransactionManager txManager() {
		return new DataSourceTransactionManager(getDataSource());
	}
	
	@Bean(name = "multipartResolver")
	public CommonsMultipartResolver multipartResolver() {
		CommonsMultipartResolver resolver = new CommonsMultipartResolver();
		resolver.setDefaultEncoding("UTF-8");
		return resolver;
	}
	
	/*@Bean
	public BoekenDAO getBoekenDAO() {
		return new BoekenDAOImpl(getDataSource());
	}*/
	 
	/*@Bean
	public ShoppingService getShoppingService() {
		return new ShoppingServiceImpl(getDataSource());
	}*/
	
	/*@Bean
	public ShoppingDAO getShoppingDAO() {
		return new ShoppingDAOImpl(getDataSource());
	}*/
}
