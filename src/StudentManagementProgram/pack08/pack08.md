# pack08 - Interface

Package `pack08` giới thiệu interface thông qua `Printable`.

- Interface là gì

  Interface mô tả một hợp đồng hành vi. Class nào `implements` interface thì phải cung cấp phần cài đặt cho các method mà interface yêu cầu, trừ khi class đó là abstract class. Trong interface, method không có thân như `void printInfo();` được hiểu là `public abstract`.

  Trong `pack08`:

  ```java
  public interface Printable {
      void printInfo();
  }
  ```

  `Printable` yêu cầu class triển khai method `printInfo()`.

- Implements interface

  Class `Student` vừa kế thừa `Person`, vừa triển khai `Printable`:

  ```java
  public class Student extends Person implements Printable {
      @Override
      public void printInfo() {
          System.out.println("Student: " + maHS + " - " + hoTen + " - " + lopHoc);
      }
  }
  ```

  Java chỉ cho phép một class kế thừa trực tiếp một class cha, nhưng một class có thể implements nhiều interface.

- Dùng interface làm kiểu chung

  Trong `Main.java`:

  ```java
  Printable[] printableItems = {
      new Student("260001", "Nguyễn Văn A", "01/01/2010", "26UD01"),
      new Teacher("Trần Thị B", "12/05/1990", "Chính trị")
  };
  ```

  Mảng có kiểu `Printable[]`, nên chỉ cần biết rằng mỗi phần tử có khả năng `printInfo()`. Code không cần phụ thuộc trực tiếp vào `Student` hay `Teacher`.

- Khác biệt cơ bản với abstract class

  Abstract class thường dùng khi các class con có phần trạng thái hoặc cài đặt chung cần chia sẻ.

  Interface thường dùng khi cần mô tả một năng lực chung, ví dụ `Printable`, `Payable`, `Comparable`. Interface hiện đại của Java cũng có thể có `default` method và `static` method, nhưng `pack08` chỉ dùng dạng cơ bản nhất để làm rõ vai trò hợp đồng hành vi.

  Trong `pack08`, `Person` giữ dữ liệu chung, còn `Printable` mô tả khả năng in thông tin.
