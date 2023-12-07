package put.io.testing.audiobooks;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AudiobookPriceCalculatorTest {

    private AudiobookPriceCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new AudiobookPriceCalculator();
    }

    @Test
    public void testCalculateSubscriber() {
        Customer customer = new Customer("Alicja", Customer.LoyaltyLevel.SILVER, true);
        Audiobook audiobook = new Audiobook("Book Title", 100.0);
        assertEquals(0.0, calculator.calculate(customer, audiobook), "Subscriber should pay 0.0");
    }

    @Test
    public void testCalculateSilverCustomer() {
        Customer customer = new Customer("Jane Doe", Customer.LoyaltyLevel.SILVER, false);
        Audiobook audiobook = new Audiobook("Another Book Title", 100.0);
        assertEquals(90.0, calculator.calculate(customer, audiobook), "Silver customer should pay 90.0");
    }

    @Test
    public void testCalculateGoldCustomer() {
        Customer customer = new Customer("Bob Smith", Customer.LoyaltyLevel.GOLD, false);
        Audiobook audiobook = new Audiobook("Yet Another Book Title", 100.0);
        assertEquals(80.0, calculator.calculate(customer, audiobook), "Gold customer should pay 80.0");
    }

}
