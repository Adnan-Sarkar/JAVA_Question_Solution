package summer_2018;

class Employee {
    String name;
    double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public void printSalary() {
        System.out.println(salary);
    }
}
class PlatinumEmployee extends Employee {

    public PlatinumEmployee(String name, double salary) {
        super(name, salary);
    }

    public void printSalary() {
        double bonus = (salary * 15) / 100;
        System.out.println("name: " + name);
        System.out.println("bonus amount: " + bonus);
        System.out.println("total salary: " + salary + bonus);
    }
}

class SilverEmployee extends Employee {

    public SilverEmployee(String name, double salary) {
        super(name, salary);
    }

    public void printSalary() {
        double bonus = (salary * 7) / 100;
        System.out.println("name: " + name);
        System.out.println("bonus amount: " + bonus);
        System.out.println("total salary: " + salary + bonus);
    }
}
