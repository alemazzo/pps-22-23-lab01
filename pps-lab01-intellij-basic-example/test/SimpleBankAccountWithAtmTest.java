import lab01.example.model.AccountHolder;

import lab01.example.model.BankAccount;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
class SimpleBankAccountWithAtmTest {

    private AccountHolder accountHolder;
    private BankAccount bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 100);
    }

    @Test
    void testDepositApplyFees() {
        final int amountToDeposit = 10;
        final int expectedAmountAfterDeposit = 109;
        this.bankAccount.deposit(this.accountHolder.getId(), amountToDeposit);
        assertEquals(expectedAmountAfterDeposit, this.bankAccount.getBalance());
    }

    @Test
    void testWithdrawApplyFees() {
        final int amountToWithdraw = 10;
        final int expectedAmountAfterWithdraw = 89;
        this.bankAccount.withdraw(this.accountHolder.getId(), amountToWithdraw);
        assertEquals(expectedAmountAfterWithdraw, this.bankAccount.getBalance());
    }

}
