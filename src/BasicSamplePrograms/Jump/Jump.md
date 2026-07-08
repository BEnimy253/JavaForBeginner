# Jump

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, chương control statements phần traditional `switch` và chương về switch expressions.

## switch truyền thống

`switch` là cấu trúc rẽ nhánh nhiều lựa chọn. Nó thường dùng khi một biểu thức cần so khớp với nhiều giá trị cụ thể.

```java
switch (value) {
    case 1:
        System.out.println("One");
        break;
    default:
        System.out.println("Other");
}
```

Trong `switch` truyền thống, `break` giúp thoát khỏi `switch`. Nếu thiếu `break`, chương trình có thể chạy tiếp xuống `case` phía dưới.

`default` là nhánh dự phòng khi không có `case` nào khớp.

## Nhóm nhiều case

Nhiều `case` có thể dùng chung một khối xử lý:

```java
case 'A':
case 'B':
    System.out.println("Tot");
    break;
```

## switch expression

Switch expression trả về một giá trị nên có thể gán trực tiếp cho biến.

```java
String result = switch (score) {
    case 10, 9 -> "Excellent";
    default -> "Keep learning";
};
```

Cú pháp `->` ngắn gọn hơn và tránh lỗi rơi tiếp xuống case sau. Switch expression là cú pháp Java hiện đại, phù hợp khi cần biến kết quả từ nhiều lựa chọn.

## Giải thích chương trình mẫu

- `sample01.java`: dùng `switch` truyền thống để đổi số từ 1 đến 7 thành tên thứ trong tuần, mỗi `case` có `break`.
- `sample02.java`: minh họa nhóm nhiều `case`, trong đó `A` và `B` dùng chung thông báo.
- `sample03.java`: dùng switch expression để chuyển tháng thành mùa và gán kết quả vào biến `season`.
