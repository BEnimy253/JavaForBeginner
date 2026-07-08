# packFinal - Chương trình quản lý học sinh hai ngành

`packFinal` là sản phẩm tổng hợp sau các package trước. Chương trình vẫn giữ mức cơ bản, không dùng nhập liệu phức tạp, không dùng `try-catch`, và giả sử các đối số truyền vào constructor hoặc method là đúng.

- Mục tiêu chương trình

  Chương trình quản lý học sinh của hai ngành:

  - `Công nghệ thông tin (Ứng dụng phần mềm)`, lớp `26UD01`.
  - `Tạo mẫu và chăm sóc sắc đẹp`, lớp `26SD01`.

  Mỗi ngành có hai môn chung:

  - `Pháp luật`
  - `Chính trị`

  Ngành Công nghệ thông tin có thêm ba môn:

  - `Lập trình Java`
  - `Cơ sở dữ liệu`
  - `Thiết kế Web`

  Ngành Tạo mẫu và chăm sóc sắc đẹp có thêm ba môn:

  - `Chăm sóc da`
  - `Trang điểm cơ bản`
  - `Tạo mẫu tóc`

- Công thức xét điều kiện dự thi

  Mỗi môn chỉ quan tâm hai cột điểm:

  - `KTTX`: hệ số 1.
  - `KTĐK`: hệ số 2.

  Điểm trung bình môn được tính:

  ```text
  (KTTX + KTĐK * 2) / 3
  ```

  Nếu điểm trung bình môn từ `5.0` trở lên, học sinh được dự thi kết thúc môn của môn đó.

- Cấu trúc class

  `Printable` là interface mô tả khả năng in thông tin:

  ```java
  public interface Printable {
      void printInfo();
  }
  ```

  `Person` là abstract class chứa dữ liệu chung của con người:

  ```java
  public abstract class Person implements Printable {
      private String hoTen;
      private String ngaySinh;
  }
  ```

  `Student` kế thừa `Person`, có thêm mã học sinh, lớp học, ngành học và danh sách điểm môn học:

  ```java
  public class Student extends Person {
      private String maHS;
      private String lopHoc;
      private String nganhHoc;
      private SubjectScore[] subjectScores;
  }
  ```

  `SubjectScore` lưu tên môn và hai cột điểm:

  ```java
  public class SubjectScore {
      private String tenMon;
      private float diemKTTX;
      private float diemKTDK;
  }
  ```

  `StudentManagement` quản lý học sinh bằng mảng thường:

  ```java
  private Student[] students = new Student[20];
  private int studentCount = 0;
  ```

- Các chức năng quản lý

  `StudentManagement` có các chức năng cơ bản:

  - `addStudent(Student student)`: thêm học sinh vào mảng.
  - `updateStudentName(String maHS, String hoTenMoi)`: sửa họ tên học sinh.
  - `deleteStudent(String maHS)`: xóa học sinh khỏi mảng.
  - `printStudents()`: xem danh sách học sinh.

  Khi xóa học sinh, các phần tử phía sau được dồn lên để mảng không bị trống ở giữa.

- Luồng chạy trong `Main.java`

  `Main.java` tạo dữ liệu mẫu bằng code:

  ```java
  Student student01 = new Student(..., createCongNgheThongTinScores());
  Student student02 = new Student(..., createChamSocSacDepScores());
  ```

  Sau đó chương trình:

  ```text
  tạo StudentManagement
      -> thêm học sinh
      -> sửa tên một học sinh
      -> xóa một học sinh
      -> in danh sách còn lại
  ```

  Đây là mô hình quản lý đơn giản để tổng hợp constructor, getter-setter, method, abstract class, interface, kế thừa, đa hình và đóng gói trong cùng một ví dụ nhỏ.
