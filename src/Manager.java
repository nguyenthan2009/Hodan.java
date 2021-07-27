import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

    public boolean mungTho(int nam) {
        for (int i = 0; i < ListHodan.size(); i++) {
                int a = ListHodan.get(i).getYear();
                if (a - nam == 80) {
                    return true;
                }
            }
        return false;

    }
}
