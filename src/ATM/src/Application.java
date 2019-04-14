package ATM.src;

import java.lang.*;

public class Application {
    public static void main (String[] args)  {
        ATMImpl atm1 = new ATMImpl();
        atm1.cashIn(200);
        atm1.cashOut(100);

        atm1.connectionInfo();

        System.out.println(Atm.endOfTransaction());
    }
}
