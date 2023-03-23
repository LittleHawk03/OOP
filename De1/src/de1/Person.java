/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author honahl
 */
public class Person {
    private String HoTen;
    private String ngaySinh;
    private String diaChi;
    private String gioiTinh;

    public Person() {
    }
    
    

    public Person(String HoTen, String ngaySinh, String diaChi, String GioiTinh) {
        this.HoTen = HoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = GioiTinh;
    }
    
    
    public String getHoTen() {
        return HoTen;
    }


    public void setHoTen(String hoTen) {
        HoTen = hoTen;
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
        System.out.println("ho va ten : " + this.HoTen);
        System.out.println("Ngay sinh : " + this.ngaySinh);
        System.out.println("Dia Chi   : " + this.diaChi);
        System.out.println("Gioi Tinh : " + this.gioiTinh);           
    }
}
