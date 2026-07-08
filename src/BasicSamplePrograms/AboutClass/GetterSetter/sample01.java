package BasicSamplePrograms.AboutClass.GetterSetter;

public class sample01 {
    static class Student {
        private String fullName;

        public String getFullName() {
            return fullName;
        }

        public void setFullName(String fullName) {
            this.fullName = fullName;
        }
    }

    public static void main(String[] args) {
        Student student = new Student();
        student.setFullName("Dang Ha");

        System.out.println("Ho ten: " + student.getFullName());
    }
}
