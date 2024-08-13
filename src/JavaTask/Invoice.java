package JavaTask;

public class Invoice {

    private int invoiceNumber;
    private String clientName;
    private double amount;
    private String description;

    // Default constructor
    public Invoice() {
        this.invoiceNumber = 0;
        this.clientName = "Unknown";
        this.amount = 0.0;
        this.description = "No description";
    }

    // Constructor with only invoiceNumber
    public Invoice(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = "Unknown";
        this.amount = 0.0;
        this.description = "No description";
    }

    // Constructor with invoiceNumber and clientName
    public Invoice(int invoiceNumber, String clientName) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
        this.amount = 0.0;
        this.description = "No description";
    }

    // Constructor with invoiceNumber, clientName, and amount
    public Invoice(int invoiceNumber, String clientName, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
        this.amount = amount;
        this.description = "No description";
    }

    // Constructor with all fields
    public Invoice(int invoiceNumber, String clientName, double amount, String description) {
        this.invoiceNumber = invoiceNumber;
        this.clientName = clientName;
        this.amount = amount;
        this.description = description;
    }

    // Getters and Setters
    public int getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(int invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                "invoiceNumber=" + invoiceNumber +
                ", clientName='" + clientName + '\'' +
                ", amount=" + amount +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Invoice obj = new Invoice();
        System.out.println(obj.invoiceNumber);
        System.out.println(obj.clientName);
        System.out.println(obj.amount);
        System.out.println(obj.description);
        Invoice obj1 =  new Invoice(1);
        System.out.println(obj1.invoiceNumber);
        System.out.println(obj1.clientName);
        System.out.println(obj1.amount);
        System.out.println(obj1.description);
        Invoice obj2 = new Invoice(1,"Arun");
        System.out.println(obj2.invoiceNumber);
        System.out.println(obj2.clientName);
        System.out.println(obj2.amount);
        System.out.println(obj2.description);
        Invoice obj3 = new Invoice(1,"Arun",500);
        System.out.println(obj3.invoiceNumber);
        System.out.println(obj3.clientName);
        System.out.println(obj3.amount);
        System.out.println(obj3.description);
        Invoice obj4 = new Invoice(1,"Arun",500,"good");
        System.out.println(obj4.invoiceNumber);
        System.out.println(obj4.clientName);
        System.out.println(obj4.amount);
        System.out.println(obj4.description);

    }
}
