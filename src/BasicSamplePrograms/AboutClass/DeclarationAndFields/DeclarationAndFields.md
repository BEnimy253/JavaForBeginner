# DeclarationAndFields

## Khai báo class

Class là bản thiết kế để tạo object. Một class thường chứa fields và methods.

```java
class Student {
    String fullName;
    double score;
}
```

Trong ví dụ trên, `fullName` và `score` là fields. Field mô tả dữ liệu mà object lưu giữ.

## Tạo object và truy cập fields

Dùng `new` để tạo object:

```java
Student student = new Student();
student.fullName = "Nguyen An";
```

Dấu chấm `.` dùng để truy cập field hoặc method của object.

## Giá trị mặc định

Field có giá trị mặc định nếu chưa được gán:

- Số nguyên: `0`
- Số thực: `0.0`
- `boolean`: `false`
- Kiểu tham chiếu như `String`: `null`

Biến cục bộ trong method không có giá trị mặc định theo cách này; phải gán trước khi dùng.

## static field

Field có từ khóa `static` thuộc về class, không thuộc riêng từng object. Nhiều object có thể dùng chung một giá trị static.

## Giải thích chương trình mẫu

- `sample01.java`: khai báo class `Student`, tạo object và gán trực tiếp các fields `id`, `fullName`, `score`.
- `sample02.java`: tạo object `Book` nhưng chưa gán field để quan sát giá trị mặc định của `String`, `int` và `boolean`.
- `sample03.java`: dùng `static String schoolName` để minh họa dữ liệu dùng chung cho nhiều object `Course`.
