package BasicSamplePrograms.AboutClass.Polymorphism;

public class sample02 {
    static class Employee {
        double getSalary() {
            return 0;
        }
    }

    static class FullTimeEmployee extends Employee {
        @Override
        double getSalary() {
            return 9000000;
        }
    }

    static class PartTimeEmployee extends Employee {
        @Override
        double getSalary() {
            return 3500000;
        }
    }

    static void printSalary(Employee employee) {
        System.out.println("Luong: " + employee.getSalary());
    }

    public static void main(String[] args) {
        printSalary(new FullTimeEmployee());
        printSalary(new PartTimeEmployee());
    }
}
