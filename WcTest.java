import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void countCharacters_gives_10_when_string_lenght_is_10(){
		String string="I am rukna";
		assertEquals(10, WcLib.countCharacters(string));
	}


	@Test
	public void countCharacters_gives_24_when_string_lenght_is_24(){
		String string="I am swamiji STEP father";
		assertEquals(24, WcLib.countCharacters(string));
	}

	@Test
	public void countCharacters_gives_46_when_string_lenght_is_46(){
		String string="Jayanth is STEP mother and Swamiji STEP father";
		assertEquals(46, WcLib.countCharacters(string));
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string(){
		String string="I am rukna";
		assertEquals(3, WcLib.countWords(string));
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_outer_spaces(){
		String string="        I am rukna       ";
		assertEquals(3, WcLib.countWords(string));
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces(){
		String string="I        am     rukna";
		assertEquals(3, WcLib.countWords(string));
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces_and_outer_spaces(){
		String string="             I        am     rukna                ";
		assertEquals(3, WcLib.countWords(string));
	}

	@Test
	public void countWords_gives_6_when_6_words_are_in_string_string_having_new_line(){
		String string=" I am rukna\nYou are you";
		assertEquals(6, WcLib.countWords(string));
	}

	@Test
	public void countLines_gives_1_when_one_lines_is_in_string(){
		String string="I am rukna";
		assertEquals(1, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string(){
		String string="I am rukna\n ";
		assertEquals(2, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string(){
		String string="I am rukna\nbut my name is Ankur\nConfuse ho gaye na!";
		assertEquals(3, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string_with_s_r(){
		String string="I am rukna\rbut my name is Ankur";
		assertEquals(2, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string_s_r(){
		String string="I am rukna\rbut my name is Ankur\rConfuse ho gaye na!";
		assertEquals(3, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur";
		assertEquals(2, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur\r\nConfuse ho gaye na!";
		assertEquals(3, WcLib.countLines(string));
	}

	@Test
	public void countLines_gives_4_when_4_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur\r\nhasi aa rahi hai\r\nmain aisa q hoon mujhe bhi ni pata";
		assertEquals(4, WcLib.countLines(string));
	}

	@Test
	public void wcOutput_gives_out_as_wc_for_a_string_charCount_wordCount_and_lineCount(){
		String string="I am rukna\nbut my name is Ankur\nConfuse ho gaye na!";
		String expected="51 12 3";
		assertTrue(WcLib.wcOutput(string).equals(expected));
	}

	@Test
	public void countWords_gives_6_when_6_words_are_in_string_string_having_new_line_with_s_r(){
		String string=" I am rukna\rYou are you";
		assertEquals(6, WcLib.countWords(string));
	}
}