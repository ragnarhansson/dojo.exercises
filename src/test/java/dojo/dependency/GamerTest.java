package dojo.dependency;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;

import org.junit.Test;

public class GamerTest {

	@Test
	public void test() {
		
		Gamer g = new Gamer();
	
		ByteArrayInputStream inputStream = new ByteArrayInputStream("1,2".getBytes());
		System.setIn(inputStream);

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		System.setOut(new PrintStream(outputStream, true));
		
		g.play();
		
		assertEquals(null, "fizz buzz: " + System.getProperty("line.separator") + "1 2 ", outputStream.toString());
		
	}

}
