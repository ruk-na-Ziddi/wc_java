import org.junit.Test;
import static org.junit.Assert.*;
public class WcTest{

	@Test
	public void getByteLength_gives_10_when_string_lenght_is_10(){
		String string="I am rukna";
		assertEquals(10, WcLib.getByteLength(string));
	}

}