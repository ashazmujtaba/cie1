package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Nested MenuItem class definition
    public static class MenuItem {
        private final int id;
        private final String name;
        private final double price;
        private final String category;

        public MenuItem(int id, String name, double price, String category) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.category = category;
        }

        public int getId() { return id; }
        public String getName() { return name; }
        public double getPrice() { return price; }
        public String getCategory() { return category; }

        @Override
        public String toString() {
            return String.format("[%d] %-20s - $%.2f (%s)", id, name, price, category);
        }
    }

    public static void main(String[] args) {
        // You can now create and use MenuItem objects here
        MenuItem item = new MenuItem(1, "Burger", 5.99, "Fast Food");
        System.out.println(item);
    }
}
