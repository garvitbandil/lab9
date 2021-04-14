package lab9;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddString {

	@Test
	public void test() {
		JUnitTest junits = new JUnitTest();
		String result= junits.addString("capstone", "project");
				assertEquals("capstoneproject",result);
	}

}
