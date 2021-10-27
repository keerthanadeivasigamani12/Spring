package Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
@Configuration
public class AppConfig {

@Bean	
public Book book(){
return new Book("Ramayana");
}
} 