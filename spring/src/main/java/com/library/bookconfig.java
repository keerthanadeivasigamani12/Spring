package com.library;


	import org.springframework.context.annotation.Bean;
	import org.springframework.context.annotation.ComponentScan;
	import org.springframework.context.annotation.Configuration;



	@Configuration
	@ComponentScan(basePackages="com.library")
	public class bookconfig {

	// @Bean
	// public Book getBook() {
	// return new Book();
	// }
	//
	// @Bean
	// public Booktype getBooktype() {
	// return new author();
	// }
}
