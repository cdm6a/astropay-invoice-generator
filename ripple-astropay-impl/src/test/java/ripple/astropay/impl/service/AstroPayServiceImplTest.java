package ripple.astropay.impl.service;

import org.springframework.web.client.RestTemplate;
import ripple.astropay.api.InvoiceRequest;

/**
 * @author cmcnamara
 */
public class AstroPayServiceImplTest {

    // @Test
    public void testGenerateInvoice() throws Exception {
        AstroPayServiceImpl service = new AstroPayServiceImpl(new RestTemplate());
        InvoiceRequest invoiceRequest = getGenericInvoiceRequest();
        service.generateInvoice(invoiceRequest);
    }

    private InvoiceRequest getGenericInvoiceRequest() {
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
        return request;
    }
}
