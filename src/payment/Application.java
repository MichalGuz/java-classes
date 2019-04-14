package payment;
import java.lang.*;

public class Application {
    public static void main (String[] args) throws java.lang.Exception
    {
        PaymentOption paymentOption = new PaymentOption(new Prepayment());

        paymentOption.choosePayment();
    }

}
