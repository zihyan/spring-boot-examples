package Bean.Testing;

import com.App.AppConfig;
import org.apache.catalina.core.ApplicationContext;
import org.junit.jupiter.api.Test;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import javax.print.StreamPrintService;

@SpringBootApplication
public class SpringBeanApplicationTests {

    public static void main(String[] args){
        SpringApplication.run(SpringBeanApplicationTests.class,args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        context.getBean("myBean");
    }
}
