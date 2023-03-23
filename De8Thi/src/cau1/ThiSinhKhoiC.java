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
public class ThiSinhKhoiC extends ThiSinh{
    private Scanner scanner = new Scanner(System.in);
    private float diemVan;
    private float diemSu;
    private float diemDia;

    public ThiSinhKhoiC() {
    }

    public ThiSinhKhoiC(float diemVan, float diemSu, float diemDia, String hoTen, String ngaySinh, String diaChi) {
        super(hoTen, ngaySinh, diaChi);
        this.diemVan = diemVan;
        this.diemSu = diemSu;
        this.diemDia = diemDia;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
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
    public void hienThi() {
        System.out.println(", hoTen=" + this.getHoTen() + ", ngaySinh=" + this.getNgaySinh() + ", diaChi=" 
                + this.getDiaChi() +"diemVan=" + diemVan + ", diemSu=" + diemSu + ", diemDia=" + diemDia);
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("nhap diem van");
        diemVan = scanner.nextFloat();
        System.out.println("nhap diem su");
        diemSu = scanner.nextFloat();
        System.out.println("nhap diem dia");
        diemDia = scanner.nextFloat();
    }
    

}
