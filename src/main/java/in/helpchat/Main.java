package in.helpchat;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.File;
import java.io.IOException;

/**
 * Created by gauravwadhwa on 12/09/16.
 */
public class Main {

    public static void main(String[] args) throws IOException {
        FileSystemResource classPathResource = new FileSystemResource("src/main/resources/xml/greeting.xml");
        System.out.println(classPathResource.getFile().getAbsoluteFile());
        BeanFactory beanFactory = new XmlBeanFactory(classPathResource);
        GreetingService service = (GreetingService) beanFactory.getBean("greetingService");
        service.greeting();
        service = (GreetingService) beanFactory.getBean("greetingService");
        service.greeting();

    }
}
