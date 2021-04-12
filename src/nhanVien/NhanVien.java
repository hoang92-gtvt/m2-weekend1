package nhanVien;

public  abstract class NhanVien {
    private String maNV;
    private String fullName;
    private int age;
    private long phone;
    private String email;

    public NhanVien(String maNV, String fullName, int age, long phone, String email) {
        this.maNV = maNV;
        this.fullName = fullName;
        this.age = age;
        this.email = email;
        this.phone = phone;

    }
    public NhanVien(){}

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) {
        this.maNV = maNV;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public abstract double getMoney();

    @Override
    public String toString() {
        return "NhanVien{" +
                "maNV='" + maNV + '\'' +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", phone=" + phone +
                ", email='" + email + '\'' +
                '}';
    }
}
