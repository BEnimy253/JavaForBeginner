# GetterSetter

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, các phần access control, methods và class design cơ bản.

## Getter và setter là gì?

Getter là method dùng để đọc giá trị field. Setter là method dùng để thay đổi giá trị field.

```java
public String getFullName() {
    return fullName;
}

public void setFullName(String fullName) {
    this.fullName = fullName;
}
```

Getter/setter thường đi cùng với field `private` để che giấu dữ liệu bên trong object.

## Vì sao không truy cập field trực tiếp?

Nếu field để `public`, nơi khác có thể gán mọi giá trị, kể cả giá trị sai. Setter cho phép kiểm tra dữ liệu trước khi nhận.

```java
public void setScore(double score) {
    if (score >= 0 && score <= 10) {
        this.score = score;
    }
}
```

Đây là một bước đầu của đóng gói dữ liệu trong lập trình hướng đối tượng.

## Quy ước đặt tên

- Getter thường bắt đầu bằng `get`, ví dụ `getScore()`.
- Setter thường bắt đầu bằng `set`, ví dụ `setScore(...)`.
- Với `boolean`, getter có thể bắt đầu bằng `is`, ví dụ `isActive()`.

## Giải thích chương trình mẫu

- `sample01.java`: dùng getter và setter đơn giản cho field `fullName`.
- `sample02.java`: setter `setScore()` kiểm tra điểm nằm trong khoảng 0 đến 10, nên giá trị 12.0 bị bỏ qua.
- `sample03.java`: class `Product` có hai field private là `name` và `price`, setter của `price` chỉ nhận giá trị không âm.
