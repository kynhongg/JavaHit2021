package bai1;

public class Employee extends Person{
    private int salary;

    public Employee() {
    }
    public Employee(int salary) {
        this.salary = salary;
    }
    public Employee(String name, String address, int salary) {
        super(name, address);
        this.salary = salary;
    }

    @Override
    public void display() {
        System.out.println("Employee name: " + name);
        System.out.println("Employee address: " + address);
        System.out.println("Employee salary: " + salary);
    }


}

