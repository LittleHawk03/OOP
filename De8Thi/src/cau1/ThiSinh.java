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
public class ThiSinh {
    private Scanner scanner = new Scanner(System.in);
    private String hoTen;
    private String ngaySinh;
    private String diaChi;

    public ThiSinh() {
    }

    public ThiSinh(String hoTen, String ngaySinh, String diaChi) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
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
    
    public void nhap(){
        System.out.println("nhap ten : ");
        hoTen = scanner.nextLine();
        System.out.println("nhap dia chi : ");
        diaChi = scanner.nextLine();
        System.out.println("nhap ngay sinh : ");
        ngaySinh = scanner.nextLine();    
    }
    
    public void hienThi(){
    
    }

    
    
    
    
}
