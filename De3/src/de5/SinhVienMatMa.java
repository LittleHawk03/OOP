/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

/**
 *
 * @author honahl
 */
public class SinhVienMatMa extends SinhVien{
    private String donVi;
    private int luong;

    public SinhVienMatMa() {
    }

    public SinhVienMatMa(String donVi, int luong, String maSv, String hoTen, String gioiTinh, float diemTB) {
        super(maSv, hoTen, gioiTinh, diemTB);
        this.donVi = donVi;
        this.luong = luong;
    }
    
    
    

    public String getDonVi() {
        return donVi;
    }

    public void setDonVi(String donVi) {
        this.donVi = donVi;
    }

    public int getLuong() {
        return luong;
    }

    public void setLuong(int luong) {
        this.luong = luong;
    }

    @Override
    public void hienThi() {
       super.hienThi();
        System.out.println("don vi :" +  donVi);
        System.out.println("luong : " + luong);
    }
    
    
}
