import lab01.example.model.AccountHolder;
import lab01.example.model.BankAccount;
import lab01.example.model.SimpleBankAccount;

public class SimpleBankAccountWithAtm extends SimpleBankAccount {

    final static int FEES = 1;

    public SimpleBankAccountWithAtm(final AccountHolder accountHolder, int amount) {
        super(accountHolder, amount);
    }

    @Override
    public void deposit(int userID, double amount) {
        super.deposit(userID, amount - FEES);
    }

    @Override
    public void withdraw(int userID, double amount) {
        super.withdraw(userID, amount + FEES);
    }
}
