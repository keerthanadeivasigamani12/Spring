package library;

public class library {
	private int id;
	private String name;
	private String author;
	
	public library() {
	System.out.println("def cons");
	}
	public library(int id) {
	this.id= id;
	}
	public library(String name) {
	this.name = name;
	}
	public library(int id, String name,String author) {
	this.id = id;
	this.name = name;
	this.author=author;
	}
	public String aPrint(){
	return author;
	}
	public String enPrint(){
	return name;
	}
	void show(){
	String s=enPrint();
	String d=aPrint();
	System.out.println("BOOK ID : "+id+" BOOK NAME : "+s+" AUTHOR : "+d);
	}


}
