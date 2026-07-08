# Kiến thức truyền đạt

- Câu lệnh điều kiện `if`

  Câu lệnh `if` dùng để kiểm tra một điều kiện. Nếu điều kiện có giá trị `true`, khối lệnh bên trong `{ }` sẽ được thực thi. Nếu điều kiện có giá trị `false`, khối lệnh đó sẽ bị bỏ qua.

  Cú pháp:

  ```java
  if (điều_kiện) {
      // câu lệnh được thực thi khi điều_kiện là true
  }
  ```

  Trong Java, điều kiện đặt trong cặp ngoặc tròn `( )` phải là một biểu thức có kiểu `boolean`, tức là chỉ có thể nhận giá trị `true` hoặc `false`.

  Ví dụ trong `IfProgram.java`:

  ```java
  int age = 18;

  if (age >= 18) {
      System.out.println("Bạn đã đủ tuổi trưởng thành.");
  }
  ```

  Ở ví dụ trên:

  - `age >= 18` là biểu thức điều kiện.
  - Nếu `age` lớn hơn hoặc bằng `18`, chương trình in ra thông báo.
  - Nếu `age` nhỏ hơn `18`, chương trình bỏ qua khối lệnh trong `if`.

- Câu lệnh điều kiện `if...else`

  Câu lệnh `if...else` dùng khi chương trình cần chọn một trong hai nhánh xử lý. Nếu điều kiện trong `if` là `true`, khối lệnh của `if` chạy. Ngược lại, khối lệnh của `else` chạy.

  Cú pháp:

  ```java
  if (điều_kiện) {
      // câu lệnh khi điều_kiện là true
  } else {
      // câu lệnh khi điều_kiện là false
  }
  ```

  Ví dụ trong `IfProgram.java`:

  ```java
  int number = 7;

  if (number % 2 == 0) {
      System.out.println(number + " là số chẵn.");
  } else {
      System.out.println(number + " là số lẻ.");
  }
  ```

  Trong ví dụ này:

  - `number % 2` là phép chia lấy phần dư.
  - Nếu `number % 2 == 0`, số đó là số chẵn.
  - Nếu điều kiện trên sai, chương trình đi vào nhánh `else` và kết luận đó là số lẻ.

  Lưu ý: `else` không có điều kiện riêng. Nó đại diện cho tất cả trường hợp còn lại khi điều kiện của `if` không đúng.

- Câu lệnh điều kiện `if...else if...else`

  Trong Java không có từ khóa `elif`. Cách viết đúng trong Java là `else if`. Về ý nghĩa, `else if` tương đương với `elif` trong một số ngôn ngữ khác: nó dùng để kiểm tra thêm điều kiện mới khi các điều kiện phía trước không đúng.

  Cú pháp trong Java:

  ```java
  if (điều_kiện_1) {
      // câu lệnh khi điều_kiện_1 là true
  } else if (điều_kiện_2) {
      // câu lệnh khi điều_kiện_1 false và điều_kiện_2 true
  } else if (điều_kiện_3) {
      // câu lệnh khi các điều kiện trước false và điều_kiện_3 true
  } else {
      // câu lệnh khi tất cả điều kiện phía trên đều false
  }
  ```

  Ví dụ trong `IfProgram.java`:

  ```java
  int score = 85;

  if (score >= 90) {
      System.out.println("Xếp loại: Xuất sắc");
  } else if (score >= 80) {
      System.out.println("Xếp loại: Giỏi");
  } else if (score >= 65) {
      System.out.println("Xếp loại: Khá");
  } else if (score >= 50) {
      System.out.println("Xếp loại: Trung bình");
  } else {
      System.out.println("Xếp loại: Chưa đạt");
  }
  ```

  Với `score = 85`, chương trình kiểm tra theo thứ tự:

  - `score >= 90` là `false`, nên bỏ qua nhánh này.
  - `score >= 80` là `true`, nên in ra `"Xếp loại: Giỏi"`.
  - Các nhánh phía sau không được kiểm tra nữa vì đã tìm thấy nhánh đúng đầu tiên.

  Khi viết chuỗi `if...else if...else`, nên sắp xếp điều kiện theo thứ tự hợp lý. Với ví dụ xếp loại điểm, điều kiện được đặt từ mức điểm cao xuống thấp để tránh nhánh trước bắt mất trường hợp của nhánh sau.
