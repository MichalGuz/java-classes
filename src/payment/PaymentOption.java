package payment;
import java.lang.*;

public class PaymentOption {
    public Payment payment;

    public PaymentOption(Payment payment){
        this.payment = payment;
    }

    public void choosePayment(){
        System.out.println("Thank you for making the order. You have chosen the method of payment: ");
        this.payment.process();
    }
}
