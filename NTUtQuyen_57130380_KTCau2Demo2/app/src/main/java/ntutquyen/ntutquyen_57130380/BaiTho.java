package ntutquyen.ntutquyen_57130380;

public class BaiTho {
    String tenBaiTho;
    String tenTacGia;
    String file_loi;

    public BaiTho(String tenBaiTho, String tenTacGia, String file_loi) {
        this.tenBaiTho = tenBaiTho;
        this.tenTacGia = tenTacGia;
        this.file_loi = file_loi;
    }

    public String getTenBaiTho() {
        return tenBaiTho;
    }

    public void setTenBaiTho(String tenBaiTho) {
        this.tenBaiTho = tenBaiTho;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public String getFile_loi() {
        return file_loi;
    }

    public void setFile_loi(String file_loi) {
        this.file_loi = file_loi;
    }
}
