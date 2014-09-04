package ripple.astropay.impl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ripple.astropay.api.AstropayInvoiceRequest;
import ripple.astropay.api.InvoiceRequest;

/**
 * @author cmcnamara
 */
@Service
public class AstroPayServiceImpl {

    private static final String ASTROPAY_URL = "https://astropaycard.com/api_curl/streamline/NewInvoice";
    private static final String X_LOGIN = "";
    private static final String X_TRANS_KEY = "";
    private static final String SECRET_KEY = "";

    private final RestTemplate restTemplate;

    @Autowired
    public AstroPayServiceImpl(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public void generateInvoice(InvoiceRequest request) throws Exception {
        AstropayInvoiceRequest astropayInvoiceRequest = new AstropayInvoiceRequest(X_LOGIN, X_TRANS_KEY, request);
        astropayInvoiceRequest.setControl(AstroPaySigningUtil.GetSign(SECRET_KEY, astropayInvoiceRequest.getControlMessage()));
        String response;
        try {
            response = restTemplate.postForObject(ASTROPAY_URL, astropayInvoiceRequest, String.class);
        } catch (Exception e) {
            System.out.println("The following exception occured when making a generate invoice request: " + e.getMessage());
            return;
        }
        System.out.println(response);
    }
}
