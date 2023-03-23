package de2;

// Câu 1.
// Hãy xây dựng các lớp theo yêu cầu sau:
// a. Hãy định nghĩa class Person với các thuộc tính: Họ tên, ngày sinh, địa chỉ, giới tính
// và các phương thức khởi tạo, hiển thị thông tin.
// b. Định nghĩa class NhanVien kế thừa từ Person, có thêm các thuộc tính: phòng ban, hệ
// số lương, thâm niên, lương cơ bản và các phương thức khởi tạo, tính lương thực lĩnh,
// hiển thị thông tin cá nhân
// Trong đó: lương thực lĩnh = Lương cơ bản * hệ số (1 + thâm niên/100)

public class NhanVien extends Person{
    private String phongBan;
    private int thamNien;
    private int heSoLuong;
    private int luongCoBan;


    public NhanVien() {
    }


    public NhanVien(String hoTen, String ngaySinh, String diaChi, String gioiTinh, String phongBan, int thamNien,
            int heSoLuong, int luongCoBan) {
        super(hoTen, ngaySinh, diaChi, gioiTinh);
        this.phongBan = phongBan;
        this.thamNien = thamNien;
        this.heSoLuong = heSoLuong;
        this.luongCoBan = luongCoBan;
    }

    
    public String getPhongBan() {
        return phongBan;
    }
    public void setPhongBan(String phongBan) {
        this.phongBan = phongBan;
    }
    public int getThamNien() {
        return thamNien;
    }
    public void setThamNien(int thamNien) {
        this.thamNien = thamNien;
    }
    public int getHeSoLuong() {
        return heSoLuong;
    }
    public void setHeSoLuong(int heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public int getLuongCoBan() {
        return luongCoBan;
    }
    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public float luongThucLinh() {
        return luongCoBan * heSoLuong * (1 + thamNien / 100);
    }


    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("phong ban : " + phongBan);
        System.out.println("tham nien : " + thamNien);
        System.out.println("he so luong : " + heSoLuong);
        System.out.println("luong co ban : " + luongCoBan);
    }

    
}
