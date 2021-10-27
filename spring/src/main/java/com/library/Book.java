package com.library;

	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.beans.factory.annotation.Qualifier;
	import org.springframework.stereotype.Component;



	@Component
	public class Book {

	@Autowired
	@Qualifier("author") // specify the one you want use qualifier
	Booktype bk;


	public Booktype getbk() {
	return bk;
	}
	public void setCpu(Booktype bk) {
	this.bk = bk;
	}
	public void bktype() {
	System.out.println("Book : Harry potter");
	bk.process();
	}



	}

