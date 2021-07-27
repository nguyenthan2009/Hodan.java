import java.time.LocalDate;
import java.util.Date;

public class Nguoi {
    private String name;
    private LocalDate ngaySinh;
    private String Nghenghiep;
    public Nguoi(){

    }

    public Nguoi(String name, LocalDate ngaySinh, String nghenghiep) {
        this.name = name;
        this.ngaySinh = ngaySinh;
        Nghenghiep = nghenghiep;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(LocalDate ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getNghenghiep() {
        return Nghenghiep;
    }

    public void setNghenghiep(String nghenghiep) {
        Nghenghiep = nghenghiep;
    }
    public int getYear(){
        return ngaySinh.getYear();
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "name='" + name + '\'' +
                ", ngaySinh=" + ngaySinh +
                ", Nghenghiep='" + Nghenghiep + '\'' +
                '}';
    }
}
