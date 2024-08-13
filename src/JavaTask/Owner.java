package JavaTask;

abstract class department {
    public void Person() {
        System.out.println("Inside the Apartment");
    }
}

    public class Owner extends Department {

        public void Person() {
            System.out.println("Inside the Department");
        }

        public static void main(String[] args) {
            Owner obj = new Owner();
            obj.Person();

        }
    }


