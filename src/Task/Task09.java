package Task;

import java.util.*;

public class Task09 {
    public static class Laptop {
        private final String brand;
        private final String model;
        private final int ram; // ОЗУ
        private final int storageCapacity; // Объем ЖД
        private final String os; // Операционная система
        private final String color;
        private final double price;

        // Конструктор
        public Laptop(String brand, String model, int ram, int storageCapacity, String os, String color, double price) {
            this.brand = brand;
            this.model = model;
            this.ram = ram;
            this.storageCapacity = storageCapacity;
            this.os = os;
            this.color = color;
            this.price = price;
        }

        // Методы доступа к полям
        public String getBrand() {
            return brand;
        }

        public String getModel() {
            return model;
        }

        public int getRam() {
            return ram;
        }

        public int getStorageCapacity() {
            return storageCapacity;
        }

        public String getOs() {
            return os;
        }

        public String getColor() {
            return color;
        }

        public double getPrice() {
            return price;
        }
    }

    public static Set<Laptop> filterLaptops(Set<Laptop> laptops, Map<String, Object> filters) {
        Set<Laptop> filteredLaptops = new HashSet<>();
        for (Laptop laptop : laptops) {
            boolean match = true;
            for (Map.Entry<String, Object> entry : filters.entrySet()) {
                String field = entry.getKey();
                Object value = entry.getValue();
                switch (field) {
                    case "ram" -> {
                        if (laptop.getRam() < (int) value) {
                            match = false;
                        }
                    }
                    case "storageCapacity" -> {
                        if (laptop.getStorageCapacity() < (int) value) {
                            match = false;
                        }
                    }
                    case "os" -> {
                        if (!laptop.getOs().equals(value)) {
                            match = false;
                        }
                    }
                    case "color" -> {
                        if (!laptop.getColor().equals(value)) {
                            match = false;
                        }
                    }
                    default -> throw new IllegalArgumentException("Invalid filter field: " + field);
                }
            }
            if (match) {
                filteredLaptops.add(laptop);
            }
        }
        return filteredLaptops;
    }

    public static void main(String[] args) {
        Set<Laptop> laptops = new HashSet<>();
        laptops.add(new Laptop("Apple", "MacBook Pro", 16, 512, "macOS", "silver", 1999.99));
        laptops.add(new Laptop("Lenovo", "ThinkPad X1 Carbon", 16, 1024, "Windows 10 Pro", "black", 1599.99));
        laptops.add(new Laptop("Dell", "XPS 13", 8, 512, "Windows 10 Home", "white", 1399.99));

        Map<String, Object> filters = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите цифру, соответствующую необходимому критерию:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Жесткий диск");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");

        int choice = scanner.nextInt();
        switch (choice) {
            case 1 -> {
                System.out.print("Введите минимальный объем ОЗУ: ");
                int minRam = scanner.nextInt();
                filters.put("ram", minRam);
            }
            case 2 -> {
                System.out.print("Введите минимальный объем жесткого диска: ");
                int minStorage = scanner.nextInt();
                filters.put("storageCapacity", minStorage);
            }
            case 3 -> {
                System.out.print("Введите операционную систему: ");
                String os = scanner.next();
                filters.put("os", os);
            }
            case 4 -> {
                System.out.print("Введите цвет: ");
                String color = scanner.next();
                filters.put("color", color);
            }
            default -> {
                System.out.println("Некорректный выбор.");
                return;
            }
        }

        Set<Laptop> filteredLaptops = filterLaptops(laptops, filters);

        if (filteredLaptops.isEmpty()) {
            System.out.println("Ноутбуки, соответствующие выбранным критериям, не найдены.");
        } else {
            System.out.println("Найденные ноутбуки:");
            for (Laptop laptop : filteredLaptops) {
                System.out.println("Бренд: " + laptop.getBrand());
                System.out.println("Модель: " + laptop.getModel());
                System.out.println("ОЗУ: " + laptop.getRam() + " ГБ");
                System.out.println("Объем жесткого диска: " + laptop.getStorageCapacity() + " ГБ");
                System.out.println("Операционная система: " + laptop.getOs());
                System.out.println("Цвет: " + laptop.getColor());
                System.out.println("Цена: $" + laptop.getPrice());
                System.out.println();
            }
        }
    }
}
