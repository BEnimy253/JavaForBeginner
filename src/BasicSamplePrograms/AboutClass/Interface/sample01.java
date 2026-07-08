package BasicSamplePrograms.AboutClass.Interface;

public class sample01 {
    interface Printable {
        void print();
    }

    static class Student implements Printable {
        String fullName = "Nguyen Hoa";

        @Override
        public void print() {
            System.out.println("Sinh vien: " + fullName);
        }
    }

    public static void main(String[] args) {
        Printable printable = new Student();
        printable.print();
    }
}
