import java.util.Scanner;

class Singleton{
   public static Singleton instance = null;
//   String s;
//
//    public Singleton(String s) {
//        this.s = s;
//    }

    public static Singleton get_Instannce(){
       if (instance == null){
           instance = new Singleton();
       }
       return instance;
   }
   public void showMessage(){
       System.out.println("Hello This Singleton");
   }
}
public class Ton {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter This Value");
        String st = scanner.next();
        Singleton x= Singleton.get_Instannce();
        Singleton y = Singleton.get_Instannce();
        System.out.println("HashMap "+x.hashCode());
        System.out.println("HashMap "+y.hashCode());
//        System.out.println(x.s);
        y.showMessage();
    }

}
