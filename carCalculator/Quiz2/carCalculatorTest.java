import static org.junit.Assert.*;
import org.junit.Test;

public class carCalculatorTest {

	@Test
	public void test1() {
		Calculator C = new Calculator(35000, 0, 60, 10);
		double R = C.monthlyCarPayment();
		assertTrue(R == 743.6465648943916);
	}
	
	@Test
	public void test2() {
		Calculator C = new Calculator(35000, 0, 60, 10);
		double R = C.totalSpentOnInterestOverTheTermOfTheLoan();
		assertTrue(R == 9618.793893663496);

	}

}
