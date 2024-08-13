package JavaTask;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Task1 {
    private String name;
    private int id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
        public Task1(String name, int id) {
        this.id = id;
        this.name = name;
    }

//    public void PrintDetails() {
//        System.out.println("Name: " + this.name + ", Id : " + this.id);
//    }

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter  the Name:");
        String name= scanner.nextLine();
        System.out.println("Enter the id:");
       int Id = scanner.nextInt();
        Task1 ar=new Task1(name,Id);
        System.out.println(ar.getName());
        System.out.println(ar.getId());
    }
}

