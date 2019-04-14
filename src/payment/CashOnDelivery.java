package payment;

public class CashOnDelivery implements Payment {
    public void process() {
        System.out.println("cash on delivery. Please make payment on delivery.");
    }
}
