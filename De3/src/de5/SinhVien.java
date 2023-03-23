/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

/**
 *
 * @author honahl
 */
public  class SinhVien {
    protected String maSv;
    protected String hoTen;
    protected String gioiTinh;
    protected float diemTB;

    public SinhVien() {
    }

    public SinhVien(String maSv, String hoTen, String gioiTinh, float diemTB) {
        this.maSv = maSv;
        this.hoTen = hoTen;
        this.gioiTinh = gioiTinh;
        this.diemTB = diemTB;
    }
    
    public void hienThi(){
        System.out.println("ma sinh vien : " + maSv);
        System.out.println("ho va ten : " + hoTen);
        System.out.println("gioi tinh : " + gioiTinh);
        System.out.println("diem trung binh : " + diemTB);

    
    }
    
}
