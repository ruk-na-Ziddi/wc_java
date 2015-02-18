public class WcLib{

	public static int countCharacters(String string){
		return string.length();
	}

	public static int numberOfSpaces(String string){
		return string.length()-string.replace(" ","").length();
	}

	public static int countWords(String string){
		String trimmed=string.trim();
		return trimmed.split("\\W+").length;
	}

	public static int countLines(String string){
		return string.split("\r\n|\r|\n").length;
	}

}