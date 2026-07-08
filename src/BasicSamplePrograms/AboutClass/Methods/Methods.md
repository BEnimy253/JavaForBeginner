# Methods

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, chương introducing classes và a closer look at methods and classes.

## Method là gì?

Method là khối lệnh có tên, dùng để thực hiện một công việc. Method giúp chia chương trình thành các phần nhỏ, dễ đọc và dễ tái sử dụng.

Cú pháp tổng quát:

```java
returnType methodName(parameterList) {
    // body
}
```

## static và non-static

`static` method thuộc về class. Có thể gọi trực tiếp qua class hoặc gọi trong cùng class mà không cần tạo object.

Non-static method thuộc về object. Muốn gọi non-static method, cần tạo object trước.

```java
Rectangle rectangle = new Rectangle();
rectangle.getArea();
```

## void và return

`void` nghĩa là method không trả về giá trị.

```java
void printTitle() {
    System.out.println("Bang diem");
}
```

Nếu method có kiểu trả về khác `void`, method phải dùng `return` để trả kết quả đúng kiểu.

```java
double getArea() {
    return width * height;
}
```

## Giải thích chương trình mẫu

- `sample01.java`: khai báo static method `add()` để cộng hai số và trả về `int`.
- `sample02.java`: khai báo class `Rectangle` với non-static method `getArea()`, cần tạo object trước khi gọi.
- `sample03.java`: so sánh method `void printTitle()` chỉ in dữ liệu và method `calculateAverage()` có `return` để trả về điểm trung bình.
