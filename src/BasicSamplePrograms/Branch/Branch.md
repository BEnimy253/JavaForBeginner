# Branch

## Câu lệnh if

`if` cho phép chương trình chỉ thực hiện một khối lệnh khi điều kiện đúng.

```java
if (condition) {
    // code runs when condition is true
}
```

Điều kiện trong `if` phải tạo ra giá trị `boolean`, ví dụ `score >= 5`, `number % 2 == 0`, `isPassed`.

## if...else

`if...else` dùng khi cần hai hướng xử lý: một hướng khi điều kiện đúng, một hướng khi điều kiện sai.

```java
if (score >= 5) {
    System.out.println("Dat");
} else {
    System.out.println("Chua dat");
}
```

## if lồng nhau

`if` lồng nhau là đặt một `if` bên trong một `if` khác. Cách này phù hợp khi điều kiện thứ hai chỉ nên kiểm tra sau khi điều kiện thứ nhất đã đúng.

```java
if (averageScore >= 8) {
    if (behaviorScore >= 80) {
        System.out.println("Hoc bong");
    }
}
```

Nên dùng dấu `{}` ngay cả khi khối chỉ có một lệnh để code rõ ràng và tránh lỗi khi thêm dòng mới.

## Giải thích chương trình mẫu

- `sample01.java`: dùng hai câu `if` độc lập để kiểm tra số dương và số chẵn. Hai điều kiện không phụ thuộc nhau nên có thể kiểm tra riêng.
- `sample02.java`: dùng `if...else` để phân loại kết quả đạt hoặc chưa đạt dựa trên điểm trung bình.
- `sample03.java`: dùng `if` lồng nhau để xét học bổng: trước hết kiểm tra học lực, sau đó mới kiểm tra điểm rèn luyện.
