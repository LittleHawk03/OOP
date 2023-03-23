package de2;

// Câu 1.
// Hãy xây dựng các lớp theo yêu cầu sau:
// a. Hãy định nghĩa class Person với các thuộc tính: Họ tên, ngày sinh, địa chỉ, giới tính
// và các phương thức khởi tạo, hiển thị thông tin.
// b. Định nghĩa class NhanVien kế thừa từ Person, có thêm các thuộc tính: phòng ban, hệ
// số lương, thâm niên, lương cơ bản và các phương thức khởi tạo, tính lương thực lĩnh,
// hiển thị thông tin cá nhân
// Trong đó: lương thực lĩnh = Lương cơ bản * hệ số (1 + thâm niên/100)

public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;



    public Person() {
    }


    public Person(String hoTen, String ngaySinh, String diaChi, String gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
    }



    public String getHoTen() {
        return hoTen;
    }
    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }
    public String getNgaySinh() {
        return ngaySinh;
    }
    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    public String getGioiTinh() {
        return gioiTinh;
    }
    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }


    public void hienThi() {
        System.out.println("ho ten : " + this.hoTen);
        System.out.println("ngay sinh : " + this.ngaySinh);
        System.out.println("gioi tinh : " + this.gioiTinh);
        System.out.println("dia chi : " + this.diaChi);


    }

    
}
