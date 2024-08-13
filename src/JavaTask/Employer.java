package JavaTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Employer {
    private String name;
    private String jobTitle;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employer(String name, String jobTitle, double salary){
        this.name=name;
        this.jobTitle=jobTitle;
        this.salary=salary;
    }
    public void  applyRasie(double percantage){
        if (percantage>=0){
            salary +=salary*(percantage/100);
            System.out.println("Salary updated by " + percantage + "%. New salary: " + salary);
        }
        else {
            System.out.println("Invalid percentage. Raise percentage should be positive.");
        }
    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The Name: ");
        String st = scanner.next();
        System.out.println("Enter The JobTilte: ");
        String ty = scanner.next();
        System.out.println("Enter The Salary: ");
        double ko = scanner.nextDouble();
        Employer com = new Employer(st,ty,ko);
        System.out.println(com.getName());
        System.out.println(com.getJobTitle());
        System.out.println(com.getSalary());
        com.applyRasie(10.5);
    }
}
