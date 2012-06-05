package dojo.dependency;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzzTest {

	private FizzBuzz fb;
	
	public FizzBuzzTest() {
		fb = new FizzBuzz();
	}
	
	@Test
	public void inputLessThanOne() {
		try {
			fb.play(0, 5);
			fail("Should get assertion");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
	}
	
	@Test
	public void startBiggerThanStop() {
		try {
			fb.play(5, 3);
			fail("Should get assertion");
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		}
		
	}
	
	@Test
	public void someNumbers() {
		FizzBuzz fb = new FizzBuzz();
		String [] res = fb.play(1, 2);
		assertArrayEquals(res, new String[]{ "1", "2" });
	}

	@Test
	public void dividedByThree() {
		String [] res = fb.play(3, 3);
		assertEquals(res[0], "Fizz" );
	}
	
	@Test
	public void dividedByFive() {
		String [] res = fb.play(5, 5);
		assertEquals(res[0], "Buzz" );
	}
	
	@Test
	public void dividedByFithteen() {
		String [] res = fb.play(15, 15);
		assertEquals(res[0], "FizzBuzz" );
	}
}
