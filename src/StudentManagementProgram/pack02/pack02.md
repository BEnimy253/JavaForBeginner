# pack02 - Constructor

Package `pack02` tiếp tục từ `pack01` bằng cách thêm constructor cho class `Student`.

- Constructor là gì

  Constructor là khối lệnh đặc biệt dùng để khởi tạo trạng thái ban đầu cho đối tượng. Theo tài liệu `Java: The Complete Reference`, constructor có tên trùng với tên class và không khai báo kiểu trả về.

  Ví dụ:

  ```java
  public Student() {
      maHS = "260001";
      hoTen = "Nguyễn Văn A";
  }
  ```

  Constructor trên được gọi tự động khi tạo đối tượng:

  ```java
  Student student = new Student();
  ```

- Constructor mặc định tự viết

  Trong `Student.java`, constructor không tham số gán sẵn dữ liệu cho đối tượng:

  ```java
  public Student() {
      maHS = "260001";
      hoTen = "Nguyễn Văn A";
      ngaySinh = "01/01/2010";
      lopHoc = "26UD01";
      nganhHoc = "Công nghệ thông tin (Ứng dụng công nghệ)";
  }
  ```

  Khi gọi `new Student()`, đối tượng nhận các giá trị mặc định này.

- Constructor có tham số

  Constructor có tham số cho phép truyền dữ liệu từ bên ngoài vào lúc tạo đối tượng:

  ```java
  public Student(String maHS, String hoTen, String ngaySinh, String lopHoc, String nganhHoc) {
      this.maHS = maHS;
      this.hoTen = hoTen;
      this.ngaySinh = ngaySinh;
      this.lopHoc = lopHoc;
      this.nganhHoc = nganhHoc;
  }
  ```

  Từ khóa `this` dùng để chỉ field của đối tượng hiện tại. Khi tham số và field trùng tên, `this.maHS` là field, còn `maHS` là tham số.

- Nạp chồng constructor

  Một class có thể có nhiều constructor nếu danh sách tham số khác nhau. Đây là một dạng overloading. Trong `pack02`, class `Student` có hai cách tạo object:

  ```java
  Student defaultStudent = new Student();
  Student customStudent = new Student("260002", "Trần Thị B", "15/03/2010", "26SD01", "Tạo mẫu và chăm sóc sắc đẹp");
  ```

  Constructor giúp object có trạng thái hợp lệ ngay từ khi được tạo.
