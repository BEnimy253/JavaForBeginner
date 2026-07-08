# Loop

## Vòng lặp là gì?

Vòng lặp giúp chương trình thực hiện lặp lại một công việc cho đến khi điều kiện dừng được thỏa mãn. Khi viết vòng lặp, cần xác định rõ:

- Giá trị bắt đầu
- Điều kiện tiếp tục
- Bước thay đổi sau mỗi lần lặp
- Công việc cần thực hiện trong thân vòng lặp

## for

`for` thường dùng khi biết trước số lần lặp.

```java
for (int i = 1; i <= 5; i++) {
    System.out.println(i);
}
```

Ba phần chính là khởi tạo, điều kiện và cập nhật.

## while

`while` kiểm tra điều kiện trước rồi mới chạy thân vòng lặp. Nếu điều kiện sai ngay từ đầu, thân vòng lặp không chạy lần nào.

```java
while (condition) {
    // repeated work
}
```

`while` phù hợp khi chưa biết trước số lần lặp, ví dụ nhập đến khi gặp giá trị dừng.

## do-while

`do-while` chạy thân vòng lặp trước, sau đó mới kiểm tra điều kiện. Vì vậy thân vòng lặp luôn chạy ít nhất một lần.

```java
do {
    // repeated work
} while (condition);
```

`do-while` phù hợp với menu hoặc nhập dữ liệu cần kiểm tra lại.

## Giải thích chương trình mẫu

- `ForLoop/sample01.java`: in 5 lần bằng `for`, minh họa biến đếm `i`.
- `ForLoop/sample02.java`: nhập `n` rồi dùng `for` tính tổng từ 1 đến `n`.
- `ForLoop/sample03.java`: dùng `for` để in bảng cửu chương từ 1 đến 10.
- `WhileLoop/sample01.java`: dùng `while` để đếm ngược đến khi biến `count` bằng 0.
- `WhileLoop/sample02.java`: nhập nhiều số và dừng khi người dùng nhập 0, một tình huống không biết trước số lần lặp.
- `WhileLoop/sample03.java`: lặp nhập mật khẩu cho đến khi chuỗi đúng bằng `java123`.
- `DoWhileLoop/sample01.java`: minh họa thân vòng lặp chạy trước rồi mới kiểm tra điều kiện.
- `DoWhileLoop/sample02.java`: yêu cầu nhập điểm cho đến khi điểm nằm trong khoảng 0 đến 10.
- `DoWhileLoop/sample03.java`: tạo menu đơn giản, menu luôn hiển thị ít nhất một lần trước khi người dùng chọn thoát.
