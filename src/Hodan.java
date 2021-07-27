import java.time.LocalDate;
import java.util.Arrays;

public class Hodan extends Nguoi {
    private int SoThanhVien;
    private int SoNha;
    private Nguoi Thanhvien[] = new Nguoi[10];
    public Hodan(){

    }
    public Hodan(int soThanhVien, int soNha, Nguoi[] thanhvien) {
        SoThanhVien = soThanhVien;
        SoNha = soNha;
        Thanhvien = thanhvien;
    }

    public int getSoThanhVien() {
        return SoThanhVien;
    }

    public void setSoThanhVien(int soThanhVien) {
        SoThanhVien = soThanhVien;
    }

    public int getSoNha() {
        return SoNha;
    }

    public void setSoNha(int soNha) {
        SoNha = soNha;
    }

    public Nguoi[] getThanhvien() {
        return Thanhvien;
    }

    public void setThanhvien(Nguoi[] thanhvien) {
        Thanhvien = thanhvien;
    }

    @Override
    public String toString() {
        return "Hodan{" +
                "SoThanhVien=" + SoThanhVien +
                ", SoNha=" + SoNha +
                ", Thanhvien=" + Arrays.toString(Thanhvien) +
                "} " + super.toString();
    }
}
