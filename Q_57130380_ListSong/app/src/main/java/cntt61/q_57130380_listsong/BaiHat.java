package cntt61.q_57130380_listsong;

public class BaiHat {
    String tenBaiHat;
    String tenCaSi;
    Integer tenHinhAnh;

    public BaiHat(String tenBaiHat, String tenCaSi, Integer tenHinhAnh) {
        this.tenBaiHat = tenBaiHat;
        this.tenCaSi = tenCaSi;
        this.tenHinhAnh = tenHinhAnh;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public Integer getTenHinhAnh() {
        return tenHinhAnh;
    }

    public void setTenHinhAnh(Integer tenHinhAnh) {
        this.tenHinhAnh = tenHinhAnh;
    }
}
