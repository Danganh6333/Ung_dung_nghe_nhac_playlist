package cuonghtph34430.poly.ung_dung_nghe_nhac_playlist.Model;

public class LichSu {
    public int IdLichSu;
    public int IdBaiHat;
    public int IdCaSi;
    public String ThoiGianNghe;

    public LichSu() {
    }

    public LichSu(int idLichSu, int idBaiHat, int idCaSi, String thoiGianNghe) {
        IdLichSu = idLichSu;
        IdBaiHat = idBaiHat;
        IdCaSi = idCaSi;
        ThoiGianNghe = thoiGianNghe;
    }

    public int getIdLichSu() {
        return IdLichSu;
    }

    public void setIdLichSu(int idLichSu) {
        IdLichSu = idLichSu;
    }

    public int getIdBaiHat() {
        return IdBaiHat;
    }

    public void setIdBaiHat(int idBaiHat) {
        IdBaiHat = idBaiHat;
    }

    public int getIdCaSi() {
        return IdCaSi;
    }

    public void setIdCaSi(int idCaSi) {
        IdCaSi = idCaSi;
    }

    public String getThoiGianNghe() {
        return ThoiGianNghe;
    }

    public void setThoiGianNghe(String thoiGianNghe) {
        ThoiGianNghe = thoiGianNghe;
    }
}
