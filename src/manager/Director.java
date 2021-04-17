package manager;

import nhanVien.NhanVien;
import nhanVien.NhanVienFull;
import nhanVien.NhanVienPart;

import java.util.*;

public class Director {
    List<NhanVien> listNhanVien = new ArrayList<>();

    public Director() {
    }

    public void showListNhanVien(){
        for (NhanVien nv: listNhanVien) {
            System.out.println(nv);
        }
    }

    public ArrayList<NhanVien> getListNhanVienFull() {
        ArrayList<NhanVien> listNhanVienFull = new ArrayList<>();
        for (NhanVien nv : listNhanVien) {
            if (nv instanceof NhanVienFull) {
                listNhanVienFull.add(nv);
            }

        }
        return listNhanVienFull;
    }

    public ArrayList<NhanVien> getListNhanVienPart() {
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
        for (NhanVien nv: getListNhanVienFull()) {
            System.out.println(nv);
        }
    }
    public void showListNhanVienPart(){
        for (NhanVien nv: getListNhanVienPart()) {
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
        for (NhanVien nv:getListNhanVienFull()) {
            if(nv.getMoney()<getAverageOfMoney()){
                listOfSmallSalary.add(nv);
                System.out.println(nv);
            }

        }

        return listOfSmallSalary;
    }

    public void sortListNhanVien(){
        Collections.sort(listNhanVien, new Comparator<NhanVien>() {
            @Override
            public int compare(NhanVien o1, NhanVien o2) {
                if(o1.getFullName().compareToIgnoreCase(o2.getFullName())>0){
                    return 1;
                }else if (o1.getFullName().compareToIgnoreCase(o2.getFullName())<0){
                    return -1;
                } else {
                    if(o1.getAge()-o2.getAge()>0){
                        return 1;
                    }
                    if(o1.getAge()-o2.getAge()<0){
                        return -1;
                    }else return 0;
                }
            }
        });
    }

    public NhanVien getNhanVienByName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập tên nhân viên cần tìm");
        String name1 = input.nextLine();
        int index = 0;
        for (int i = 0; i <listNhanVien.size() ; i++) {
            String name2= listNhanVien.get(i).getFullName();
            if(name2.compareToIgnoreCase(name1)==0){
                index= i;
                break;
            }
        }
        return listNhanVien.get(index);

    }

}
