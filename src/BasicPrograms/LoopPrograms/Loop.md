# Kiến thức liên quan

## 1. Vòng lặp `for`

  Vòng lặp `for` thường được dùng khi biết trước số lần lặp, hoặc khi cần điều khiển biến đếm một cách rõ ràng.

  Cú pháp:

  ```java
  for (khởi_tạo; điều_kiện_lặp; cập_nhật) {
      // khối lệnh được lặp lại
  }
  ```

  Ý nghĩa của từng phần:

  - `khởi_tạo`: chạy một lần trước khi vòng lặp bắt đầu, thường dùng để tạo biến đếm.
  - `điều_kiện_lặp`: được kiểm tra trước mỗi lần lặp. Nếu là `true`, vòng lặp tiếp tục chạy; nếu là `false`, vòng lặp kết thúc.
  - `cập_nhật`: chạy sau mỗi lần lặp, thường dùng để tăng hoặc giảm biến đếm.

  Ví dụ trong `ForProgram.java`:

  ```java
  for (int i = 1; i <= 5; i++) {
      System.out.println("Giá trị của i: " + i);
  }
  ```

  Với đoạn code trên, biến `i` bắt đầu từ `1`. Sau mỗi lần lặp, `i++` tăng `i` thêm `1`. Vòng lặp dừng khi điều kiện `i <= 5` không còn đúng.

## 2. Vòng lặp `while`

  Vòng lặp `while` dùng khi chưa chắc trước số lần lặp, nhưng biết điều kiện để tiếp tục lặp. Điều kiện được kiểm tra trước khi chạy thân vòng lặp.

  Cú pháp:

  ```java
  while (điều_kiện_lặp) {
      // khối lệnh được lặp lại
  }
  ```

  Ví dụ trong `WhileProgram.java`:

  ```java
  int count = 1;

  while (count <= 5) {
      System.out.println("Giá trị của count: " + count);
      count++;
  }
  ```

  Ở ví dụ trên:

  - `count` bắt đầu từ `1`.
  - Trước mỗi lần lặp, Java kiểm tra điều kiện `count <= 5`.
  - Sau khi in giá trị, câu lệnh `count++` tăng biến `count` để vòng lặp tiến dần tới điểm dừng.

  Nếu điều kiện của `while` sai ngay từ đầu, thân vòng lặp sẽ không chạy lần nào.

## 3. Vòng lặp `do...while`

  Vòng lặp `do...while` giống `while` ở chỗ đều lặp dựa trên điều kiện. Điểm khác biệt quan trọng là `do...while` kiểm tra điều kiện sau khi chạy thân vòng lặp, nên thân vòng lặp luôn được thực hiện ít nhất một lần.

  Cú pháp:

  ```java
  do {
      // khối lệnh được lặp lại
  } while (điều_kiện_lặp);
  ```

  Ví dụ trong `DoWhileProgram.java`:

  ```java
  int count = 1;

  do {
      System.out.println("Giá trị của count: " + count);
      count++;
  } while (count <= 5);
  ```

  Ở ví dụ trên, chương trình in các giá trị từ `1` đến `5`. Sau mỗi lần chạy thân vòng lặp, Java mới kiểm tra điều kiện `count <= 5`.

### 4. Tổng kết nhanh `for`, `while` và `do...while`

  `for` phù hợp khi biết trước số lần lặp hoặc cần biến đếm rõ ràng.

  `while` phù hợp khi số lần lặp phụ thuộc vào một điều kiện và có thể không chạy lần nào nếu điều kiện sai ngay từ đầu.

  `do...while` phù hợp khi khối lệnh cần chạy ít nhất một lần trước khi kiểm tra điều kiện tiếp tục lặp.

  Khi viết vòng lặp, cần đảm bảo điều kiện lặp có thể trở thành `false`. Nếu không, chương trình có thể rơi vào vòng lặp vô hạn.
