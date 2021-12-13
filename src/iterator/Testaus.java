package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Testaus {
    public static void main(String[] args) {
        List<String> viikko = new ArrayList<>();
        viikko.add("Maanantai");
        viikko.add("Tiistai");
        viikko.add("Keskiviikko");
        viikko.add("Torstai");
        viikko.add("Perjantai");
        viikko.add("Lauantai");
        viikko.add("Sunnuntai");

        OmaIteraattori ite1 = new OmaIteraattori(viikko, "Iterator 1");
        OmaIteraattori ite2 = new OmaIteraattori(viikko, "Iterator 2");

        ite1.start();
        ite2.start();

        System.out.println("-----------------------------------------");

        Iterator<String> iterator = viikko.iterator();
        YksiIteraattori itex1 = new YksiIteraattori("Iteraatorx 1", iterator);
        YksiIteraattori itex2 = new YksiIteraattori("Iteraatorx 2", iterator);

        //itex1.start();
        //itex2.start();


    }
}
