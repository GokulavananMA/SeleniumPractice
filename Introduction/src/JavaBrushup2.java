
public class JavaBrushup2 {

	public static void main(String[] args) {
		// string is an object //string litral
		String s = "wlecome bruh";

		// string object
		String s2 = new String("welcome bruh jod");
		// it should slipt the words
		String[] splittedString = s2.split("bruh");
		System.out.println(splittedString[0]);
		System.out.println(splittedString[1]);
		System.out.println(splittedString[1].trim());// it should remove the space
		// it should print character by letter by letter
		for (int i = 0; i < s.length(); i++) {
			System.out.println(s.charAt(i));
		}
		System.err.println("**************");
		// reverse the string
		for (int i = s.length() - 1; i >= 0; i--) {
			System.out.println(s.charAt(i));
		}

	}

}
