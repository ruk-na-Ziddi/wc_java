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

	@Test
	public void getNumberOfWords_gives_3_when_3_words_are_in_string(){
		String string="I am rukna";
		assertEquals(3, WcLib.getNumberOfWords(string));
	}

	@Test
	public void getNumberOfWords_gives_3_when_3_words_are_in_string_string_having_outer_spaces(){
		String string="        I am rukna       ";
		assertEquals(3, WcLib.getNumberOfWords(string));
	}

	@Test
	public void getNumberOfWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces(){
		String string="I        am     rukna";
		assertEquals(3, WcLib.getNumberOfWords(string));
	}

	@Test
	public void getNumberOfWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces_and_outer_spaces(){
		String string="             I        am     rukna                ";
		assertEquals(3, WcLib.getNumberOfWords(string));
	}

	@Test
	public void numberOfSpaces_gives_2_when_2_spaces_are_in_string(){
		String string="I am rukna";
		assertEquals(2, WcLib.numberOfSpaces(string));
	}

	@Test
	public void numberOfSpaces_gives_5_when_5_spaces_are_in_string(){
		String string="I   am  rukna";
		assertEquals(5, WcLib.numberOfSpaces(string));
	}

	@Test
	public void numberOfSpaces_gives_7_when_7_spaces_are_in_string(){
		String string=" I   am  rukna ";
		assertEquals(7, WcLib.numberOfSpaces(string));
	}

	@Test
	public void numberOfSpaces_gives_0_when_no_spaces_are_in_string(){
		String string="Iamrukna";
		assertEquals(0, WcLib.numberOfSpaces(string));
	}

}