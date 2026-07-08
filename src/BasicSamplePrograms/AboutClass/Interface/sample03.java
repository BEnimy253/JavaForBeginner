package BasicSamplePrograms.AboutClass.Interface;

public class sample03 {
    interface Payable {
        double getPayment();

        default void printPayment() {
            System.out.println("So tien can thanh toan: " + getPayment());
        }
    }

    static class Invoice implements Payable {
        double amount;

        Invoice(double amount) {
            this.amount = amount;
        }

        @Override
        public double getPayment() {
            return amount;
        }
    }

    public static void main(String[] args) {
        Payable payable = new Invoice(250000);
        payable.printPayment();
    }
}
