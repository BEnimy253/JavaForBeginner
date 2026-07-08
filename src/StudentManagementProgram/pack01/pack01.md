# Pack01 - Tạo class và đối tượng đầu tiên

## 1. Cách khởi tạo một class trong Java

  Trong Java, `class` dùng để định nghĩa một kiểu dữ liệu mới. Khai báo
  class tạo ra một khuôn mẫu, chứ chưa tạo ra đối tượng thật trong bộ nhớ.

  File `Student.java` định nghĩa class `Student`:

  ```java
  public class Student {
      public String maHS = "260001";
      public String hoTen = "Nguyễn Văn A";
      public String ngaySinh = "01/01/2010";
      public String lopHoc = "26UD01";
      public String nganhHoc = "Công nghệ thông tin (Ứng dụng công nghệ)";
  }
  ```

  Trong đoạn code trên:

  - `public class Student` tạo ra một class tên là `Student`.
  - Tên file là `Student.java`, trùng với tên `public class Student`.
  - Class này mô tả cấu trúc dữ liệu của một học sinh.

## 2. Trường dữ liệu (data fields) là gì và cách truy cập

  Trường dữ liệu là các biến được khai báo bên trong class nhưng nằm ngoài các method. Trong tài liệu tham chiếu, các biến này được gọi là instance variables; chúng là một phần của members của class. Mỗi object tạo ra từ class có bản sao riêng của các instance variables này.

  Trong `Student.java`, class `Student` có 5 trường dữ liệu:

  ```java
  public String maHS = "260001";
  public String hoTen = "Nguyễn Văn A";
  public String ngaySinh = "01/01/2010";
  public String lopHoc = "26UD01";
  public String nganhHoc = "Công nghệ thông tin (Ứng dụng công nghệ)";
  ```

  Mỗi trường đều có kiểu `String` và được gán giá trị mặc định ngay khi khai báo.

  Vì các trường đang được khai báo là `public`, có thể truy cập trực tiếp bằng cú pháp:

  ```java
  tên_đối_tượng.tên_trường
  ```

  Ví dụ trong `Main.java`:

  ```java
  System.out.println("Mã học sinh: " + student.maHS);
  System.out.println("Họ tên: " + student.hoTen);
  ```

  Ở đây, `student.maHS` nghĩa là lấy giá trị trường `maHS` của đối tượng `student`.

  Cách để field là `public` phù hợp cho ví dụ đầu tiên vì giúp nhìn rõ việc truy cập dữ liệu qua object. Tuy nhiên, theo nguyên tắc access control và encapsulation trong Java, dữ liệu của object thường nên được che bằng `private` và truy cập thông qua method phù hợp. Các package sau sẽ chuyển dần sang cách viết đó.

## 3. Khởi tạo một đối tượng sau khi có class

  Sau khi đã có class `Student`, ta có thể tạo một đối tượng cụ thể từ class đó. Việc tạo đối tượng trong `Main.java` được thực hiện bằng câu lệnh:

  ```java
  Student student = new Student();
  ```

  Câu lệnh này có hai phần quan trọng:

  - `Student student`: khai báo một biến tham chiếu tên `student`, có kiểu là `Student`.
  - `new Student()`: tạo một đối tượng `Student` thật trong bộ nhớ.

  Quá trình có được một đối tượng của class gồm hai bước: khai báo biến tham
  chiếu kiểu class, sau đó dùng toán tử `new` để tạo đối tượng thật và gán đối tượng đó cho biến tham chiếu.

  Có thể tách câu lệnh trên thành hai dòng để thấy rõ hơn:

  ```java
  Student student;
  student = new Student();
  ```

  Dòng đầu chỉ tạo biến tham chiếu `student`; nó chưa tạo ra học sinh thật. Dòng thứ hai dùng `new Student()` để tạo đối tượng học sinh thật.

## 4. Phân biệt tạo class và tạo đối tượng

  Tạo class là tạo cấu trúc, khuôn mẫu hoặc bản thiết kế cho một loại đối tượng.

  ```java
  public class Student {
      public String maHS = "260001";
      public String hoTen = "Nguyễn Văn A";
  }
  ```

  Đoạn code trên chỉ nói rằng một học sinh sẽ có những dữ liệu nào. Nó chưa tạo ra học sinh cụ thể nào để chương trình sử dụng.

  Tạo đối tượng là tạo một thực thể cụ thể từ class:

  ```java
  Student student = new Student();
  ```

  Sau câu lệnh này, chương trình có một đối tượng `Student` cụ thể tên là `student`, và có thể truy cập các trường dữ liệu của đối tượng đó:

  ```java
  System.out.println(student.hoTen);
  ```

  Nói ngắn gọn:

  - Class `Student` là bản thiết kế.
  - Đối tượng `student` là một học sinh cụ thể được tạo ra từ bản thiết kế đó.
  - Từ khóa `new` là phần tạo thực thể thật của đối tượng trong lúc chương trình chạy.
