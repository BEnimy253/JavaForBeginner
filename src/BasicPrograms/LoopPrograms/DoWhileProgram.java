package BasicPrograms.LoopPrograms;

public class DoWhileProgram {
    public static void main(String[] args) {
        int count = 1;

        // Vòng lặp do...while luôn chạy ít nhất một lần
        do {
            System.out.println("Giá trị của count: " + count);
            count++;
        } while (count <= 5);
    }
}
