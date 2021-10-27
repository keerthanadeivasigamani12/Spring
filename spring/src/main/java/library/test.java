package library;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
public class test {
	public static void main(String[] args) {
		Resource resource=new ClassPathResource("library.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		library l1=(library)factory.getBean("book");
		l1.show();
		author a1=(author)factory.getBean("b2");
		a1.show();
		bookdetails bd=(bookdetails)factory.getBean("set");
		bd.display();
}
}