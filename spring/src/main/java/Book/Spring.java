package Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
public class Spring {
	public static void main(String[] args) {
	    AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
	    ctx.register(AppConfig.class);
	    ctx.refresh();
	    Book book = ctx.getBean(Book.class);
	    System.out.println("Book name:" + book.getBookName());
	    ctx.close();
	}

}
