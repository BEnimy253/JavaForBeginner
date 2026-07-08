package StudentManagementProgram.pack09;

public class Student {
    private String maHS;
    private String hoTen;
    private String lopHoc;
    private String nganhHoc;
    private float diemKTTX;
    private float diemKTDK;

    public Student(String maHS, String hoTen, String lopHoc, String nganhHoc, float diemKTTX, float diemKTDK) {
        this.maHS = maHS;
        this.hoTen = hoTen;
        this.lopHoc = lopHoc;
        this.nganhHoc = nganhHoc;
        this.diemKTTX = diemKTTX;
        this.diemKTDK = diemKTDK;
    }

    public String getMaHS() {
        return maHS;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public float getDiemTrungBinh() {
        return tinhDiemTrungBinh();
    }

    public boolean duocDuThiKetThucMon() {
        return tinhDiemTrungBinh() >= 5;
    }

    public String getDongThongTin() {
        return maHS + " - " + hoTen + " - " + lopHoc + " - " + nganhHoc
                + " - TB: " + getDiemTrungBinh()
                + " - " + (duocDuThiKetThucMon() ? "Được dự thi" : "Chưa đủ điều kiện");
    }

    private float tinhDiemTrungBinh() {
        return (diemKTTX + diemKTDK * 2) / 3;
    }
}
