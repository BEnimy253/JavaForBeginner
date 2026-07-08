# Kiến thức truyền đạt

- Câu lệnh `switch`

  `switch` là câu lệnh điều kiện dùng để chọn một nhánh xử lý dựa trên giá trị của một biểu thức. Khi cần so sánh cùng một biến hoặc cùng một biểu thức với nhiều giá trị cụ thể, `switch` thường giúp code dễ đọc hơn so với viết nhiều nhánh `if...else if`.

  Cú pháp tổng quát:

  ```java
  switch (biểu_thức) {
      case giá_trị_1:
          // câu lệnh
          break;
      case giá_trị_2:
          // câu lệnh
          break;
      default:
          // câu lệnh khi không khớp case nào
  }
  ```

  Trong Java, `switch` thường dùng với các kiểu như `byte`, `short`, `char`, `int`, `String`, `enum` và một số kiểu bao đóng tương ứng như `Byte`, `Short`, `Character`, `Integer`.

- Cách 1: `switch` truyền thống dùng `case`, `break` và `default`

  Đây là cách viết `switch` cơ bản và lâu đời nhất trong Java. Mỗi nhánh bắt đầu bằng `case`. Sau khi chạy xong một nhánh, thường cần dùng `break` để thoát khỏi `switch`.

  Ví dụ trong `SwitchProgram.java`:

  ```java
  int day = 3;

  switch (day) {
      case 1:
          System.out.println("Thứ hai");
          break;
      case 2:
          System.out.println("Thứ ba");
          break;
      case 3:
          System.out.println("Thứ tư");
          break;
      default:
          System.out.println("Ngày không hợp lệ");
  }
  ```

  Với `day = 3`, chương trình khớp với `case 3` và in ra `"Thứ tư"`.

  Vai trò của các thành phần:

  - `switch (day)`: lấy giá trị của biến `day` để so sánh với từng `case`.
  - `case 3`: nhánh được chọn khi giá trị của `day` bằng `3`.
  - `break`: kết thúc nhánh hiện tại và thoát khỏi `switch`.
  - `default`: nhánh chạy khi không có `case` nào khớp.

  Nếu quên `break` trong switch truyền thống, chương trình có thể tiếp tục chạy xuống các nhánh bên dưới. Hiện tượng này gọi là fall-through.

- Cách 2: `switch` dùng mũi tên `->`

  Từ các phiên bản Java hiện đại, `switch` có thể viết bằng mũi tên `->`. Cách viết này ngắn gọn hơn và tránh lỗi quên `break`, vì mỗi nhánh mũi tên không tự động rơi xuống nhánh tiếp theo.

  Ví dụ trong `SwitchProgram.java`:

  ```java
  int month = 4;

  switch (month) {
      case 1, 2, 3 -> System.out.println("Quý 1");
      case 4, 5, 6 -> System.out.println("Quý 2");
      case 7, 8, 9 -> System.out.println("Quý 3");
      case 10, 11, 12 -> System.out.println("Quý 4");
      default -> System.out.println("Tháng không hợp lệ");
  }
  ```

  Với `month = 4`, chương trình khớp với nhóm `case 4, 5, 6` và in ra `"Quý 2"`.

  Điểm đáng chú ý:

  - Một nhánh có thể gom nhiều giá trị bằng dấu phẩy, ví dụ `case 4, 5, 6`.
  - Không cần viết `break` sau mỗi nhánh.
  - Cách viết này phù hợp khi mỗi nhánh xử lý ngắn gọn, rõ ràng.

- Cách 3: `switch expression` trả về giá trị

  Ngoài việc dùng `switch` như một câu lệnh để thực hiện hành động, từ Java 14 `switch` còn có thể dùng như một biểu thức để trả về giá trị. Kết quả của `switch expression` có thể được gán trực tiếp vào biến.

  Ví dụ trong `SwitchProgram.java`:

  ```java
  int score = 85;

  String rank = switch (score / 10) {
      case 10, 9 -> "Xuất sắc";
      case 8 -> "Giỏi";
      case 7, 6 -> "Khá";
      case 5 -> "Trung bình";
      default -> "Chưa đạt";
  };

  System.out.println("Xếp loại: " + rank);
  ```

  Với `score = 85`, biểu thức `score / 10` cho kết quả `8`, nên `rank` nhận giá trị `"Giỏi"`.

  Một số điểm cần nhớ:

  - `switch expression` phải tạo ra một giá trị.
  - Thường cần có `default` để đảm bảo mọi trường hợp đều có kết quả.
  - Sau khối `switch expression` có dấu chấm phẩy `;` vì toàn bộ biểu thức đang được gán vào biến.

  Nếu một nhánh cần nhiều câu lệnh trước khi trả về kết quả, có thể dùng khối `{ }` và từ khóa `yield`:

  ```java
  String message = switch (score / 10) {
      case 10, 9 -> {
          System.out.println("Điểm rất cao");
          yield "Xuất sắc";
      }
      case 8 -> "Giỏi";
      default -> "Cần cố gắng thêm";
  };
  ```

- Khi nào nên dùng `switch`

  Nên dùng `switch` khi cần so sánh một biểu thức với nhiều giá trị cụ thể, ví dụ chọn ngày trong tuần, tháng trong năm, mã chức năng, trạng thái hoặc xếp loại theo nhóm giá trị rõ ràng.

  Nếu điều kiện là các khoảng phức tạp như `score >= 80 && score < 90`, `if...else if` thường linh hoạt hơn. Nếu điều kiện chủ yếu là các giá trị rời rạc như `case 1`, `case 2`, `case 3`, `switch` thường dễ đọc hơn.
