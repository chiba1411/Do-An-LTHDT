package modelCamera;

import java.util.Date;

public class InstantCamera extends Camera {

    private String loaiflim;
    private String kichthuocanhin;

    public InstantCamera() {
    }

    public InstantCamera(String loaiflim, String kichthuocanhin) {
        this.loaiflim = loaiflim;
        this.kichthuocanhin = kichthuocanhin;
    }

    public InstantCamera(String loaiflim, String kichthuocanhin, String masp, String tensp, Date ngaynhap, Double gia, Double soluong, String loaipin, String dophangiai, Double Tongtien) {
        super(masp, tensp, ngaynhap, gia, soluong, loaipin, dophangiai, Tongtien);
        this.loaiflim = loaiflim;
        this.kichthuocanhin = kichthuocanhin;
    }

    public String getLoaiflim() {
        return loaiflim;
    }

    public void setLoaiflim(String loaiflim) {
        this.loaiflim = loaiflim;
    }

    public String getKichthuocanhin() {
        return kichthuocanhin;
    }

    public void setKichthuocanhin(String kichthuocanhin) {
        this.kichthuocanhin = kichthuocanhin;
    }

    @Override
    public String toString() {
        return super.toString();
    }

}
