package sifu.arch.entity;

public class Employee {

    private int ma;
    private String hoTen;
    private int ngaySinh;
    private double luong;

    public Employee(int ma, String hoTen, int ngaySinh, double luong) {
        this.ma = ma;
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.luong = luong;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "ma=" + ma +
                ", hoTen='" + hoTen + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", luong=" + luong +
                '}';
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(int ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
}
