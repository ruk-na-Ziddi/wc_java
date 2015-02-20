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

	public String getGreatestLine(){
		String[] textArray=text.split("\r\n|\r|\n");
		String initial_string="";
		for (int i=0;i<textArray.length;++i){
			initial_string=greaterLength(initial_string,textArray[i]);
		}
		return initial_string.length()+" "+initial_string;
	}

	public static String smallerLength(String str1,String str2){
		return (str1.length() < str2.length())? str1 : str2;
	}

	public String getSmallestLine(){
		String[] textArray=text.split("\r\n|\r|\n");
		String initial_string=textArray[0];
		for (int i=0;i<textArray.length;++i){
			initial_string=smallerLength(initial_string,textArray[i]);
		}
		return initial_string.length()+" "+initial_string;
	}

	public static boolean isOption(String string){
		return string.charAt(0)=='-';
	}

}