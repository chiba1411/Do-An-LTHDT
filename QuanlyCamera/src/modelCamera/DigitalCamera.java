package modelCamera;

import java.util.Date;

public class DigitalCamera extends Camera {

    private String dungluongbonhotrong;
    private String loaicambien;

    public DigitalCamera() {
    }

    public DigitalCamera(String dungluongbonhotrong, String loaicambien) {
        this.dungluongbonhotrong = dungluongbonhotrong;
        this.loaicambien = loaicambien;
    }

    public DigitalCamera(String dungluongbonhotrong, String loaicambien, String masp, String tensp, Date ngaynhap, Double gia, Double soluong, String loaipin, String dophangiai, Double Tongtien) {
        super(masp, tensp, ngaynhap, gia, soluong, loaipin, dophangiai, Tongtien);
        this.dungluongbonhotrong = dungluongbonhotrong;
        this.loaicambien = loaicambien;
    }

    public String getDungluongbonhotrong() {
        return dungluongbonhotrong;
    }

    public void setDungluongbonhotrong(String dungluongbonhotrong) {
        this.dungluongbonhotrong = dungluongbonhotrong;
    }

    public String getLoaicambien() {
        return loaicambien;
    }

    public void setLoaicambien(String loaicambien) {
        this.loaicambien = loaicambien;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
