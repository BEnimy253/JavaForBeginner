# FilesStream

## java.io.File

`File` biểu diễn tên đường dẫn của một tệp tin hoặc thư mục. `File` không trực tiếp đọc nội dung byte/ký tự như stream, nhưng nó giúp kiểm tra và xử lý thông tin hệ thống tệp.

Các phương thức thường dùng:

- `exists()`: kiểm tra đường dẫn có tồn tại không
- `isFile()`: kiểm tra có phải tệp tin không
- `isDirectory()`: kiểm tra có phải thư mục không
- `getName()`: lấy tên tệp hoặc thư mục
- `getAbsolutePath()`: lấy đường dẫn tuyệt đối
- `length()`: lấy kích thước tệp theo byte
- `listFiles()`: lấy danh sách tệp/thư mục con
- `createNewFile()`, `mkdir()`, `mkdirs()`: tạo tệp hoặc thư mục

## Đọc và xử lý tệp cơ bản

Khi cần đọc nội dung, có thể kết hợp `File` với lớp khác như `Scanner`, `FileReader` hoặc `BufferedReader`. Với người mới, `Scanner` dễ tiếp cận vì có các phương thức như `hasNextInt()`, `nextInt()`, `nextLine()`.

Nên kiểm tra tệp có tồn tại trước khi đọc, hoặc xử lý ngoại lệ liên quan đến tệp.

## Giải thích chương trình mẫu

- `sample01.java`: tạo đối tượng `File` trỏ đến `sample-data.txt` và in các thông tin cơ bản như tên, đường dẫn, trạng thái tồn tại và kích thước.
- `sample02.java`: dùng `File(".")` để đại diện thư mục hiện tại, gọi `listFiles()` rồi phân biệt thư mục và tệp tin.
- `sample03.java`: tạo tệp `numbers.txt`, ghi vài số vào tệp, sau đó dùng `Scanner` đọc lại các số và tính tổng.
