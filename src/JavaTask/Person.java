package JavaTask;

public class Person {
    private int attr1;
    private int attr2;

    public Person(int attr1, int attr2) {
        this.attr1 = attr1;
        this.attr2 = attr2;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person other = (Person) obj;
        return this.attr1 == other.attr1 && this.attr2 == other.attr2;
    }

    public static void main(String[] args) {
        
    }
}
