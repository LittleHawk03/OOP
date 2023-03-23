/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de7;

import java.util.Scanner;

/**
 *
 * @author honahl
 */
public class ThiSinh {
    private Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private String diaChi;
    private String ngaySinh;


    public ThiSinh() {
    }


    public ThiSinh(String hoTen, String diaChi, String ngaySinh) {
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }


    public String getHoTen() {
        return hoTen;
    }


    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }


    public String getDiaChi() {
        return diaChi;
    }


    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }


    public String getNgaySinh() {
        return ngaySinh;
    }


    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public float getDiemTong() {
        return 0;
    }

    public void nhap() {
        System.out.println("nhap ho va ten : ");
        hoTen = scanner.nextLine();
        System.out.println("nhap ngay sinh : ");
        ngaySinh = scanner.nextLine();
        System.out.println("nhap dia chi : ");
        diaChi = scanner.nextLine();
    }
    
    public void hienThi() {
        System.out.print("hoTen : " + hoTen + ", diaChi : " + diaChi + ", ngaySinh : " + ngaySinh);
    }


    


    

    

}
