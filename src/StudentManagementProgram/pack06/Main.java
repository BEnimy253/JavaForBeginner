package StudentManagementProgram.pack06;

public class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Student("260001", "Nguyễn Văn A", "01/01/2010", "26UD01"),
                new Teacher("Trần Thị B", "12/05/1990", "Pháp luật")
        };

        for (Person person : people) {
            person.inThongTin();
        }
    }
}
