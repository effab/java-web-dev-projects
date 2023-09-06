package org.launchcode;

public class Main {

    public static void main(String[] args) {
        MenuItem toast = new MenuItem("Toast", 3.50, "Toasted bread", "breakfast", true);

        Menu menu = new Menu();
        menu.addMenuItem(toast);

        System.out.println(toast);
    }
}
