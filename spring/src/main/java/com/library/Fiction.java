package com.library;


	import org.springframework.context.annotation.Primary;
	import org.springframework.stereotype.Component;



	@Component
	@Primary
	public class Fiction implements Booktype {

	public void process() {

	System.out.println("Book belongs to fiction Category");

	}



	}

