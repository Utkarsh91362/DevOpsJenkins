package upes.devops.hons.b3;

import static org.junit.Assert.*;

import org.junit.Test;
import mypkg.MyCalc;
public class MyCalcTest {

	@Test
	public void test() {
		MyCalc ob = new MyCalc();
		assertEquals(25, ob.sum(20, 5));
		assertEquals(100, ob.mul(20, 5));
	}

}
