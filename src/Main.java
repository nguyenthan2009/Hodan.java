import java.time.LocalDate;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Manager manager = new Manager();
        int number =1;
        while (number !=0){
            System.out.println("Mời chọn");
            System.out.println("Ấn 1 để nhập thông tin các hộ gia đình");
            System.out.println("ẤN 2 để xem thông tin hộ dân");
            System.out.println("Ấn 3 để xem thông tin các hộ có người mừng thọ tuổi 80");
            int numbers = sc.nextInt();
            switch (numbers){
                case 1:
                    System.out.println("Nhập số thành viên");
                    int Sothanhvien = sc.nextInt();
                    System.out.println("Nhập số nhà");
                    int SoNha = sc.nextInt();
                    Nguoi [] Thanhvien = new Nguoi[Sothanhvien];
                    for(int i=0;i<Thanhvien.length;i++){
                        System.out.println("Nhập tên thành viên thứ " +i);
                        sc.nextLine();
                        String Name = sc.nextLine();
                        System.out.println("Nhâp ngày sinh thành viên thứ" +i);
                        LocalDate localDate = LocalDate.of(sc.nextInt(),sc.nextInt(),sc.nextInt());
                        System.out.println("Nhập nghề nghiệp thành viên thứ" +i);
                        sc.nextLine();
                        String Nghenghiep = sc.nextLine();
                        Thanhvien[i] = new Nguoi(Name,localDate,Nghenghiep);
                    }
                    Hodan hodan = new Hodan(Sothanhvien,SoNha,Thanhvien);
                    manager.addHodan(hodan);
                    break;
                case 2:
                    System.out.println("Mời số nhà bạn muốn xem thông tin");
                    int num = sc.nextInt();
                    manager.HienThongtin(num);
                    break;
                case 3:
                    System.out.println("Nhập năm nay để xem hô dân nào có người mừng thọ");
                    if(manager.mungTho(2021)){
                         manager.HienThongtin(manager.getSoNha());
                    }

                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("No choice");
                    break;
            }
        }
    }
}
