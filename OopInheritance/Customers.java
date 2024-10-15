package OopInheritance;

public class Customers {
    private String customerName;
    private int creditLimit;
    private String emailAddress;

    public Customers() {
        this("Aman Khan", "amankhan06a@gmail.com");
    }

    public Customers(String customerName, String emailAddress) {
        this(customerName, 1111, emailAddress);
    }

    public Customers(String customerName, int creditLimit, String emailAddress) {
        this.customerName = customerName;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

}
