class Employee {
    double getSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee {
    double monthlySalary;

    FullTimeEmployee(double salary) {
        monthlySalary = salary;
    }

    @Override
    double getSalary() {
        return monthlySalary;
    }
}

class PartTimeEmployee extends Employee {
    int hours;
    double rate;

    PartTimeEmployee(int h, double r) {
        hours = h;
        rate = r;
    }

    @Override
    double getSalary() {
        return hours * rate;
    }
}

