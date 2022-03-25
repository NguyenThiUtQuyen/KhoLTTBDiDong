package cntt61.q_57130380_listsong;

public class BaiHat {
    private String tenBaiHat;
    private String tenHinhAnh;
    private String tenCaSi;

    public BaiHat(String tenBaiHat, String tenHinhAnh, String tenCaSi) {
        this.tenBaiHat = tenBaiHat;
        this.tenHinhAnh = tenHinhAnh;
        this.tenCaSi = tenCaSi;
    }

    public String getTenBaiHat() {
        return tenBaiHat;
    }

    public void setTenBaiHat(String tenBaiHat) {
        this.tenBaiHat = tenBaiHat;
    }

    public String getTenHinhAnh() {
        return tenHinhAnh;
    }

    public void setTenHinhAnh(String tenHinhAnh) {
        this.tenHinhAnh = tenHinhAnh;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    @Override
    public String toString() {
        return   tenBaiHat + '\'' +
                 tenCaSi + '\'' ;
    }
}
