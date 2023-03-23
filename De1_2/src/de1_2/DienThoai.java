/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1_2;

/**
 *
 * @author honahl
 */
public class DienThoai extends HangHoa{
    private String nhaSanXuat;
    private int dungLuong;
    private String mauSac;

    public DienThoai() {
    }

    public DienThoai(String nhaSanXuat, int dungLuong, String mauSac, int maHang, String ten, int giaBan) {
        super(maHang, ten, giaBan);
        this.nhaSanXuat = nhaSanXuat;
        this.dungLuong = dungLuong;
        this.mauSac = mauSac;
    }

    public String getNhaSanXuat() {
        return nhaSanXuat;
    }

    public void setNhaSanXuat(String nhaSanXuat) {
        this.nhaSanXuat = nhaSanXuat;
    }

    public int getDungLuong() {
        return dungLuong;
    }

    public void setDungLuong(int dungLuong) {
        this.dungLuong = dungLuong;
    }

    public String getMauSac() {
        return mauSac;
    }

    public void setMauSac(String mauSac) {
        this.mauSac = mauSac;
    }

    @Override
    public void hienThi() {
        super.hienThi();
        System.out.println("nha san xuat : " + nhaSanXuat);
        System.out.println("dung luong : " + dungLuong);
        System.out.println("mau sac : " + mauSac);
    }
    
    
    
}
