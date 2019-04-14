package calculate_salary;

public class PieceworkSalaryEmployee implements Employee {
    private double piece;
    private double piecePay;

    public PieceworkSalaryEmployee (double piece, double piecePay) {
        this.piece = piece;
        this.piecePay = piecePay;
    }

    public double calculateSalary(){
        return this.piece * this.piecePay;
    }
}
