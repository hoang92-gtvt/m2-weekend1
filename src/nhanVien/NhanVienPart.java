package nhanVien;

public class NhanVienPart extends NhanVien {
    double workTime ;

    public NhanVienPart(String maNV, String fullName, int age, long phone, String email,double workTime ) {
        super(maNV, fullName, age, phone, email);
        this.workTime = workTime;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }
    public double getMoney(){

        return this.getWorkTime()*100000;
    }

}
