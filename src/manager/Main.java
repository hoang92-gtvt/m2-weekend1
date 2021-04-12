package manager;

import nhanVien.NhanVien;
import nhanVien.NhanVienFull;
import nhanVien.NhanVienPart;

public class Main {
    public static void main(String[] args) {


        NhanVien[] arrNhanvien = new NhanVien [1];
        arrNhanvien[0] = new NhanVienFull("M000","Nguyễn Văn A", 29, 9601223, "@gmail.com",10000000,5000000, 100000 );


        Manager manager1 = new Manager();
        manager1.setArrNhanVien(arrNhanvien);

        NhanVien nv1= new NhanVienFull("M001","Nguyễn Văn Hoàng", 29, 9601223, "@gmail.com", 15000000,20000000, 10000 );
        NhanVien nv2= new NhanVienFull("M002","Bùi Hải Yến", 28, 340058, "yenxinh@gmail.com", 10000000,20000000, 10000 );

        NhanVien nv3= new NhanVienPart("P001", "Nguyễn Văn B", 40, 12345, "123@gmail.com,", 20);

        manager1.addNhanvien(nv1);
        manager1.addNhanvien(nv2);
        manager1.addNhanvien(nv3);


        double k = manager1.getSumMoney();
        System.out.println(k);
        String [] name = manager1.getNameNhanvien();
        System.out.println(name[0]);

    }
}


