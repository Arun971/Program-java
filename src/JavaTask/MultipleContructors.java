package JavaTask;

import com.sun.jdi.PathSearchingVirtualMachine;

public class MultipleContructors {
    private int id;
    private String name;

    public MultipleContructors() {
        this.id = 0;
        this.name ="Unknown" ;
    }
    public MultipleContructors(int id){
        this.id=id;
        this.name="Unknown";
    }
    public MultipleContructors(int id,String name){
        this.id=id;
        this.name=name;
    }

    public int getid() {
        return id;
    }

    public void setId(int id) {
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        MultipleContructors obj =new MultipleContructors(1);
        MultipleContructors obj1 = new MultipleContructors(1,"Arun");
        System.out.println(obj.id);
        System.out.println(obj.name);
        System.out.println(obj1.id);
        System.out.println(obj1.name);
    }
}

