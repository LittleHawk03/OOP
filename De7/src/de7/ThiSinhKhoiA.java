package de7;

import java.util.Scanner;

public class ThiSinhKhoiA extends ThiSinh{
    private Scanner scanner = new Scanner(System.in);
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    
   
    public ThiSinhKhoiA() {
    }



    public ThiSinhKhoiA(String hoTen, String diaChi, String ngaySinh, float diemToan, float diemLy, float diemHoa) {
        super(hoTen, diaChi, ngaySinh);
        this.diemToan = diemToan;
        this.diemLy = diemLy;
        this.diemHoa = diemHoa;
    }



    public float getDiemToan() {
        return diemToan;
    }



    public void setDiemToan(float diemToan) {
        this.diemToan = diemToan;
    }



    public float getDiemLy() {
        return diemLy;
    }



    public void setDiemLy(float diemLy) {
        this.diemLy = diemLy;
    }



    public float getDiemHoa() {
        return diemHoa;
    }



    public void setDiemHoa(float diemHoa) {
        this.diemHoa = diemHoa;
    }

    

    

    @Override
    public float getDiemTong() {
       
        return diemHoa+ diemLy + diemToan;
    }



    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap diem Toan  : ");
        diemToan = scanner.nextFloat();
        System.out.println("nhap diem Ly : ");
        diemLy = scanner.nextFloat();
        System.out.println("nhap diem Hoa : ");
        diemHoa = scanner.nextFloat();
    }



    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println(", diem toan : " + diemToan + ", diem ly   : " + diemLy + ", diem Hoa  : " + diemHoa + ",diem tong : "  + (diemHoa + diemLy + diemToan));
    }
    

    
    
}
