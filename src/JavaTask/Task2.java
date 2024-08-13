package JavaTask;

import java.util.Scanner;

public class Task2 {
    private int id;
    private String name;
    private String password;

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

    public Task2(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Id:");
        int ot = scanner.nextInt();
        System.out.println("Enter The Name:");
        String st = scanner.next();
        System.out.println("Enter The Password:");
        String vt = scanner.next();
        Task2 obj = new Task2(ot,st,vt);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getPassword());
    }
}
