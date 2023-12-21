package org.eronen.project;

import java.util.ArrayList;

public class ItemList {
    private ArrayList<Item> items = new ArrayList<>();

    private static ItemList itemlist = null;

    private ItemList() {

    }

    public static ItemList getInstance() {
        if (itemlist == null) {
            itemlist = new ItemList();
        }
        return itemlist;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void removeItem(int id) {
        items.remove(id);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

}
