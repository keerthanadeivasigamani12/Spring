package com.library;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.annotation.AnnotationConfigApplicationContext;



	public class Bookdetails {

	public static void main(String[] args) {

	ApplicationContext factory = new AnnotationConfigApplicationContext(bookconfig.class);

	Book pro = factory.getBean(Book.class);
	pro.bktype();
	}


	}

