package payment;
import java.lang.*;

public class Prepayment implements Payment {
    public void process() {
        System.out.println("prepayment. Please make a transfer: (bank transfer details)");
    }
}
