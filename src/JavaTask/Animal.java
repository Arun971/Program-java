package JavaTask;

import java.security.spec.RSAOtherPrimeInfo;

class A{
    public String animal(String s){
        return "I am Inside A class";
    }
}
class B{String a;

    public B(String a) {
        this.a = a;
    }

    public String animal(String s){
        System.out.println(a);
        return "Add Sucessfully";
    }
}
public class Animal {
    public static void main(String[] args) {
        B obj=new B("dog");
        System.out.println(obj.animal("dog"));

        A obj1=new A();
        System.out.println(obj1.animal("Cat"));

    }
}

