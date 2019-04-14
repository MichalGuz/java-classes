package calculate_salary;

public class FixedSalaryEmployee implements Employee {
    private double salary;
    private double selling;

    public FixedSalaryEmployee(double salary, double selling) {
        this.salary = salary;
        this.selling = selling;
    }

    public double calculateSalary() {
        if (selling > 0) {
            return this.salary * 1.2;
        } else {
            return this.salary;
        }
    }
}
