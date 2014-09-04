package ripple.astropay.api;

/**
 * @author cmcnamara
 */
public class AstropayInvoiceResponse {

    private String status;
    private String link;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    @Override
    public String toString() {
        return "AstropayInvoiceResponse{" +
                "status='" + status + '\'' +
                ", link='" + link + '\'' +
                '}';
    }
}
