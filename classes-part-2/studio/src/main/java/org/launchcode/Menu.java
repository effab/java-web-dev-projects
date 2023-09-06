package org.launchcode;

import java.time.LocalDate;
import java.util.ArrayList;

public class Menu {
    private LocalDate d;
    private LocalDate lastUpdated = null;
    private ArrayList<MenuItem> i;
    private ArrayList<MenuItem> items = null;

    public Menu() {
    }

    public void setLastUpdated(LocalDate lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public LocalDate getLastUpdated() {
        return lastUpdated;
    }

    public ArrayList<MenuItem> getMenuItems() {
        return items;
    }

    public void addMenuItem(MenuItem item) {
        this.items.add(item);
        this.lastUpdated = LocalDate.now();
    }

    public void removeMenuItem(String itemName){
        MenuItem toBeRemoved = null;
        for(MenuItem item: this.items) {
            if(itemName.equals(item.getName())){
                toBeRemoved = item;
            }
        }
        if(toBeRemoved != null) {
            this.items.remove(toBeRemoved);
        }
    }


    @Override
    public String toString(){
        String outPut = "";
        for (MenuItem item: this.items) {
            outPut += item.toString() + "\n";
        }
        outPut += this.lastUpdated;
        return outPut;
    }

}


