# TeachingRelatedPrograms

Kho chương trình này được tổ chức như tài liệu học Java cơ bản cho người mới bắt đầu. Nội dung chính hiện nằm trong `src/BasicSamplePrograms`; thư mục `src/StudentManagementProgram` đã được dọn trống theo kế hoạch để dành cho phần bài tập/dự án khác sau này.

## Cách đọc tài liệu

Mỗi chủ đề có hai loại file:

- File `.md`: trình bày lý thuyết ngắn gọn, dựa trên tài liệu tham chiếu trong `reference_docs`, sau đó giải thích từng chương trình mẫu.
- File `.java`: chương trình đơn giản, có thể biên dịch và chạy riêng để quan sát cú pháp đang học.

Tên file Java được giữ theo mẫu `sample01.java`, `sample02.java`, `sample03.java` để dễ đối chiếu với phần giải thích trong file `.md`.

## Cấu trúc phân phối

```text
src/
  BasicSamplePrograms/
    BasicInAndOutStream/
    VariablesAndDataTypes/
    Branch/
    Jump/
    Loop/
      ForLoop/
      WhileLoop/
      DoWhileLoop/
    FilesStream/
    AboutClass/
      DeclarationAndFields/
      Constructors/
      Methods/
      GetterSetter/
      AccessModifiers/
      Abstract/
      Interface/
      Inheritance/
      Polymorphism/
    ExceptionProcessing/
  StudentManagementProgram/
```

## Nội dung các chủ đề

- `BasicInAndOutStream`: nhập bằng `System.in` với `Scanner`, xuất bằng `System.out.print()` và `System.out.println()`, kèm phần comments.
- `VariablesAndDataTypes`: biến, hằng số, 8 kiểu dữ liệu nguyên thủy, `String`, kiểu tham chiếu và các nhóm toán tử.
- `Branch`: `if`, `if...else`, `if` lồng nhau.
- `Jump`: `switch` truyền thống và switch expression.
- `Loop`: lý thuyết chung cho `for`, `while`, `do-while`; mỗi loại có 3 chương trình mẫu.
- `FilesStream`: thao tác tệp/thư mục cơ bản với `java.io.File`.
- `AboutClass`: các phần nền tảng của lập trình hướng đối tượng trong Java.
- `ExceptionProcessing`: `try-catch`, nhiều `catch`, `finally`.
