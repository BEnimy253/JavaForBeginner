package BasicSamplePrograms.AboutClass.Abstract;

public class sample02 {
    static abstract class Employee {
        String fullName;

        Employee(String fullName) {
            this.fullName = fullName;
        }

        void printName() {
            System.out.println("Nhan vien: " + fullName);
        }

        abstract double getSalary();
    }

    static class PartTimeEmployee extends Employee {
        int hours;
        double salaryPerHour;

        PartTimeEmployee(String fullName, int hours, double salaryPerHour) {
            super(fullName);
            this.hours = hours;
            this.salaryPerHour = salaryPerHour;
        }

        @Override
        double getSalary() {
            return hours * salaryPerHour;
        }
    }

    public static void main(String[] args) {
        PartTimeEmployee employee = new PartTimeEmployee("Mai Anh", 20, 50000);
        employee.printName();
        System.out.println("Luong: " + employee.getSalary());
    }
}
