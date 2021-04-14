package lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitTest junit = new JUnitTest();
		int result = junit.addNumbers(100, 200);
		assertEquals(300,result);
	}

}
