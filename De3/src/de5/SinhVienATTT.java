/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de5;

/**
 *
 * @author honahl
 */
public class SinhVienATTT extends SinhVien{
    private int hocPhil;

    public SinhVienATTT() {
    }

    public SinhVienATTT(int hocPhil, String maSv, String hoTen, String gioiTinh, float diemTB) {
        super(maSv, hoTen, gioiTinh, diemTB);
        this.hocPhil = hocPhil;
    }

    
    

    public int getHocPhil() {
        return hocPhil;
    }

    public void setHocPhil(int hocPhil) {
        this.hocPhil = hocPhil;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("hoc phi" + hocPhil);// Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    
    
    
}
