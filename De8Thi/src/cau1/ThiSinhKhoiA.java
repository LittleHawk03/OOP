/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau1;

import java.util.Scanner;

/**
 *
 * @author honahl
 */
public class ThiSinhKhoiA extends ThiSinh{
    private Scanner scanner = new Scanner(System.in);
    private float diemToan;
    private float diemLy;
    private float diemHoa;

    public ThiSinhKhoiA() {
    }

    public ThiSinhKhoiA(float diemToan, float diemLy, float diemHoa, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
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
    public void hienThi() {
        System.out.println(", hoTen=" + this.getHoTen() + ", ngaySinh=" + this.getNgaySinh() + ", diaChi=" 
                + this.getDiaChi() +"diemToan=" + diemToan + ", diemLy=" + diemLy + ", diemHoa=" + diemHoa);
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap diem toan");
        diemToan = scanner.nextFloat();
        System.out.println("nhap diem ly");
        diemLy = scanner.nextFloat();
        System.out.println("nhap diem hoa");
        diemHoa = scanner.nextFloat();
    }
    
    
    
    
    
}
