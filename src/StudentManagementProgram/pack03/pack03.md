# pack03 - Getter và setter

Package `pack03` chỉnh tiếp từ `pack02`: các field của `Student` được chuyển từ `public` sang `private`, sau đó truy cập thông qua getter và setter.

- Vì sao cần getter và setter

  Tài liệu tham chiếu trình bày access control như một cơ chế kiểm soát cách thành viên của class được truy cập. Khi field để `private`, code bên ngoài class không truy cập trực tiếp được field đó.

  Getter và setter là các method công khai để đọc và ghi dữ liệu một cách có kiểm soát:

  ```java
  public String getHoTen() {
      return hoTen;
  }

  public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
  }
  ```

- Access modifier cơ bản

  Access modifier quy định phạm vi mà code khác có thể truy cập class, field, constructor hoặc method. Theo `Java: The Complete Reference`, Java có ba access modifier là `public`, `private`, `protected`, đồng thời có thêm mức truy cập mặc định khi không ghi modifier.

  Bảng tóm tắt:

  | Modifier | Phạm vi truy cập cơ bản |
  | --- | --- |
  | `public` | Có thể được truy cập từ mọi nơi, miễn là class chứa nó cũng truy cập được. |
  | `private` | Chỉ truy cập được bên trong chính class khai báo thành viên đó. |
  | Không ghi modifier | Truy cập được trong cùng package; thường gọi là default access hoặc package-private. |
  | `protected` | Truy cập được trong cùng package và trong class con, đặc biệt liên quan đến kế thừa. |

  Với top-level class, Java chỉ cho phép dùng `public` hoặc không ghi modifier. `private` và `protected` không dùng cho top-level class.

  Trong `pack03`, các field được đặt `private` để code bên ngoài không sửa trực tiếp dữ liệu:

  ```java
  private String maHS;
  private String hoTen;
  ```

  Sau đó class mở ra các method `public` như `getHoTen()` và `setHoTen(...)` để kiểm soát cách đọc và ghi dữ liệu.

- Getter

  Getter là method dùng để đọc giá trị của field.

  ```java
  public String getMaHS() {
      return maHS;
  }
  ```

  Cách dùng:

  ```java
  System.out.println(student.getMaHS());
  ```

- Setter

  Setter là method dùng để gán giá trị mới cho field.

  ```java
  public void setLopHoc(String lopHoc) {
      this.lopHoc = lopHoc;
  }
  ```

  Cách dùng:

  ```java
  student.setLopHoc("26UD01");
  ```

- Quan hệ với field private

  Trong `pack03`, field được đặt `private`:

  ```java
  private String maHS;
  private String hoTen;
  ```

  Vì vậy cách truy cập trực tiếp như `student.hoTen` không còn dùng được. Thay vào đó cần gọi:

  ```java
  student.getHoTen();
  student.setHoTen("Nguyễn Văn Bình");
  ```

  Đây là bước chuẩn bị cho tính đóng gói: dữ liệu được che bên trong class, còn bên ngoài làm việc với object qua method công khai.
