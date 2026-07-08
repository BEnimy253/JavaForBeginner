# Interface

Tài liệu tham chiếu chính: `reference_docs/Java_ The Complete Reference, T - Herbert Schildt.pdf`, chương packages and interfaces.

## Interface là gì?

Interface mô tả một nhóm hành vi mà class cần cung cấp. Class dùng từ khóa `implements` để thực hiện interface.

```java
interface Printable {
    void print();
}

class Student implements Printable {
    public void print() {
        System.out.println("Student");
    }
}
```

Method public trong interface phải được class triển khai với phạm vi `public`.

## Một class có thể implements nhiều interface

Java không cho một class kế thừa nhiều class cha, nhưng một class có thể implements nhiều interface.

```java
class Notebook implements Readable, Writable {
}
```

## default method

Interface hiện đại có thể có `default method`, tức là method có sẵn thân lệnh. Class implements có thể dùng luôn hoặc override lại.

## Interface như một kiểu dữ liệu

Có thể khai báo biến theo kiểu interface:

```java
Printable printable = new Student();
```

Cách này giúp code linh hoạt vì chỉ phụ thuộc vào hành vi cần dùng, không phụ thuộc class cụ thể.

## Giải thích chương trình mẫu

- `sample01.java`: class `Student` implements interface `Printable` và được gọi thông qua biến kiểu `Printable`.
- `sample02.java`: class `Notebook` implements hai interface `Readable` và `Writable`.
- `sample03.java`: interface `Payable` có default method `printPayment()`, class `Invoice` chỉ cần cài đặt `getPayment()`.
