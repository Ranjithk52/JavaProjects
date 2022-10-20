package strings;

public class StringMethods {

	public static void main(String[] args) {
String s1="Karimnagar";
System.out.println("String Length : "+s1.length());
System.out.println("3 index Character : "+s1.charAt(2));
System.out.println("n character in index value :"+s1.indexOf('n'));
System.out.println("nag is there in s1 : "+s1.contains("nag"));
System.out.println("Substring value : "+s1.substring(2 ,5));
System.out.println("Uppercase : "+s1.toUpperCase());
System.out.println("Lowercase : "+s1.toLowerCase());
System.out.println("Hello "+s1);
String s2="   People   ";
System.out.println(s2);
System.out.println(s2.trim());
System.out.println("Hello "+s1+" "+s2.trim());
	}

}
