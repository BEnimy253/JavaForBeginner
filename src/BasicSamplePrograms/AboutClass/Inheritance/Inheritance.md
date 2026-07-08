# Inheritance

## Kế thừa

Kế thừa cho phép class con nhận fields và methods từ class cha. Java dùng từ khóa `extends`.

```java
class Student extends Person {
}
```

Kế thừa nên dùng khi quan hệ giữa hai class là "is-a", ví dụ `Student` là một `Person`.

## this và super

`this` đại diện cho object hiện tại. Nó thường dùng để phân biệt field với tham số cùng tên.

```java
this.major = major;
```

`super` đại diện cho phần class cha. Nó thường dùng để gọi constructor hoặc method của class cha.

```java
super(fullName);
```

## Overload và override

Overload là nạp chồng: cùng tên method nhưng khác danh sách tham số.

Override là nạp đè: class con định nghĩa lại method có cùng tên và cùng danh sách tham số với class cha.

`@Override` giúp trình biên dịch kiểm tra rằng method thật sự đang override.

## Giải thích chương trình mẫu

- `sample01.java`: `Student` kế thừa `Person`, dùng lại field `fullName` và method `introduce()`.
- `sample02.java`: constructor của `Student` gọi `super(fullName)` để khởi tạo phần `Person`, sau đó dùng `this.major`.
- `sample03.java`: `teach(String topic)` là overload, còn `JavaTeacher.teach()` là override method của `Teacher`.
