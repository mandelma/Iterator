package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class YksiIteraattori extends Thread {
    private String name;
    private Iterator<String> itr;
    public YksiIteraattori(String name, Iterator<String> iterator) {
        this.name = name;
        this.itr = iterator;
    }

    public String getName(String name) {
        return this.name;
    }

    @Override
    public void run() {
        System.out.println(name);
        while(itr.hasNext()) {
            System.out.println("iii " + name + " " + itr.next());
        }
    }
}
