import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Manager extends Hodan {
    List<Hodan> ListHodan = new ArrayList<>();

    public void addHodan(Hodan hodan) {
        ListHodan.add(hodan);
    }

    public void HienThongtin(int SoNha) {
        for (int i = 0; i < ListHodan.size(); i++) {
            if (ListHodan.get(i).getSoNha() == SoNha) {
                System.out.println(ListHodan.get(i).toString());
            }
        }
    }

    public void mungTho() {
            for (int i = 0; i <ListHodan.size(); i++) {
               for(int j=0;j<ListHodan.get(i).getSoThanhVien();j++){
                   Nguoi nguoi = ListHodan.get(i).getThanhvien()[j];
                   if(nguoi.getNgaySinh().plusYears(80).isBefore(LocalDate.now())){
                       System.out.println(nguoi);
                   }
               }
            }

    }
}
