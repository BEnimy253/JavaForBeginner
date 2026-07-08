# VariablesAndDataTypes

## Biến

Biến là vùng nhớ có tên dùng để lưu dữ liệu trong chương trình. Java là ngôn ngữ kiểm tra kiểu chặt, vì vậy mỗi biến phải có kiểu dữ liệu rõ ràng.

Cú pháp khai báo:

```java
type variableName;
type variableName = value;
```

Ví dụ:

```java
int age = 20;
double score = 8.5;
String name = "Nguyen An";
```

## Hằng số

Hằng số là biến không thay đổi giá trị sau khi gán. Trong Java, dùng từ khóa `final`.

```java
final double PI = 3.14159;
```

Tên hằng số thường viết hoa để dễ nhận biết.

## Kiểu dữ liệu nguyên thủy

Java có 8 kiểu dữ liệu nguyên thủy:

- Số nguyên: `byte`, `short`, `int`, `long`
- Số thực: `float`, `double`
- Ký tự: `char`
- Luận lý: `boolean`

`String` không phải kiểu nguyên thủy. `String` là kiểu dữ liệu tham chiếu. Nói nhanh, ngoài 8 kiểu nguyên thủy, các kiểu còn lại trong Java đều là kiểu tham chiếu, ví dụ `String`, mảng, class tự tạo, interface.

## Operators

Các nhóm toán tử thường dùng:

- Arithmetic: `+`, `-`, `*`, `/`, `%`
- Assignment: `=`, `+=`, `-=`, `*=`, `/=`, `%=`
- Comparison: `==`, `!=`, `>`, `<`, `>=`, `<=`
- Logical: `&&`, `||`, `!`
- Unary: `++`, `--`, `+`, `-`
- Bitwise: `&`, `|`, `^`, `~`
- Shift: `<<`, `>>`, `>>>`
- Ternary: `condition ? valueIfTrue : valueIfFalse`

## Giải thích chương trình mẫu

- `sample01.java`: khai báo biến thuộc các kiểu phổ biến như `int`, `double`, `char`, `boolean` và `String`, sau đó in giá trị ra màn hình.
- `sample02.java`: dùng `final` để khai báo hằng số `PI`, rồi dùng toán tử số học để tính diện tích và chu vi hình tròn.
- `sample03.java`: minh họa đủ 8 kiểu nguyên thủy cùng `String`, giúp người học phân biệt kích thước, hậu tố số như `L`, `F` và cách nối chuỗi khi xuất dữ liệu.
