package modelCamera;

import java.io.Serializable;
import java.util.Date;

public class Camera implements Serializable {

    private String masp;
    private String tensp;
    private Date ngaynhap;
    private Double gia;
    private Double soluong;
    private String loaipin;
    private String dophangiai;
    private Double Tongtien;

    public Camera() {
    }

    public Camera(String masp, String tensp, Date ngaynhap, Double gia, Double soluong, String loaipin, String dophangiai, Double Tongtien) {
        this.masp = masp;
        this.tensp = tensp;
        this.ngaynhap = ngaynhap;
        this.gia = gia;
        this.soluong = soluong;
        this.loaipin = loaipin;
        this.dophangiai = dophangiai;
        this.Tongtien = Tongtien;
    }

    public String getMasp() {
        return masp;
    }

    public void setMasp(String masp) {
        this.masp = masp;
    }

    public String getTensp() {
        return tensp;
    }

    public void setTensp(String tensp) {
        this.tensp = tensp;
    }

    public Date getNgaynhap() {
        return ngaynhap;
    }

    public void setNgaynhap(Date ngaynhap) {
        this.ngaynhap = ngaynhap;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Double getSoluong() {
        return soluong;
    }

    public void setSoluong(Double soluong) {
        this.soluong = soluong;
    }

    public String getLoaipin() {
        return loaipin;
    }

    public void setLoaipin(String loaipin) {
        this.loaipin = loaipin;
    }

    public String getDophangiai() {
        return dophangiai;
    }

    public void setDophangiai(String dophangiai) {
        this.dophangiai = dophangiai;
    }

    public Double getTongtien() {
        return getGia() * getSoluong();
    }

    public void setTongtien(Double Tongtien) {
        this.Tongtien = Tongtien;
    }

    @Override
    public String toString() {
        return "" + getTongtien() + "";
    }

}
