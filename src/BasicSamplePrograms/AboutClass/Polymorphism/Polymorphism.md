# Polymorphism

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, chương inheritance, phần method overriding và dynamic method dispatch.

## Đa hình là gì?

Đa hình cho phép một biến kiểu cha hoặc kiểu interface tham chiếu đến nhiều object con khác nhau. Khi gọi method đã override, Java chọn phiên bản method theo object thật đang được giữ.

```java
Animal animal = new Dog();
animal.makeSound();
```

Biến có kiểu `Animal`, nhưng object thật là `Dog`, nên method của `Dog` được chạy.

## Lợi ích

Đa hình giúp viết code tổng quát hơn. Thay vì viết nhiều method cho từng class con, có thể viết một method nhận kiểu cha.

```java
void printSalary(Employee employee) {
    System.out.println(employee.getSalary());
}
```

Method này dùng được với mọi class con của `Employee`.

## Interface và đa hình

Interface cũng tạo đa hình. Một mảng kiểu interface có thể chứa nhiều object thuộc nhiều class khác nhau, miễn là các class đó implements interface.

## Giải thích chương trình mẫu

- `sample01.java`: biến `Animal` lần lượt giữ `Dog` và `Cat`, khi gọi `makeSound()` thì Java chạy method đã override tương ứng.
- `sample02.java`: method `printSalary(Employee employee)` nhận kiểu cha và xử lý được cả `FullTimeEmployee` lẫn `PartTimeEmployee`.
- `sample03.java`: mảng `Notification[]` chứa object gửi email và SMS, mỗi object tự cài đặt cách gửi thông báo.
