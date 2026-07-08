# ExceptionProcessing

## Exception là gì?

Exception là tình huống bất thường xảy ra khi chương trình đang chạy, ví dụ chia cho 0, nhập sai định dạng số, truy cập phần tử mảng không tồn tại hoặc không tìm thấy tệp.

Nếu không xử lý, exception có thể làm chương trình dừng đột ngột.

## try-catch

Đặt đoạn code có khả năng lỗi trong `try`, sau đó xử lý lỗi trong `catch`.

```java
try {
    int result = a / b;
} catch (ArithmeticException exception) {
    System.out.println("Khong the chia cho 0");
}
```

Mỗi `catch` nên xử lý một loại lỗi cụ thể để thông báo rõ ràng.

## Multiple catch

Một `try` có thể có nhiều `catch`. Nên đặt exception cụ thể trước exception tổng quát.

```java
catch (NumberFormatException exception) {
}
catch (Exception exception) {
}
```

## finally

`finally` là khối lệnh chạy sau `try/catch`, dù có lỗi hay không. Nó thường dùng để đóng tài nguyên. Từ đúng trong Java là `finally`, không phải `final`.

```java
finally {
    scanner.close();
}
```

## Giải thích chương trình mẫu

- `sample01.java`: bắt `ArithmeticException` khi người dùng nhập mẫu số bằng 0.
- `sample02.java`: có hai `catch`, một cho lỗi nhập không phải số nguyên và một cho lỗi truy cập sai vị trí mảng.
- `sample03.java`: dùng `try-catch-finally`; dù nhập đúng hay sai, khối `finally` vẫn in thông báo và đóng `Scanner`.
