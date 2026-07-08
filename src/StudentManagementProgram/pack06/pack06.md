# pack06 - Tính đa hình

Package `pack06` giới thiệu tính đa hình thông qua quan hệ `Person`, `Student` và `Teacher`.

- Đa hình là gì

  Đa hình cho phép cùng một lời gọi method nhưng hành vi thực tế phụ thuộc vào object thật đang được tham chiếu. Tài liệu tham chiếu gọi cơ chế này là dynamic method dispatch khi method bị ghi đè được chọn lúc chương trình chạy.

- Ghi đè method

  Class cha `Person` có method:

  ```java
  public void inThongTin() {
      System.out.println("Person: " + hoTen + " - " + ngaySinh);
  }
  ```

  Class con `Student` ghi đè method này:

  ```java
  @Override
  public void inThongTin() {
      System.out.println("Student: " + maHS + " - " + hoTen + " - " + lopHoc);
  }
  ```

  `@Override` giúp trình biên dịch kiểm tra rằng method thật sự đang ghi đè method ở class cha.

- Biến kiểu cha tham chiếu object kiểu con

  Trong `Main.java`:

  ```java
  Person[] people = {
      new Student("260001", "Nguyễn Văn A", "01/01/2010", "26UD01"),
      new Teacher("Trần Thị B", "12/05/1990", "Pháp luật")
  };
  ```

  Mảng có kiểu `Person[]`, nhưng phần tử thật có thể là `Student` hoặc `Teacher`.

- Dynamic method dispatch

  Khi gọi:

  ```java
  person.inThongTin();
  ```

  Java chọn phiên bản `inThongTin()` dựa trên object thật:

  - Nếu object thật là `Student`, chạy `Student.inThongTin()`.
  - Nếu object thật là `Teacher`, chạy `Teacher.inThongTin()`.

  Đây là lợi ích chính của đa hình: code có thể xử lý nhiều kiểu object thông qua một kiểu chung.
