package JavaTask;

import java.awt.desktop.AppEvent;
import java.sql.SQLOutput;
import java.util.Scanner;

class Persons {
    private int id;
    private String name;
    private double amount;

    public Persons(int id, String name, double amount) {
        this.id = id;
        this.name = name;
        this.amount = amount;
    }

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

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
    //    void displayPersonsDetails() {
//        System.out.println("Persons Id: " + id);
//        System.out.println("Persons Name : "+ name);
//        System.out.println("Persons Amount :"+ amount);
//    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Id: ");
        int it = scanner.nextInt();
        System.out.println("Enter The Name: ");
        String st = scanner.next();
        System.out.println("Enter The Amount: ");
        double to = scanner.nextDouble();
        Persons pe = new Persons(it,st,to);
        System.out.println(pe.getId());
        System.out.println(pe.getName());
        System.out.println(pe.getAmount());
        System.out.println("Enter the id: ");
        int er = scanner.nextInt();
        System.out.println("Enter the name");
        String qr = scanner.next();
        System.out.println("Enter The Amount:");
        double tr =scanner.nextDouble();
        Persons se = new Persons(er,qr,tr);
        System.out.println(se.getId());
        System.out.println(se.getName());
        System.out.println(se.getAmount());
    }
}
