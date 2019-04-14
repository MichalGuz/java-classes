package atm;

import java.lang.*;

public interface Atm {
    void cashIn(int quota);

    void cashOut(int quota);

    default void connectionInfo() {
        System.out.println("Please wait for connection to a bank");
    }

    static String endOfTransaction() {
        return "Thank you and see you again!";
    }
}
