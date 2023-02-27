import lab01.example.model.AccountHolder;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccountWithAtm implementation
 */
class SimpleBankAccountWithAtmTest extends SimpleBankAccountTest {

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithAtm(accountHolder, 0);
    }

    



}
