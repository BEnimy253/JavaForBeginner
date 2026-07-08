# pack09 - Tính đóng gói

Package `pack09` tập trung vào tính đóng gói bằng cách che dữ liệu bên trong class và chỉ cho bên ngoài làm việc thông qua method công khai.

- Đóng gói là gì

  Đóng gói là nguyên tắc gom dữ liệu và hành vi liên quan vào cùng một class, đồng thời kiểm soát quyền truy cập vào dữ liệu. Nội dung này phù hợp với phần access control trong tài liệu tham chiếu và phần đóng gói trong PPTX.

  Access control là công cụ quan trọng để triển khai đóng gói:

  - `private`: che chi tiết bên trong class.
  - `public`: mở ra phần giao tiếp chính thức cho code bên ngoài.
  - Không ghi modifier: cho phép truy cập trong cùng package.
  - `protected`: dùng khi cần chia sẻ thành viên cho cùng package hoặc class con trong kế thừa.

  Đóng gói không có nghĩa là mọi thứ đều phải `private`. Điểm quan trọng là chỉ để lộ những gì bên ngoài thật sự cần dùng, còn trạng thái và chi tiết xử lý nên được giữ bên trong class.

- Che dữ liệu bằng `private`

  Trong `Student.java`, các field được đặt `private`:

  ```java
  private String maHS;
  private String hoTen;
  private float diemKTTX;
  private float diemKTDK;
  ```

  Code bên ngoài không truy cập trực tiếp được `student.hoTen` hoặc `student.diemKTTX`.

  Đây là điểm đúng với quy tắc `private`: thành viên private chỉ được truy cập bởi các thành viên khác trong cùng class.

- Mở cổng truy cập bằng method public

  Class cung cấp getter, setter hoặc method nghiệp vụ:

  ```java
  public String getMaHS() {
      return maHS;
  }

  public void setHoTen(String hoTen) {
      this.hoTen = hoTen;
  }
  ```

  Bên ngoài class chỉ cần gọi method, không cần biết dữ liệu bên trong được lưu hoặc tính toán như thế nào.

  Method `public` đóng vai trò là giao diện sử dụng của class. Nếu sau này công thức tính điểm hoặc cách lưu dữ liệu thay đổi, code bên ngoài vẫn có thể giữ nguyên cách gọi method.

- Che chi tiết xử lý bằng method private

  Công thức tính điểm trung bình được đặt trong method private:

  ```java
  private float tinhDiemTrungBinh() {
      return (diemKTTX + diemKTDK * 2) / 3;
  }
  ```

  Bên ngoài không gọi trực tiếp method này. Thay vào đó gọi:

  ```java
  student.getDiemTrungBinh();
  student.duocDuThiKetThucMon();
  ```

- Đóng gói trong class quản lý

  `StudentManagement` cũng che mảng dữ liệu:

  ```java
  private Student[] students = new Student[10];
  private int studentCount = 0;
  ```

  Bên ngoài không sửa trực tiếp mảng `students`, mà gọi:

  ```java
  management.addStudent(student);
  management.updateStudentName("260001", "Nguyễn Văn An");
  management.printStudents();
  ```

  Cách tổ chức này giúp class tự chịu trách nhiệm với dữ liệu của nó và giảm việc code bên ngoài can thiệp sai vào trạng thái bên trong.
