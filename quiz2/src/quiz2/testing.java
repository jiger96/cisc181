package quiz2;

import static org.junit.Assert.*;

import org.junit.Test;

public class testing {
	@Test
	public void testIP(){
	
		car testCar = new car (35000, 0, 60, 10);
		double expectedValue = 9618.79;
		double result = testCar.ip();
		assertEquals(expectedValue, result, 0.01);
		double expectedValue2 = 743.65;
		double result2 = testCar.payment();
		assertEquals(expectedValue2, result2, 0.01);
		
	}

	
//	@SuppressWarnings("deprecation")
//	public void testPayment() {
//		assertEquals("true", testCar.payment(), 743.65);
//	}	

}
