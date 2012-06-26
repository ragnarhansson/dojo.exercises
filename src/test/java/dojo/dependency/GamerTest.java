package dojo.dependency;

import static org.junit.Assert.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;

import org.junit.Test;

public class GamerTest {

	@Test
	public void test() {
		StubbedBufferedReader br = new StubbedBufferedReader(new InputStreamReader(System.in)); 
		br.setText("1,4");
		new Gamer(br).play();
		//fail("Not yet implemented");
	}
	
	 class StubbedBufferedReader extends BufferedReader {
		 
		 public StubbedBufferedReader(Reader in) {
			super(in);
			// TODO Auto-generated constructor stub
		}

		private String text; 
		 
		public void setText(String text) {
			this.text = text;
		}
		 
		 public String readLine() {
			 return text;
		 }
		 
	 }

}
