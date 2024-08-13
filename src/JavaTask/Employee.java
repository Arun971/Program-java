package JavaTask;

import java.util.Scanner;

public class Employee {
    private int employee_id;
    private String employee_name;
    private double salary;

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Employee(int employee_id, String employee_name, double salary) {
        this.employee_id = employee_id;
        this.employee_name = employee_name;
        this.salary = salary;
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
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter The Employee Id:  ");
        int in=scanner.nextInt();
        System.out.println("Enter The Employee Name:  ");
        String st = scanner.next();
        System.out.println("Enter  The  Salary:  ");
        double to =scanner.nextDouble();
        Employee person = new Employee(in,st,to);
        System.out.println(person.getEmployee_id());
        System.out.println(person.getEmployee_name());
        System.out.println(person.getSalary());
        person.applyRasie(99);
    }
}
