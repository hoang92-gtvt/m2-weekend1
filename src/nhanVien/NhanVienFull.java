package nhanVien;

public class NhanVienFull extends NhanVien {
    double gossMoney ;
    double bonusMoney;
    double  failMoney;

    public NhanVienFull() {

    }

    public NhanVienFull(String maNV, String fullName, int age, long phone, String email,double gossMoney,
                        double bonusMoney,double  failMoney ) {
        super(maNV, fullName, age, phone, email);
        this.gossMoney= gossMoney;
        this.bonusMoney= bonusMoney;
        this.failMoney = failMoney;
    }



    public double getGossMoney() {
        return gossMoney;
    }

    public void setGossMoney(double gossMoney) {
        this.gossMoney = gossMoney;
    }

    public double getBonusMoney() {
        return bonusMoney;
    }

    public void setBonusMoney(double bonusMoney) {
        this.bonusMoney = bonusMoney;
    }

    public double getFailMoney() {
        return failMoney;
    }

    public void setFailMoney(double failMoney) {
        this.failMoney = failMoney;
    }

    public double getMoney(){
        return this.getGossMoney()+ this.getBonusMoney() -this.getFailMoney();
    }

    @Override
    public String toString() {
        return  super.toString()+
                "NhanVienFull{" +
                "gossMoney=" + gossMoney +
                ", bonusMoney=" + bonusMoney +
                ", failMoney=" + failMoney +
                '}';
    }
}
