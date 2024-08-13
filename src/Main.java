import JavaTask.Task2;
import JavaTask.Task3;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The id:");
        int it=scanner.nextInt();
        System.out.println("Enter The Name:");
        String st=scanner.next();
        System.out.println("Enter The Password:");
        String ot=scanner.next();
        System.out.println("Enter The  Price");
        double sp=scanner.nextDouble();
        Task3 obj = new Task3(it,st,ot,sp);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getPassword());
        System.out.println(obj.getPrice());
    }
}