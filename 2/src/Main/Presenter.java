package Main;

import Data.XMLDAO;
import Entity.Item;
import Entity.TeaPot;

import java.util.List;

public class Presenter {
    private final XMLDAO xmldao = new XMLDAO();
    private List<Item> items = null;

    public List<Item> getItems() {
        if (items == null)
            items = xmldao.load();
        return items;
    }

    public Item calcMin(){
        double min = Double.MAX_VALUE;
        Item minItem = null;
        for (Item x: items)
            if (x.getPrice() < min) {
                min = x.getPrice();
                minItem = x;
            }
        return minItem;
    }

    public int countPots(){
        int count = 0;
        for (Item x: items)
            if (x instanceof TeaPot)
                count++;
        return count;
    }
}
