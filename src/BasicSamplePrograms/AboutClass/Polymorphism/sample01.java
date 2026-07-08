package BasicSamplePrograms.AboutClass.Polymorphism;

public class sample01 {
    static class Animal {
        void makeSound() {
            System.out.println("Dong vat phat ra am thanh.");
        }
    }

    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Gau gau");
        }
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meo meo");
        }
    }

    public static void main(String[] args) {
        Animal firstAnimal = new Dog();
        Animal secondAnimal = new Cat();

        firstAnimal.makeSound();
        secondAnimal.makeSound();
    }
}
