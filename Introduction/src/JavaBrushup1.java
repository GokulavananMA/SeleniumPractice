import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class JavaBrushup1 {

	public static void main(String[] args) {
//		

//		for (int i = 0; i < arr.length; i++) 
//		{
//			System.out.println(arr[i]);
//		}

		ArrayList<String> a = new ArrayList<String>();
		a.add("ram");
		a.add("sam");
		a.add("tom");
		a.add("selenium");
//		System.out.println(a.get(3));
		for (int i = 0; i < a.size(); i++) {
			System.out.println(a.get(i));
		}

		for (String val : a) {
			System.out.println(val);
		}
		// item is present in ArrayList
		System.out.println(a.contains("selenium"));

		// converting array to array list
		String[] arr = { "ram", "sam", "tom", "selinum" };
		List<String> nameArraylist = Arrays.asList(arr);
		nameArraylist.contains("selinum");

	}

}
