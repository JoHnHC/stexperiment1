package experiment1;

import static org.junit.Assert.*;

import org.junit.Test;

import junit.framework.Assert;

public class MyTestTest {

	@Test
	public void test() {
		MyTest t1 = new MyTest();
		MyTest t2 = new MyTest();
		boolean res1 = t1.GivenNub(25);
		boolean res2 = t1.GivenNub(29);
		assertEquals(true,res1);
//		assertEquals(true,res2);
	}

}
