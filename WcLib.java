public class WcLib{

	private String text=null;

	public WcLib(String text){
		this.text=text;
	}

	public String getText(){
		return text;
	}

	public int countCharacters(){
		return text.length();
	}

	public int countWords(){
		return text.trim().split("\\W+").length;
	}

	public int countLines(){
		return text.split("\r\n|\r|\n").length;
	}

	public String wcOutput(){
		return countCharacters()+" "+countWords()+" "+countLines();
	}

	public static String greaterLength(String str1,String str2){
		return (str1.length() > str2.length())? str1 : str2;
	}

}