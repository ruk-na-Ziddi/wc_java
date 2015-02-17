import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void getByteLength_gives_10_when_string_lenght_is_10(){
		String string="I am rukna";
		assertEquals(10, WcLib.getByteLength(string));
	}


	@Test
	public void getByteLength_gives_24_when_string_lenght_is_24(){
		String string="I am swamiji STEP father";
		assertEquals(24, WcLib.getByteLength(string));
	}

	@Test
	public void getByteLength_gives_46_when_string_lenght_is_46(){
		String string="Jayanth is STEP mother and Swamiji STEP father";
		assertEquals(46, WcLib.getByteLength(string));
	}

}