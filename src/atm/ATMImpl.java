package atm;

import java.lang.*;

public class ATMImpl implements Atm {
        public void cashIn(int quota) {
            System.out.println("Do you want pay in " + quota + "?");
        }
        public void cashOut(int quota) {
            System.out.println("Do you want pay back " + quota + "?");
        }
}
