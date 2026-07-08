# Kiến thức truyền đạt

- Từ khóa và Định danh

  Từ khóa (keyword) là những từ đã được Java định nghĩa sẵn để mang ý nghĩa đặc biệt trong ngôn ngữ. Vì đã có chức năng riêng, từ khóa không được dùng làm tên biến, tên lớp, tên phương thức hoặc các tên tự đặt khác.

  Ví dụ trong `SecondProgram.java`, các từ như `package`, `public`, `class`, `static`, `void` và `int` là từ khóa của Java.

  Định danh (identifier) là tên do lập trình viên tự đặt để gọi lớp, phương thức, biến, hằng hoặc các thành phần khác trong chương trình.

  Ví dụ trong `SecondProgram.java`:

  ```java
  public class SecondProgram {
      public static void main(String[] args) {
          int num;
      }
  }
  ```

  Trong đoạn code trên, `SecondProgram`, `main`, `args` và `num` là các định danh.

  Ba quy tắc cơ bản khi đặt tên định danh:

  1. Định danh có thể gồm chữ cái, chữ số, dấu `_`, ký hiệu tiền tệ như `$`, ...
  2. Chữ số không được đứng đầu tên định danh.
  3. Định danh không được trùng với từ khóa của Java.

- Khai báo biến: `loại_dữ_liệu định_danh [= giá_trị][, định_danh [= giá_trị] ...];`

  Biến là vùng nhớ có tên, dùng để lưu trữ dữ liệu trong quá trình chương trình chạy. Trong Java, mỗi biến phải được khai báo kèm kiểu dữ liệu trước khi sử dụng.

  Cú pháp tổng quát:

  ```java
  kiểu_dữ_liệu tên_biến;
  kiểu_dữ_liệu tên_biến = giá_trị_ban_đầu;
  kiểu_dữ_liệu biến_1 = giá_trị_1, biến_2 = giá_trị_2;
  ```

  Ví dụ trong `SecondProgram.java`:

  ```java
  int num;
  num = 100;
  ```

  Trong ví dụ trên:

  - `int` là kiểu dữ liệu của biến.
  - `num` là tên biến.
  - `num = 100;` là câu lệnh gán giá trị `100` cho biến `num`.

  Có thể vừa khai báo vừa gán giá trị ban đầu:

  ```java
  int num = 100;
  ```

  Tên biến trong Java nên đặt rõ nghĩa, dùng chữ cái, chữ số, `_` hoặc `$`, nhưng không được bắt đầu bằng chữ số và không được trùng với từ khóa của Java.

- Trong Java có 8 kiểu dữ liệu nguyên thủy (primitive type) được chia làm 4 loại:

  Kiểu dữ liệu nguyên thủy lưu trực tiếp giá trị của dữ liệu. Chúng không phải là đối tượng và có kích thước xác định.

  + Loại số nguyên (integer): `long` (64 bit), `int` (32 bit), `short` (16 bit) và `byte` (8 bit)

    Các kiểu này dùng để lưu số nguyên, không có phần thập phân.

    ```java
    byte smallNumber = 10;
    short count = 300;
    int num = 100;
    long population = 9000000000L;
    ```

    Trong `SecondProgram.java`, biến `num` dùng kiểu `int`, phù hợp để lưu giá trị số nguyên như `100` và kết quả `num * 2`.

  + Loại số dấu chấm động (floating-points): `double` (64 bit) và `float` (32 bit)

    Các kiểu này dùng để lưu số có phần thập phân. Trong Java, số thực mặc định là `double`; nếu dùng `float`, cần thêm hậu tố `F` hoặc `f`.

    ```java
    double average = 8.75;
    float score = 9.5F;
    ```

  + Loại ký tự (character): `char` (16 bit)

    `char` dùng để lưu một ký tự Unicode và được viết trong cặp dấu nháy đơn.

    ```java
    char grade = 'A';
    ```

  + Loại boolean: `boolean` (2 giá trị `true` và `false`)

    `boolean` dùng để biểu diễn điều kiện đúng hoặc sai, thường gặp trong câu lệnh điều kiện và vòng lặp.

    ```java
    boolean isPassed = true;
    ```

- Các loại còn lại là kiểu dữ liệu tham chiếu (reference types): `class`, `interface`, `array`, `enum`, ...

  Kiểu dữ liệu tham chiếu không lưu trực tiếp giá trị đơn lẻ như kiểu nguyên thủy. Thay vào đó, biến tham chiếu lưu một giá trị tham chiếu đến đối tượng hoặc mảng trong bộ nhớ.

  Một số ví dụ quen thuộc:

  ```java
  String message = "Hello World";
  int[] numbers = {1, 2, 3};
  SecondProgram program;
  ```

  Trong `SecondProgram.java`, chuỗi `"Đây là số: "` và `"Giá trị của num * 2 là: "` là các giá trị thuộc kiểu `String`. `String` là một lớp trong Java, nên thuộc nhóm kiểu dữ liệu tham chiếu.

  Điểm khác biệt cơ bản:

  - Kiểu nguyên thủy như `int`, `double`, `boolean` lưu trực tiếp giá trị.
  - Kiểu tham chiếu như `String`, mảng, đối tượng lưu tham chiếu đến dữ liệu.

- Thành lập biểu thức trong Java, có thể sử dụng các toán tử, chúng được chia thành các loại:

  Biểu thức là sự kết hợp giữa biến, giá trị, toán tử và lời gọi phương thức để tạo ra một giá trị mới. Ví dụ trong `SecondProgram.java`:

  ```java
  num = num * 2;
  ```

  Đây là biểu thức gán. Phần `num * 2` được tính trước, sau đó kết quả được gán lại cho biến `num`.

  + Toán tử số học (Arithmetic Operators): `+`, `-`, `*`, `/`, `%`, `++`, `--`

    Toán tử số học dùng để thực hiện phép tính trên các giá trị số.

    ```java
    int a = 10;
    int b = 3;

    int sum = a + b;        // 13
    int difference = a - b; // 7
    int product = a * b;    // 30
    int quotient = a / b;   // 3, vì đây là phép chia số nguyên
    int remainder = a % b;  // 1
    ```

    Trong `SecondProgram.java`, toán tử `*` được dùng ở biểu thức:

    ```java
    num = num * 2;
    ```

    Nếu `num` đang là `100`, sau câu lệnh này `num` sẽ trở thành `200`.

  + Toán tử thao tác bit (Bitwise Operators): `~`, `&`, `|`, `^`, `>>`, `>>>`, `<<`, `&=`, `|=`, `^=`, `>>=`, `>>>=`, `<<=`

    Toán tử thao tác bit làm việc trực tiếp trên từng bit của dữ liệu kiểu số nguyên, gồm `byte`, `short`, `int`, `long` và `char`. Chúng thường được dùng trong các bài toán cần xử lý bit, cờ trạng thái hoặc tối ưu cấp thấp.

    ```java
    int a = 5;  // 0101
    int b = 3;  // 0011

    int andResult = a & b;  // 0001, kết quả là 1
    int orResult = a | b;   // 0111, kết quả là 7
    int xorResult = a ^ b;  // 0110, kết quả là 6
    ```

    Các toán tử như `&=`, `|=` và `^=` là dạng gán kết hợp với phép toán bit.

  + Toán tử quan hệ (Relational Operators): `==`, `!=`, `>`, `<`, `>=`, `<=`

    Toán tử quan hệ dùng để so sánh hai giá trị. Kết quả của biểu thức quan hệ luôn là kiểu `boolean`.

    ```java
    int num = 100;

    boolean isEqual = num == 100;      // true
    boolean isGreater = num > 50;      // true
    boolean isDifferent = num != 200;  // true
    ```

    Lưu ý: `=` là toán tử gán, còn `==` là toán tử so sánh bằng.

  + Toán tử logic boolean (Boolean Logical Operators): `&`, `|`, `^`, `||`, `&&`, `!`, `&=`, `|=`, `^=`, `==`, `!=`, `?:`

    Toán tử logic boolean dùng để kết hợp hoặc đảo ngược các biểu thức có giá trị `true` hoặc `false`.

    ```java
    boolean hasScore = true;
    boolean isPassed = true;

    boolean canPrintResult = hasScore && isPassed;
    ```

    Một số điểm cần nhớ:

    - `&&`: AND ngắn mạch, nếu vế trái là `false` thì vế phải không cần kiểm tra.
    - `||`: OR ngắn mạch, nếu vế trái là `true` thì vế phải không cần kiểm tra.
    - `!`: đảo ngược giá trị boolean.
    - `&`, `|`, `^` cũng dùng được với boolean, nhưng không có tính ngắn mạch như `&&` và `||`.

  + Toán tử gán (Assignment Operator): `=`

    Toán tử gán dùng để đưa giá trị vào biến.

    ```java
    int num;
    num = 100;
    ```

    Trong câu lệnh:

    ```java
    num = num * 2;
    ```

    Java tính biểu thức bên phải `num * 2` trước, sau đó gán kết quả vào biến bên trái `num`.

    Ngoài `=`, Java còn có các toán tử gán kết hợp như `+=`, `-=`, `*=`, `/=`, `%=`. Ví dụ:

    ```java
    num *= 2;
    ```

    Câu lệnh trên có ý nghĩa tương đương:

    ```java
    num = num * 2;
    ```

  + Toán tử `?`

    Đây là toán tử điều kiện ba ngôi, có dạng đầy đủ là `?:`.

    Cú pháp:

    ```java
    điều_kiện ? giá_trị_khi_đúng : giá_trị_khi_sai;
    ```

    Ví dụ:

    ```java
    int num = 100;
    String result = num > 0 ? "Số dương" : "Không phải số dương";
    ```

    Nếu điều kiện `num > 0` là `true`, biểu thức trả về `"Số dương"`. Nếu điều kiện là `false`, biểu thức trả về `"Không phải số dương"`.
