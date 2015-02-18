public class WcLib{

	public static int getByteLength(String string){
		return string.length();
	}

	public static int numberOfSpaces(String string){
		return string.length()-string.replace(" ","").length();
	}

	public static int getNumberOfWords(String string){
		String trimmed=string.trim();
		return trimmed.split("\\W+").length;
	}

}