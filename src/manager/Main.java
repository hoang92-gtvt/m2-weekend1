package manager;

import nhanVien.NhanVien;
import nhanVien.NhanVienFull;
import nhanVien.NhanVienPart;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    //Khởi tạo dữ liệu nhân viên
        NhanVien nv1 = new NhanVienFull("M001", "Nguyễn Văn Hoàng", 29, 9601223, "@gmail.com", 15000000, 20000000, 10000);
        NhanVien nv2 = new NhanVienFull("M002", "Bùi Hải Yến", 28, 340058, "yenxinh@gmail.com", 10000000, 20000000, 10000);
        NhanVien nv3 = new NhanVienPart("P001", "Nguyễn Văn B", 40, 12345, "123@gmail.com,", 20);

    // Khởi tạo mảng để lưu trữ nhân viên qua lớp Manager;
//        Manager manager1 = new Manager(); // khỏi tạo một OPP manager ko thuộc tính
//        NhanVien[] arrNhanvien = new NhanVien[0];// tạo thuộc tính mảng nhân viên ban đầu
//        manager1.setArrNhanVien(arrNhanvien);
    //thêm các nhân viên bằng phương thức trong OPP
//        manager1.addNhanvien(nv1);
//        manager1.addNhanvien(nv2);
//        manager1.addNhanvien(nv3);
//        manager1.show();
    // kiểm tra các kết quả các phương thức
//        double k = manager1.getSumMoney();
//        System.out.println(k);

    //* Phần 2: Xây dựng quản lý bằng ArrayList.
        //Khơi tạo ArrayList
        ArrayList<NhanVien> listNhanVien = new ArrayList<>();
        listNhanVien.add(nv1);
        listNhanVien.add(nv2);

    //*Phần 3: Xây dựng bằng một đôi tượng manager từ lớp Director
        Director director1 = new Director();
        director1.addNhanvien(nv1);
        director1.addNhanvien(nv2);
        director1.addNhanvien(nv3);

        director1.showListNhanVien();
        System.out.println("--------------");
//        director1.showListNhanVienFull();
//        System.out.println("--------------");
//        director1.showListNhanVienPart();
//        System.out.println("--------------");

//        double sumMoney = director1.getSumMoney();
//        System.out.println(nv1.getMoney());
//        System.out.println(sumMoney);
        director1.sortListNhanVien();
        System.out.println("Danh sach nhân viên sau khi sort");
        director1.showListNhanVien();

        System.out.println("--------------------------------------");
        String name1 = director1.listNhanVien.get(2).getFullName();
        String name2 = director1.getNhanVienByName().getFullName();
        System.out.println(name1);
        System.out.println(name2);
    }
}


