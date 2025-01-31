class Employee {
    private String fullName;
    private String position;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String fullName, String position, String email, String phone, int salary, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void printInfo() {
        System.out.println("ФИО: " + fullName + ", Должность: " + position + ", Email: " + email + ", Телефон: " + phone + ", Зарплата: " + salary + ", Возраст: " + age);
    }
}

class Park {
    private Attraction[] attractions;

    public Park(int size) {
        this.attractions = new Attraction[size];
    }

    public void addAttraction(int index, String name, String workingHours, int price) {
        if (index >= 0 && index < attractions.length) {
            attractions[index] = new Attraction(name, workingHours, price);
        }
    }

    public void printAttractions() {
        for (Attraction attraction : attractions) {
            if (attraction != null) {
                attraction.printInfo();
            }
        }
    }

    private class Attraction {
        private String name;
        private String workingHours;
        private int price;

        public Attraction(String name, String workingHours, int price) {
            this.name = name;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void printInfo() {
            System.out.println("Аттракцион: " + name + ", Время работы: " + workingHours + ", Стоимость: " + price + " рублей");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        employees[1] = new Employee("Petrov Petr", "Manager", "petrov@mail.com", "893312345", 45000, 35);
        employees[2] = new Employee("Sidorov Sid", "Analyst", "sidorov@mail.com", "895678910", 50000, 40);
        employees[3] = new Employee("Smirnova Anna", "Designer", "smirnova@mail.com", "892176543", 55000, 28);
        employees[4] = new Employee("Kozlov Alex", "Developer", "kozlov@mail.com", "897654321", 60000, 32);

        for (Employee employee : employees) {
            employee.printInfo();
        }

        Park park = new Park(3);
        park.addAttraction(0, "Колесо обозрения", "10:00 - 22:00", 300);
        park.addAttraction(1, "Американские горки", "11:00 - 23:00", 500);
        park.addAttraction(2, "Комната страха", "12:00 - 21:00", 400);
        
        park.printAttractions();
    }
}
