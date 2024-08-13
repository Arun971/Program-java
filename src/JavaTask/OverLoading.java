package JavaTask;
interface Student{
    void study();
}
class Department implements Student{
    public void study(){
        System.out.println("Study well");
    }
}
public class OverLoading {
    public static void main(String[] args) {
       Student student= new Department();
       student.study();

    }
}
