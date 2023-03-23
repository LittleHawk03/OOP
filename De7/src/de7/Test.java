package de7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int t ;
        String option;
        List<ThiSinh> listTS = new ArrayList<>();
        System.out.println("1 : them sinh vien moi");
        System.out.println("2 : in ra cac sinh vien dat tuyen (diem tong > 20)");
        System.out.println("3 : ket thuc chuong trinh");
        while (true) {
            System.out.println("nhap lua chon : ");
            t = scanner.nextInt();
            switch (t) {
                case 1:
                    scanner.nextLine();
                    System.out.println("nhap 'A' neu la thi sinh khoi A va nhap 'C' neu la thi sinh khoi C");
                    option = scanner.nextLine();
                    if (option.equals("A")) {
                        System.out.println("-------------------------------------------------------------------");
                        ThiSinhKhoiA thiSinhA = new ThiSinhKhoiA();
                        thiSinhA.nhap();
                        listTS.add(thiSinhA);
                    }else if (option.equals("C")) {
                        System.out.println("-------------------------------------------------------------------");
                        ThiSinhKhoiB thiSinhB = new ThiSinhKhoiB();
                        thiSinhB.nhap();
                        listTS.add(thiSinhB);
                    }else{
                        System.out.println("khong co lua chon nao thoa man");
                    }
                    break;
            
                case 2:
                    System.out.println("------------------DANH SACH SINH VIEN TRUNG TUYEN----------------------------");
                    for (ThiSinh thiSinh : listTS) {
                        if (thiSinh.getDiemTong() > 20) {
                            thiSinh.hienThi();
                        }
                    }
                    break;
            }

            if (t == 3) {
                break;
            }
        }
    }
    
}
