package ripple.astropay.impl.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ripple.astropay.api.InvoiceRequest;

/**
 * @author cmcnamara
 */
public class Main {

    public static InvoiceRequest getGenericInvoiceRequest() {
        InvoiceRequest request = new InvoiceRequest();
        request.setInvoice("Invoice1234");
        request.setAmount(199.95);
        request.setCurrency("USD");
        request.setBank("SM");
        request.setCountry("BR");
        request.setDescription("Hello, this is a description");
        request.setIduser("Userivan123");
        request.setCpf("123456789");
        request.setName("Ivan Lolivier");
        request.setEmail("ivan@astropaycard.com");
        request.setBdate("19851908");
        request.setZip("11300");
        request.setAddress("Bonavita 1225");
        request.setCity("Montevideo");
        request.setState("MO");
        return request;
    }

    public static void main(String[] args) throws Exception {
        ApplicationContext context = new ClassPathXmlApplicationContext("ripple-astropay-impl-context.xml");
        AstroPayServiceImpl service = context.getBean(AstroPayServiceImpl.class);
        service.generateInvoice(getGenericInvoiceRequest());
    }
}
