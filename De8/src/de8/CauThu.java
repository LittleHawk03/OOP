package de8;

public class CauThu {
    
    private int id;
    private String hovaten;
    private int namSinh;
    private String viTri;

    public CauThu() {
    }

    public CauThu(int id, String hovaten, int namSinh, String viTri) {
        this.id = id;
        this.hovaten = hovaten;
        this.namSinh = namSinh;
        this.viTri = viTri;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHovaten() {
        return hovaten;
    }

    public void setHovaten(String hovaten) {
        this.hovaten = hovaten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    
    

    
}
