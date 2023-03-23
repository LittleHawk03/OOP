/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package de1_2;

/**
 *
 * @author honahl
 */
public class HangHoa {
    private int maHang;
    private String ten;
    private int giaBan;

    public HangHoa() {
    }

    public HangHoa(int maHang, String ten, int giaBan) {
        this.maHang = maHang;
        this.ten = ten;
        this.giaBan = giaBan;
    }

    public int getMaHang() {
        return maHang;
    }

    public void setMaHang(int maHang) {
        this.maHang = maHang;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getGiaBan() {
        return giaBan;
    }

    public void setGiaBan(int giaBan) {
        this.giaBan = giaBan;
    }
    
    public void hienThi(){
        System.out.println("ma hang : " + maHang);
        System.out.println("ho va ten : " + ten);
        System.out.println("gia ban : " + giaBan);
    }
    
    
}
