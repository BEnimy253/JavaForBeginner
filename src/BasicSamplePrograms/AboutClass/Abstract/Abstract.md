# Abstract

## abstract class

Abstract class là class chưa hoàn chỉnh để tạo object trực tiếp. Nó thường đóng vai trò class cha, định nghĩa phần chung cho các class con.

```java
abstract class Animal {
    abstract void makeSound();
}
```

Không thể viết:

```java
Animal animal = new Animal();
```

## abstract method

Abstract method chỉ có khai báo, không có thân method. Class con cụ thể phải override method đó.

```java
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("Meo meo");
    }
}
```

## Abstract class vẫn có code bình thường

Abstract class có thể có fields, constructors và methods đã cài đặt sẵn. Vì vậy nó phù hợp khi muốn chia sẻ dữ liệu hoặc hành vi chung giữa nhiều class con.

## Giải thích chương trình mẫu

- `sample01.java`: `Animal` là abstract class, `Cat` cài đặt method `makeSound()`.
- `sample02.java`: `Employee` vừa có method thường `printName()` vừa có abstract method `getSalary()`.
- `sample03.java`: `Shape` định nghĩa abstract method `getArea()`, các class `Square` và `Circle` tự tính diện tích theo cách riêng.
