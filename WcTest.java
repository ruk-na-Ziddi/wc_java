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
	public void getNumberOfWords_gives_6_when_6_words_are_in_string_string_having_new_line(){
		String string=" I am rukna\nYou are you";
		assertEquals(6, WcLib.getNumberOfWords(string));
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

	@Test
	public void getNumberOfLines_gives_1_when_one_lines_is_in_string(){
		String string="I am rukna";
		assertEquals(1, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_2_when_2_lines_are_in_string(){
		String string="I am rukna\n ";
		assertEquals(2, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_3_when_3_lines_are_in_string(){
		String string="I am rukna\nbut my name is Ankur\nConfuse ho gaye na!";
		assertEquals(3, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_2_when_2_lines_are_in_string_with_s_r(){
		String string="I am rukna\rbut my name is Ankur";
		assertEquals(2, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_3_when_3_lines_are_in_string_s_r(){
		String string="I am rukna\rbut my name is Ankur\rConfuse ho gaye na!";
		assertEquals(3, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_2_when_2_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur";
		assertEquals(2, WcLib.getNumberOfLines(string));
	}

	@Test
	public void getNumberOfLines_gives_3_when_3_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur\r\nConfuse ho gaye na!";
		assertEquals(3, WcLib.getNumberOfLines(string));
	}

}