# AccessModifiers

## Access modifier là gì?

Access modifier quy định phạm vi có thể truy cập class, field, constructor hoặc method.

Java có các mức thường gặp:

- `public`: có thể truy cập từ mọi nơi nếu class/package cho phép.
- `protected`: truy cập trong cùng package và trong class con.
- default: không viết từ khóa nào, truy cập trong cùng package.
- `private`: chỉ truy cập bên trong chính class đó.

## private và đóng gói

Field nên để `private` khi không muốn nơi khác sửa trực tiếp. Khi cần đọc hoặc sửa, cung cấp method phù hợp như getter/setter.

## protected và kế thừa

`protected` hữu ích khi class cha muốn class con truy cập một field hoặc method, nhưng không muốn mở rộng ra toàn bộ chương trình như `public`.

## default access

Default access còn gọi là package-private. Thành phần không ghi modifier chỉ dùng được trong cùng package.

## Giải thích chương trình mẫu

- `sample01.java`: field `fullName` là `public`, còn `score` là `private` nên phải truy cập qua `setScore()` và `getScore()`.
- `sample02.java`: field `name` và method `printName()` không ghi modifier, minh họa default access trong cùng package/class mẫu.
- `sample03.java`: class `Student` kế thừa `Person` và gọi được method `protected introduce()`.
