package JavaTask;
interface Bill {
    void settleBill();  // Abstract method
}

class ElectricityBill implements Bill {
    @Override
    public void settleBill() {
        System.out.println("Electricity Bill settled!");
    }
}

public class Task4 {
    public static void main(String[] args) {
        Bill bill = new ElectricityBill();
        bill.settleBill();
    }
}