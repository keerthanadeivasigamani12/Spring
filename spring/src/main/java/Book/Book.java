package Book;
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
public class Book {
	private String bookName;
	public Book(String bookName) {
		this.bookName = bookName;
	}
	@PostConstruct
	public void springPostConstruct() {
	     System.out.println("---Do initialization task---");
	     if(bookName != null) {
	    	 System.out.println("bookName property initialized with the value:"+ bookName);
	     }
	}	
	public String getBookName() {
		return bookName;
	}
	@PreDestroy
	public void springPreDestroy() {
		System.out.println("---Release resources or perform destruction task---");
	}

}
