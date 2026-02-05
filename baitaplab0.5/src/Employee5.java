abstract class Employee5 {
    String id;
    String name;

    Employee5(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract double calculateSalary();
}

class OfficeEmployee extends Employee5 {
    double fixedSalary;

    OfficeEmployee(String id, String name, double salary) {
        super(id, name);
        fixedSalary = salary;
    }

    @Override
    public double calculateSalary() {
        return fixedSalary;
    }
}

class SalesEmployee extends Employee5 {
    double baseSalary;
    double commission;

    SalesEmployee(String id, String name, double base, double com) {
        super(id, name);
        baseSalary = base;
        commission = com;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + commission;
    }
}

