package StudentManagementProgram.pack08;

public class Main {
    public static void main(String[] args) {
        Printable[] printableItems = {
                new Student("260001", "Nguyễn Văn A", "01/01/2010", "26UD01"),
                new Teacher("Trần Thị B", "12/05/1990", "Chính trị")
        };

        for (Printable item : printableItems) {
            item.printInfo();
        }
    }
}
