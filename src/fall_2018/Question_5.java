package fall_2018;

abstract class Employee {
    String name;
    int age;

    abstract void calculateMonthlySalary();
}

class DailySalariedEmployee {
    int dailySalary;

    public DailySalariedEmployee(int dailySalary) {
        this.dailySalary = dailySalary;
    }

    void calculateMonthlySalary() {
        System.out.println("Salary: " + this.dailySalary * 22);
    }
}

class HourlySalariedEmployee {
    int hourlySalary;

    public HourlySalariedEmployee(int hourlySalary) {
        this.hourlySalary = hourlySalary;
    }

    void calculateMonthlySalary() {
        System.out.println("Salary: " + this.hourlySalary * 176);
    }
}