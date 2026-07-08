# Kiến thức liên quan

## 1. Cách Java khởi chạy chương trình - hàm `main()`

Trong Java, chương trình bắt đầu chạy từ phương thức `main`. Khi thực thi một lớp Java, JVM (Java Virtual Machine) sẽ tìm đúng điểm vào có dạng:

```java
public static void main(String[] args) {
    // code được chạy từ đây
}
```

Các câu lệnh bên trong cặp ngoặc `{ }` của `main` sẽ được thực thi theo thứ tự từ trên xuống dưới.

## 2. Cách ghi ghi chú (comments) - có 3 cách:

Comment là phần ghi chú dành cho người đọc code. Trình biên dịch Java bỏ qua comment, nên comment không làm thay đổi kết quả chạy chương trình.

### 2.1. `// comment type 1` 

Đây là comment một dòng. Nó thường được dùng để giải thích ngắn gọn một dòng lệnh hoặc một ý tưởng ngay trong code.

```java
// Chương trình Java đầu tiên
System.out.println("Hello World");
```

### 2.2. `/* ... */`

Đây là comment nhiều dòng. Tất cả nội dung nằm giữa `/*` và `*/` đều được xem là ghi chú.

```java
/*
  Chương trình này in ra màn hình câu Hello World.
  Đây là ví dụ đầu tiên khi học Java.
*/
```

2.3. `/** ... */`

Đây là comment tài liệu (documentation comment). Kiểu comment này thường được dùng để mô tả lớp, phương thức, biến hoặc API. Công cụ `javadoc` có thể đọc các comment dạng này để tạo tài liệu tự động.

```java
/**
* Lớp minh họa chương trình Java đầu tiên.
*/
public class FirstProgram {
}
```

**Khi viết comment, nên ghi rõ lý do hoặc mục đích của đoạn code thay vì chỉ 
lặp lại đúng lệnh code đang làm gì.**

## 3. Luồng xuất (`System.out`) và các phương thức xuất cơ bản `println()`, `print()`

`System.out` là luồng xuất chuẩn của Java, thường được dùng để in dữ liệu 
ra màn hình console.

Trong `FirstProgram.java`, câu lệnh:

```java
System.out.println("Hello World");
```

sẽ in chuỗi `"Hello World"` ra console.

Hai phương thức xuất cơ bản:

- `println()`: in nội dung ra console và xuống dòng sau khi in.

  ```java
  System.out.println("Hello");
  System.out.println("World");
  ```

  Kết quả:

  ```text
  Hello
  World
  ```

- `print()`: in nội dung ra console nhưng không tự động xuống dòng.

  ```java
  System.out.print("Hello ");
  System.out.print("World");
  ```

  Kết quả:
  
  ```text
  Hello World
  ```

Có thể in nhiều kiểu dữ liệu khác nhau bằng `System.out.print()` hoặc `System.out.println()`, ví dụ chuỗi, số nguyên, số thực, ký tự và giá trị logic.

## 4. Luồng nhập (`System.in`) và lớp `Scanner`

`System.in` là luồng nhập chuẩn của Java, thường nhận dữ liệu từ bàn phím trong console. Tuy nhiên, `System.in` làm việc ở mức luồng byte nên không tiện để đọc trực tiếp các kiểu dữ liệu quen thuộc như chuỗi, số nguyên hoặc số thực.

Để nhập dữ liệu dễ hơn, Java cung cấp lớp `Scanner` trong gói `java.util`. Muốn sử dụng `Scanner`, cần khai báo `import` ở đầu tệp:

```java
import java.util.Scanner;
```

Cách tạo một đối tượng `Scanner` để đọc dữ liệu từ bàn phím:

```java
Scanner scanner = new Scanner(System.in);
```

Trong `FirstProgram.java`, chương trình nhập tên người dùng bằng `Scanner`:

```java
Scanner scanner = new Scanner(System.in);

System.out.print("Nhập tên của bạn: ");
String name = scanner.nextLine();

System.out.println("Xin chào, " + name + "!");

scanner.close();
```

Ý nghĩa của từng dòng:

- `Scanner scanner = new Scanner(System.in);`: tạo một đối tượng `Scanner` để đọc dữ liệu nhập từ bàn phím.
- `System.out.print("Nhập tên của bạn: ");`: in lời nhắc nhập dữ liệu nhưng không xuống dòng, giúp người dùng nhập ngay sau dấu nhắc.
- `String name = scanner.nextLine();`: đọc toàn bộ một dòng văn bản người dùng nhập và lưu vào biến `name`.
- `System.out.println("Xin chào, " + name + "!");`: in lời chào có ghép giá trị vừa nhập.
- `scanner.close();`: đóng `Scanner` khi chương trình đã nhập xong dữ liệu.

Một số phương thức nhập cơ bản của `Scanner`:

- `nextLine()`: đọc cả một dòng văn bản, bao gồm cả khoảng trắng.
- `next()`: đọc một từ, dừng lại khi gặp khoảng trắng.
- `nextInt()`: đọc một số nguyên kiểu `int`.
- `nextDouble()`: đọc một số thực kiểu `double`.
- `nextBoolean()`: đọc giá trị logic `true` hoặc `false`.

Khi vừa dùng các phương thức như `nextInt()` hoặc `nextDouble()` rồi chuyển sang `nextLine()`, cần chú ý ký tự xuống dòng còn lại trong bộ đệm nhập. Trong trường hợp đó, thường cần gọi thêm một lần `scanner.nextLine()` để bỏ qua phần xuống dòng còn dư trước khi đọc chuỗi tiếp theo.

Lưu ý: `Scanner` đọc từ `System.in` là cách nhập liệu đơn giản, phù hợp cho chương trình console cơ bản. Trong chương trình lớn hơn, cần cân nhắc việc đóng `Scanner` vì đóng `Scanner` cũng đóng luôn luồng nhập mà nó đang sử dụng.
