package bai1;

public class RunMain {

    public static void main(String[] args) {
        Person P1 = new Employee("Trung", "HN", 3300);
        Person P2 = new Customer("Huan", "HN", 10400);
        System.out.println("_____ Employee _____");
        P1.display();
        System.out.println("_____ Customer _____");
        P2.display();
    }
}
