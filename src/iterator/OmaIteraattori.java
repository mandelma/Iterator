package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class OmaIteraattori extends Thread {
    final List<String> list;
    final Iterator<String> iterator;
    final String name;

    public OmaIteraattori(List<String> l, String name) {
        this.list = l;
        this.iterator = list.iterator();
        this.name = name;
    }

    @Override
    public void run() {
        //super.run();
        System.out.println(name);
        while(iterator.hasNext()) {
            System.out.println(name + " " + iterator.next());
        }
    }
}
