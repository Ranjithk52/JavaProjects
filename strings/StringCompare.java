package strings;

public class StringCompare {

	public static void main(String[] args) {
	String str1 ="etrings are immutable";
	String str2 ="Strings are immutable";
	String str3 ="Integers are not immutable";
	int result =str1.compareTo(str2 );
	System.out.println(result);
	result =str2.compareTo(str3 );
	System.out.println(result);
	result =str3.compareTo(str1 );
	System.out.println(result);
	String s ="Strings are immutable";
	s.concat(" all the time");
	System.out.println(	s.concat(" all the time"));
	}

}
