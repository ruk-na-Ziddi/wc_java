import java.io.*;

public class WcLib{

	public static int getByteLength(String string){
		return string.length();
	}

	public static int getNumberOfWords(String string){
		String trimmed=string.trim();
		trimmed=trimmed.replaceAll("\\s+"," ");
		int spaces = trimmed.length()-trimmed.replace(" ","").length();
		return spaces+1;
	}
}