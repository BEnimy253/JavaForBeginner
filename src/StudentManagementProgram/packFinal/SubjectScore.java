package StudentManagementProgram.packFinal;

public class SubjectScore {
    private String tenMon;
    private float diemKTTX;
    private float diemKTDK;

    public SubjectScore(String tenMon, float diemKTTX, float diemKTDK) {
        this.tenMon = tenMon;
        this.diemKTTX = diemKTTX;
        this.diemKTDK = diemKTDK;
    }

    public float getDiemTrungBinh() {
        return (diemKTTX + diemKTDK * 2) / 3;
    }

    public boolean duocDuThiKetThucMon() {
        return getDiemTrungBinh() >= 5;
    }

    public String getDongThongTin() {
        return tenMon
                + " | KTTX: " + diemKTTX
                + " | KTĐK: " + diemKTDK
                + " | TB: " + getDiemTrungBinh()
                + " | " + (duocDuThiKetThucMon() ? "Được dự thi" : "Chưa đủ điều kiện");
    }
}
