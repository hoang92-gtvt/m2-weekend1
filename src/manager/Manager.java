package manager;
import nhanVien.*;

public class Manager {

    private  NhanVien[] arrNhanVien ;

// khỏi tạo không tham số
    public Manager() {

    }
// getter setter
    public NhanVien[] getArrNhanVien() {
        return arrNhanVien;
    }
    public void setArrNhanVien(NhanVien[] arrNhanVien) {
        this.arrNhanVien = arrNhanVien;
    }
    public void show(){
        for (int i = 0; i < this.arrNhanVien.length ; i++) {
            System.out.println(arrNhanVien[i]);
        }
    }

    public NhanVien[] addNhanvien(NhanVien newNhanvien){
        NhanVien[] arr = new NhanVien[this.getArrNhanVien().length +1];
        for (int i = 0; i <arr.length-1 ; i++) {
            arr[i]= this.getArrNhanVien()[i];

        }
        arr[arr.length-1]= newNhanvien;
        this.setArrNhanVien(arr);
        return arr;

    }

    public NhanVienFull[] getNhanvienFull(){
        NhanVienFull[] arr = new NhanVienFull[this.getArrNhanVien().length];
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if(this.getArrNhanVien()[i] instanceof NhanVienFull) {
                arr[count] = (NhanVienFull) this.getArrNhanVien()[i];
                count++;
            }
        }
        return arr;

    }
    public NhanVien[] getNhanvienPart(){
        NhanVien[] arr = new NhanVien[this.getArrNhanVien().length];
        int count =0;
        for (int i = 0; i <arr.length ; i++) {
            if(this.getArrNhanVien()[i] instanceof NhanVienPart) {
                arr[count] = this.getArrNhanVien()[i];
                count++;
            }
        }
        return arr;

    }

    public String [] getNameNhanvien(){
        String[] arrname =new String[this.getNhanvienFull().length];

        int index=0;
        double sum=0;
        NhanVien a ;
        for (int i = 0; i <arrname.length ; i++) {
            if (this.getNhanvienFull()[i]!=null){
                a=this.getNhanvienFull()[i];
                sum+= a.getMoney();
            }else{
                index=i;
                break;
            }
        }
        double avenger = sum/index;

        int count=0;
        for (int i = 0; i <index ; i++) {
            a=this.getNhanvienFull()[i];
            if( a.getMoney() < avenger){
                arrname[count]=a.getFullName();
            }
        }
        return arrname;
    }

    public double getSumMoney(){
        double sum=0;
        NhanVien a ;
        for (int i = 0; i <this.getNhanvienPart().length ; i++) {
            if (this.getNhanvienPart()[i]!=null){
                a=this.getNhanvienPart()[i];
                sum += ((NhanVienPart)a).getMoney();
            }else{

                break;
            }
        }
        return sum;
    }

}
