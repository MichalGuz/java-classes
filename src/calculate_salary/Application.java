package calculate_salary;
import java.lang.*;

public class Application {
    public static void main (String[] args)
    {
        FixedSalaryEmployee employee = new FixedSalaryEmployee(2000, 5);

        SalaryPayoutProcessor processor = new SalaryPayoutProcessor(employee);

        processor.processPayout();
    }
}
