package JavaTask;



public class Task3 {
    private int id;
    private String name;
    private String password;
    private Double price;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Task3(int id, String name, String password,  Double price) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.price = price;
    }
}
