import org.junit.Test;
import static org.junit.Assert.*;

public class WcTest{

	@Test
	public void countCharacters_gives_10_when_string_lenght_is_10(){
		String string="I am rukna";
		WcLib wcText=new WcLib(string);
		assertEquals(10, wcText.countCharacters());
	}

	@Test
	public void countCharacters_gives_24_when_string_lenght_is_24(){
		String string="I am swamiji STEP father";
		WcLib wcText=new WcLib(string);
		assertEquals(24, wcText.countCharacters());
	}

	@Test
	public void countCharacters_gives_46_when_string_lenght_is_46(){
		String string="Jayanth is STEP mother and Swamiji STEP father";
		WcLib wcText=new WcLib(string);
		assertEquals(46, wcText.countCharacters());
	}

	@Test
	public void getText_gives_given_string_as_it_is_without_new_line(){
		String string="I am rukna";
		WcLib wcText=new WcLib(string);
		assertTrue(wcText.getText().equals(string));
	}

	@Test
	public void getText_gives_given_string_as_it_is_with_new_line(){
		String string="Jayanth is STEP mother\r\nbut Swamiji is STEP father";
		WcLib wcText=new WcLib(string);
		assertTrue(wcText.getText().equals(string));
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string(){
		String string="I am rukna";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countWords());
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_outer_spaces(){
		String string="        I am rukna       ";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countWords());
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces(){
		String string="I        am     rukna";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countWords());
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_extra_inner_spaces_and_outer_spaces(){
		String string="             I        am     rukna                ";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countWords());
	}

	@Test
	public void countWords_gives_6_when_6_words_are_in_string_string_having_new_line(){
		String string=" I am rukna\nYou are you";
		WcLib wcText=new WcLib(string);
		assertEquals(6, wcText.countWords());
	}

	@Test
	public void countLines_gives_1_when_one_lines_is_in_string(){
		String string="I am rukna";
		WcLib wcText=new WcLib(string);
		assertEquals(1, wcText.countLines());
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string(){
		String string="I am rukna\n ";
		WcLib wcText=new WcLib(string);
		assertEquals(2, wcText.countLines());
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string(){
		String string="I am rukna\nbut my name is Ankur\nConfuse ho gaye na!";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countLines());
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string_with_s_r(){
		String string="I am rukna\rbut my name is Ankur";
		WcLib wcText=new WcLib(string);
		assertEquals(2, wcText.countLines());
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string_s_r(){
		String string="I am rukna\rbut my name is Ankur\rConfuse ho gaye na!";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countLines());
	}

	@Test
	public void countLines_gives_2_when_2_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur";
		WcLib wcText=new WcLib(string);
		assertEquals(2, wcText.countLines());
	}

	@Test
	public void countLines_gives_3_when_3_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur\r\nConfuse ho gaye na!";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countLines());
	}

	@Test
	public void countLines_gives_4_when_4_lines_are_in_string_with_s_r_s_n(){
		String string="I am rukna\r\nbut my name is Ankur\r\nhasi aa rahi hai\r\nmain aisa q hoon mujhe bhi ni pata";
		WcLib wcText=new WcLib(string);
		assertEquals(4, wcText.countLines());
	}

	@Test
	public void wcOutput_gives_out_as_wc_for_a_string_charCount_wordCount_and_lineCount(){
		String string="I am rukna\nbut my name is Ankur\nConfuse ho gaye na!";
		String expected="51 12 3";
		WcLib wcText=new WcLib(string);
		assertTrue(wcText.wcOutput().equals(expected));
	}

	@Test
	public void countWords_gives_6_when_6_words_are_in_string_string_having_new_line_with_s_r(){
		String string=" I am rukna\rYou are you";
		WcLib wcText=new WcLib(string);
		assertEquals(6, wcText.countWords());
	}

	@Test
	public void countWords_gives_6_when_6_words_are_in_string_string_having_new_line_with_s_r_s_n(){
		String string=" I am rukna\r\nYou are you";
		WcLib wcText=new WcLib(string);
		assertEquals(6, wcText.countWords());
	}

	@Test
	public void countWords_gives_3_when_3_words_are_in_string_string_having_tabs(){
		String string=" I 						am				 rukna";
		WcLib wcText=new WcLib(string);
		assertEquals(3, wcText.countWords());
	}
}