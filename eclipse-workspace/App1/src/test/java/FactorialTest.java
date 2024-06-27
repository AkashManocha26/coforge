import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FactorialTest {

	@Test
	void test() {
		assertEquals(125,Factorial.getFactorial(5));
		System.out.println("test called ");
	}

}
