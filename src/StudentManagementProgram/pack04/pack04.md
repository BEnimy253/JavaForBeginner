# pack04 - Method

Package `pack04` tập trung vào method: method static, method non-static, method `void` và method có giá trị trả về.

- Method là gì

  Method mô tả hành vi hoặc thao tác xử lý của class. Theo tài liệu tham chiếu, code xử lý của class nằm trong các method, còn dữ liệu nằm trong các field.

  Cú pháp tổng quát:

  ```java
  kiểu_trả_về tên_method(danh_sách_tham_số) {
      // thân method
  }
  ```

- Method không trả về giá trị - `void`

  Method `void` thực hiện hành động nhưng không trả về dữ liệu cho nơi gọi.

  ```java
  public void inThongTin() {
      System.out.println(taoDongThongTin());
  }
  ```

  Method trên in thông tin học sinh ra màn hình.

- Method có trả về giá trị - `return`

  Method có kiểu trả về khác `void` phải dùng `return` để trả lại kết quả.

  ```java
  public String taoDongThongTin() {
      return dinhDangMaHS(maHS) + " - " + hoTen + " - " + lopHoc + " - " + nganhHoc;
  }
  ```

  Method này trả về một chuỗi, nên kiểu trả về là `String`.

- Method non-static

  Method non-static thuộc về từng object. Muốn gọi method này cần có đối tượng cụ thể.

  ```java
  Student student = new Student("260001", "Nguyễn Văn A", "01/01/2010", "26UD01", "Công nghệ thông tin");
  student.inThongTin();
  ```

  `student.inThongTin()` làm việc với dữ liệu của object `student`.

- Method static

  Method static là thành viên static của class. Theo tài liệu tham chiếu, static member có thể được dùng độc lập với một object cụ thể của class.

  ```java
  public static void inTenChuongTrinh() {
      System.out.println("Chương trình quản lý học sinh");
  }
  ```

  Cách gọi nên dùng tên class:

  ```java
  Student.inTenChuongTrinh();
  ```

  Trong `pack04`, method `dinhDangMaHS` cũng là static:

  ```java
  public static String dinhDangMaHS(String maHS) {
      return "HS-" + maHS;
  }
  ```

  Method static phù hợp cho thao tác không phụ thuộc vào trạng thái riêng của một object cụ thể. Trong Java, static method không truy cập trực tiếp được field non-static nếu không thông qua một object.
