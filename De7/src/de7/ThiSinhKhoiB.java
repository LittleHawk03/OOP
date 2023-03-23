package de7;

import java.util.Scanner;

public class ThiSinhKhoiB extends ThiSinh{
    private Scanner scanner = new Scanner(System.in);
    private float diemVan;
    private float diemSu;
    private float diemDia;

    

    public ThiSinhKhoiB() {
    }


    public ThiSinhKhoiB(String hoTen, String diaChi, String ngaySinh, float diemVan, float diemSu, float diemDia) {
        super(hoTen, diaChi, ngaySinh);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }


    public float getDiemVan() {
        return diemVan;
    }


    public void setDiemVan(float diemVan) {
        this.diemVan = diemVan;
    }


    public float getDiemSu() {
        return diemSu;
    }


    public void setDiemSu(float diemSu) {
        this.diemSu = diemSu;
    }


    public float getDiemDia() {
        return diemDia;
    }


    public void setDiemDia(float diemDia) {
        this.diemDia = diemDia;
    }


    

    

    @Override
    public float getDiemTong() {        
        return diemVan + diemSu + diemDia;
    }


    @Override
    public void nhap() {
        
        super.nhap();
        System.out.println("nhap diem Van  : ");
        diemVan = scanner.nextFloat();
        System.out.println("nhap diem Su : ");
        diemSu = scanner.nextFloat();
        System.out.println("nhap diem Dia : ");
        diemDia = scanner.nextFloat();
    }


   


    @Override
    public void hienThi() {
        // TODO Auto-generated method stub
        super.hienThi();
        System.out.println(", diem Van : " + diemVan + ", diem Su  : " + diemSu + ", diem Dia : " + diemDia + ", diem Tong" + (diemDia+ diemSu +diemVan));
    }

    
    
}
