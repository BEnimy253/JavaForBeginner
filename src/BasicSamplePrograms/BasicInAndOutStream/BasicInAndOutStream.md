# BasicInAndOutStream

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, các phần giới thiệu `System.out`, `System.in`, `Scanner` và comments.

## Luồng nhập chuẩn

`System.in` là luồng nhập chuẩn của Java. Trong chương trình console, nguồn nhập mặc định thường là bàn phím. Vì `System.in` làm việc ở mức luồng byte nên người mới thường dùng lớp `Scanner` để đọc dữ liệu dễ hơn.

Cú pháp thường gặp:

```java
Scanner scanner = new Scanner(System.in);
String name = scanner.nextLine();
int age = scanner.nextInt();
double score = scanner.nextDouble();
```

`nextLine()` đọc cả dòng văn bản. `nextInt()` và `nextDouble()` đọc số nguyên hoặc số thực.

## Luồng xuất chuẩn

`System.out` là luồng xuất chuẩn, thường hiển thị dữ liệu ra màn hình console.

Hai lệnh cơ bản:

```java
System.out.print("Nhap ten: ");
System.out.println("Xin chao!");
```

`print()` in ra nhưng không tự xuống dòng. `println()` in ra và xuống dòng sau khi in.

## Comments trong Java

Comment là ghi chú trong mã nguồn. Trình biên dịch bỏ qua comment, nhưng người đọc code dùng comment để hiểu ý định của chương trình.

Java có 3 loại comment:

- Comment một dòng: `// ghi chu`
- Comment nhiều dòng: `/* ghi chu nhieu dong */`
- Documentation comment: `/** mo ta cho javadoc */`

Không nên lạm dụng comment để giải thích điều quá rõ ràng. Comment tốt nên nói lý do hoặc ý nghĩa của đoạn code.

## Giải thích chương trình mẫu

- `sample01.java`: dùng `Scanner(System.in)` để nhập tên và tuổi, dùng `print()` để giữ con trỏ nhập trên cùng dòng, dùng `println()` để in lời chào và tuổi năm sau.
- `sample02.java`: nhập hai số thực bằng `nextDouble()`, tính tổng và trung bình, sau đó xuất kết quả bằng `System.out.println()`.
- `sample03.java`: nhập nhiều kiểu dữ liệu hơn gồm chuỗi và số thực, sau đó trình bày lại thông tin bằng cả `println()` và `print()`.
