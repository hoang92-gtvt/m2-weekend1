package manager;

import nhanVien.NhanVien;
import nhanVien.NhanVienFull;
import nhanVien.NhanVienPart;

import java.util.ArrayList;
import java.util.List;

public class Director {
    List<NhanVien> listNhanVien = new ArrayList<>();

    public Director() {
    }

    public void showListNhanVien(){
        for (NhanVien nv: listNhanVien) {
            System.out.println(nv);
        }
    }

    public ArrayList<NhanVien> getNhanVienFull() {
        ArrayList<NhanVien> listNhanVienFull = new ArrayList<>();
        for (NhanVien nv : listNhanVien) {
            if (nv instanceof NhanVienFull) {
                listNhanVienFull.add(nv);
            }

        }
        return listNhanVienFull;
    }

    public ArrayList<NhanVien> getNhanVienPart() {
        ArrayList<NhanVien> listNhanVienPart = new ArrayList<>();
        for (NhanVien nv : listNhanVien) {
            if (nv instanceof NhanVienPart) {
                listNhanVienPart.add(nv);
            }

        }
        return listNhanVienPart;
    }

    public void addNhanvien(NhanVien nv) {
        listNhanVien.add(nv);
    }

    public void addNhanvien(int index, NhanVien nv) {
        listNhanVien.add(index, nv);
    }
    public void showListNhanVienFull(){
        for (NhanVien nv: getNhanVienFull()) {
            System.out.println(nv);
        }
    }
    public void showListNhanVienPart(){
        for (NhanVien nv: getNhanVienPart()) {
            System.out.println(nv);
        }
    }

    public double getSumMoney() {
        double sum = 0;
        for (NhanVien nv : listNhanVien) {
            sum += nv.getMoney();
        }
        return sum;
    }
    private double getAverageOfMoney(){
        return this.getSumMoney()/listNhanVien.size();
    }

    public ArrayList<NhanVien> getListOfSmallSalary(){
        ArrayList<NhanVien> listOfSmallSalary = new ArrayList<>();
        for (NhanVien nv:getNhanVienFull()) {
            if(nv.getMoney()<getAverageOfMoney()){
                listOfSmallSalary.add(nv);
                System.out.println(nv);
            }

        }

        return listOfSmallSalary;
    }

}
