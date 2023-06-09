/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1;

/**
 *
 * @author honahl
 */
public class Student extends Person{
    private String maSV;
    private String email;
    private Float diemTK;

    public Student() {
    }
    
    

    public Student(String maSV, String email, Float diemTK, String HoTen, String ngaySinh, String diaChi, String GioiTinh) {
        super(HoTen, ngaySinh, diaChi, GioiTinh);
        this.maSV = maSV;
        this.email = email;
        this.diemTK = diemTK;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Float getDiemTK() {
        return diemTK;
    }

    public void setDiemTK(Float diemTK) {
        this.diemTK = diemTK;
    }
    
    

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("Ma sinh vien : " + this.maSV);
        System.out.println("email        : " + this.email);
        System.out.println("diem Tong Ket : " + this.diemTK);

    }

}
