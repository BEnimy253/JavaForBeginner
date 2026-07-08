# Constructors

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, chương introducing classes, phần constructors, parameterized constructors và `this`.

## Constructor là gì?

Constructor là khối lệnh đặc biệt chạy khi tạo object bằng `new`. Constructor có tên giống class và không có kiểu trả về.

```java
class Student {
    Student() {
        System.out.println("Object duoc tao");
    }
}
```

Constructor thường dùng để gán giá trị ban đầu cho fields.

## Constructor không tham số

Constructor không tham số giúp tạo object với giá trị mặc định do lập trình viên đặt ra.

```java
Student() {
    fullName = "Chua co ten";
}
```

## Constructor có tham số

Constructor có tham số cho phép truyền dữ liệu khi tạo object.

```java
Student(String fullName, double score) {
    this.fullName = fullName;
    this.score = score;
}
```

`this.fullName` là field của object hiện tại. `fullName` không có `this` là tham số của constructor.

## Nạp chồng constructor

Một class có thể có nhiều constructor khác danh sách tham số. Constructor này có thể gọi constructor khác bằng `this(...)`, và lệnh này phải đứng đầu constructor.

## Giải thích chương trình mẫu

- `sample01.java`: dùng constructor không tham số để gán tên mặc định cho sinh viên.
- `sample02.java`: dùng constructor có tham số để tạo sinh viên với tên và điểm ngay từ đầu.
- `sample03.java`: dùng nhiều constructor và `this(...)` để khởi tạo object theo nhiều cách khác nhau.
