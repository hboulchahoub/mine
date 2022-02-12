import models.Client;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import presentation.ClientController;

public class ApplicationRunner {

    public static void main(String[] args) {
        ApplicationContext ctx=new ClassPathXmlApplicationContext("spring.xml");
        ClientController ctr= (ClientController) ctx.getBean("ctrl1");
        Client client = new Client("Omar");
        ctr.save(client);
    }
}
