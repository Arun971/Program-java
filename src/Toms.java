// Main class

class Singletons1 {
    // Private constructor to prevent instantiation
    private Singletons1() {
        System.out.println("Singleton instance created");
    }

    // Private static instance of the class
    private static Singletons1 instance;

    // Public static method to get the instance
    public static Singletons1 getInstance() {
        if (instance == null) {
            // Create a new instance if it doesn't exist
            instance = new Singletons1();
        }
        return instance;
    }

    // Method to test the Singleton instance
    public void showMessage() {
        System.out.println("Hello, I'm the Singleton instance!");
    }
}
public class Toms{
public static void main(String[] args) {
        // Get the Singleton instance
        Singletons1 singleton1 = Singletons1.getInstance();
        Singletons1 singleton2 = Singletons1.getInstance();

        // Check if both instances are the same
        System.out.println(singleton1 == singleton2); // true

        // Use the Singleton instance
        singleton1.showMessage();
    }
}