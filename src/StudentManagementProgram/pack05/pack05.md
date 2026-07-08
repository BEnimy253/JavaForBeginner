# pack05 - Tính kế thừa

Package `pack05` giới thiệu tính kế thừa bằng cách tách dữ liệu chung của con người vào class `Person`, sau đó cho class `Student` kế thừa từ `Person`.

- Kế thừa là gì

  Kế thừa cho phép một class mới mở rộng từ một class đã có. Theo tài liệu tham chiếu, class con có thể kế thừa các thành viên phù hợp của class cha và bổ sung phần riêng của nó.

  Cú pháp:

  ```java
  class Student extends Person {
      // phần riêng của Student
  }
  ```

  Trong `pack05`, `Student` là subclass, `Person` là superclass.

- Class cha

  `Person` chứa thông tin chung:

  ```java
  public class Person {
      protected String hoTen;
      protected String ngaySinh;
  }
  ```

  `protected` cho phép truy cập trong cùng package và trong class con ở package khác. Trong ví dụ này, nó giúp `Student` dùng được dữ liệu chung do `Person` cung cấp.

- Class con

  `Student` kế thừa từ `Person` và thêm thông tin riêng:

  ```java
  public class Student extends Person {
      private String maHS;
      private String lopHoc;
      private String nganhHoc;
  }
  ```

  Học sinh là một dạng cụ thể của con người, nên quan hệ `Student extends Person` phù hợp với mô hình này. Lưu ý: private member của class cha không được class con truy cập trực tiếp; nếu cần dùng dữ liệu private của class cha, class cha nên cung cấp method phù hợp.

- Từ khóa `super`

  Constructor của `Student` gọi constructor của `Person` bằng `super`:

  ```java
  public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc) {
      super(hoTen, ngaySinh);
      this.maHS = maHS;
      this.lopHoc = lopHoc;
      this.nganhHoc = nganhHoc;
  }
  ```

  `super(hoTen, ngaySinh)` khởi tạo phần dữ liệu thuộc class cha trước, sau đó constructor tiếp tục gán dữ liệu riêng của class con.
