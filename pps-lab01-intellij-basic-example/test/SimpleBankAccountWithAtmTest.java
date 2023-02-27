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
        this.bankAccount.deposit(this.accountHolder.getId(), 10);
        assertEquals(109, this.bankAccount.getBalance());
    }



}
