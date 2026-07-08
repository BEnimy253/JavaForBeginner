package BasicSamplePrograms.AboutClass.Abstract;

public class sample01 {
    static abstract class Animal {
        abstract void makeSound();
    }

    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meo meo");
        }
    }

    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.makeSound();
    }
}
