# pack07 - Abstract class

Package `pack07` giới thiệu `abstract class` thông qua class `Person`.

- Abstract class là gì

  Abstract class là class không thể tạo object trực tiếp bằng `new`. Theo tài liệu tham chiếu, abstract class có thể chứa method đã cài đặt và method abstract. Một class có abstract method thì class đó phải được khai báo `abstract`.

  Trong `pack07`:

  ```java
  public abstract class Person {
      public abstract String getVaiTro();
  }
  ```

  Không tạo object trực tiếp bằng:

  ```java
  Person person = new Person();
  ```

  vì `Person` là abstract class.

- Abstract method

  Abstract method chỉ khai báo phần đầu method, không có thân method:

  ```java
  public abstract String getVaiTro();
  ```

  Class con cụ thể bắt buộc phải cài đặt method này. Nếu class con chưa cài đặt abstract method, class con đó cũng phải được khai báo `abstract`.

- Method thường trong abstract class

  Abstract class vẫn có thể có method bình thường:

  ```java
  public void inThongTinCoBan() {
      System.out.println(getVaiTro() + ": " + hoTen + " - " + ngaySinh);
  }
  ```

  Method này dùng `getVaiTro()`, còn vai trò cụ thể do class con quyết định.

- Class con cài đặt abstract method

  `Student` cài đặt:

  ```java
  @Override
  public String getVaiTro() {
      return "Học sinh " + maHS;
  }
  ```

  `Teacher` cũng cài đặt `getVaiTro()` theo cách riêng. Đây là cách abstract class buộc class con cung cấp phần hành vi còn thiếu.
