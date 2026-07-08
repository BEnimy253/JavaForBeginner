package BasicSamplePrograms.AboutClass.Methods;

public class sample01 {
    static int add(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    public static void main(String[] args) {
        int result = add(12, 8);
        System.out.println("Tong = " + result);
    }
}
