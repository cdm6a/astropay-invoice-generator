package ripple.astropay.api;

/**
 * @author cmcnamara
 */
public class AstropayInvoiceRequest {

    private String x_login;
    private String x_trans_key;
    private String x_invoice;
    private double x_amount;
    private String x_currency;
    private String x_bank;
    private String x_country;
    private String x_description;
    private String x_iduser;
    private String x_cpf;
    private String x_name;
    private String x_email;
    private String x_bdate;
    private String x_zip;
    private String x_address;
    private String x_city;
    private String x_state;
    private String Control;

    public AstropayInvoiceRequest(String x_login, String x_trans_key, InvoiceRequest invoiceRequest) {
        this.x_login = x_login;
        this.x_trans_key = x_trans_key;
        this.x_invoice = invoiceRequest.getInvoice();
        this.x_amount = invoiceRequest.getAmount();
        this.x_currency = invoiceRequest.getCurrency();
        this.x_bank = invoiceRequest.getBank();
        this.x_country = invoiceRequest.getCountry();
        this.x_description = invoiceRequest.getDescription();
        this.x_iduser = invoiceRequest.getIduser();
        this.x_cpf = invoiceRequest.getCpf();
        this.x_name = invoiceRequest.getName();
        this.x_email = invoiceRequest.getEmail();
        this.x_bdate = invoiceRequest.getBdate();
        this.x_zip = invoiceRequest.getZip();
        this.x_address = invoiceRequest.getAddress();
        this.x_city = invoiceRequest.getCity();
        this.x_state = invoiceRequest.getState();
    }

    public String getX_login() {
        return x_login;
    }

    public void setX_login(String x_login) {
        this.x_login = x_login;
    }

    public String getX_trans_key() {
        return x_trans_key;
    }

    public void setX_trans_key(String x_trans_key) {
        this.x_trans_key = x_trans_key;
    }

    public String getX_invoice() {
        return x_invoice;
    }

    public void setX_invoice(String x_invoice) {
        this.x_invoice = x_invoice;
    }

    public double getX_amount() {
        return x_amount;
    }

    public void setX_amount(double x_amount) {
        this.x_amount = x_amount;
    }

    public String getX_currency() {
        return x_currency;
    }

    public void setX_currency(String x_currency) {
        this.x_currency = x_currency;
    }

    public String getX_bank() {
        return x_bank;
    }

    public void setX_bank(String x_bank) {
        this.x_bank = x_bank;
    }

    public String getX_country() {
        return x_country;
    }

    public void setX_country(String x_country) {
        this.x_country = x_country;
    }

    public String getX_description() {
        return x_description;
    }

    public void setX_description(String x_description) {
        this.x_description = x_description;
    }

    public String getX_iduser() {
        return x_iduser;
    }

    public void setX_iduser(String x_iduser) {
        this.x_iduser = x_iduser;
    }

    public String getX_cpf() {
        return x_cpf;
    }

    public void setX_cpf(String x_cpf) {
        this.x_cpf = x_cpf;
    }

    public String getX_name() {
        return x_name;
    }

    public void setX_name(String x_name) {
        this.x_name = x_name;
    }

    public String getX_email() {
        return x_email;
    }

    public void setX_email(String x_email) {
        this.x_email = x_email;
    }

    public String getX_bdate() {
        return x_bdate;
    }

    public void setX_bdate(String x_bdate) {
        this.x_bdate = x_bdate;
    }

    public String getX_zip() {
        return x_zip;
    }

    public void setX_zip(String x_zip) {
        this.x_zip = x_zip;
    }

    public String getX_address() {
        return x_address;
    }

    public void setX_address(String x_address) {
        this.x_address = x_address;
    }

    public String getX_city() {
        return x_city;
    }

    public void setX_city(String x_city) {
        this.x_city = x_city;
    }

    public String getX_state() {
        return x_state;
    }

    public void setX_state(String x_state) {
        this.x_state = x_state;
    }

    public String getControl() {
        return Control;
    }

    public void setControl(String control) {
        Control = control;
    }

    public String getControlMessage() {
        StringBuilder builder = new StringBuilder(this.x_invoice).append("V");
        builder.append(this.x_amount).append("I");
        builder.append(this.x_iduser).append("2");
        builder.append(this.x_bank).append("1");
        builder.append(this.x_cpf).append("H");
        builder.append(this.x_bdate).append("G");
        builder.append(this.x_email).append("Y");
        builder.append(this.x_zip).append("A");
        builder.append(this.x_address).append("P");
        builder.append(this.x_city).append("S");
        builder.append(this.x_state).append("P");
        return builder.toString();
    }
}
