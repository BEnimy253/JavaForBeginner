package BasicPrograms;

public class SwitchProgram {
    public static void main(String[] args) {
        int day = 3;

        // Cách 1: switch truyền thống dùng case, break và default
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
            case 4:
                System.out.println("Thứ năm");
                break;
            case 5:
                System.out.println("Thứ sáu");
                break;
            case 6:
                System.out.println("Thứ bảy");
                break;
            case 7:
                System.out.println("Chủ nhật");
                break;
            default:
                System.out.println("Ngày không hợp lệ");
        }

        int month = 4;

        // Cách 2: switch dùng mũi tên ->
        switch (month) {
            case 1, 2, 3 -> System.out.println("Quý 1");
            case 4, 5, 6 -> System.out.println("Quý 2");
            case 7, 8, 9 -> System.out.println("Quý 3");
            case 10, 11, 12 -> System.out.println("Quý 4");
            default -> System.out.println("Tháng không hợp lệ");
        }

        int score = 85;

        // Cách 3: switch expression trả về một giá trị
        String rank = switch (score / 10) {
            case 10, 9 -> "Xuất sắc";
            case 8 -> "Giỏi";
            case 7, 6 -> "Khá";
            case 5 -> "Trung bình";
            default -> "Chưa đạt";
        };

        System.out.println("Xếp loại: " + rank);
    }
}
