package library;

public class bookdetails {
	private int bookcode;
	private String language;
	public int getBookcode() {
		return bookcode;
	}
	public void setBookcode(int bookcode) {
		this.bookcode = bookcode;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
		
		
	}
	void display(){
		System.out.println("Book Code : "+bookcode);
		System.out.println("Language : "+language);
	}
}
