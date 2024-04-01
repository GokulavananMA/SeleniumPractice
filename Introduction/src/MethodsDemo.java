
public class MethodsDemo {

	public static void main(String[] args) {
		// why method ->
		MethodsDemo d = new MethodsDemo();
		String name = d.getData();
		System.out.println(name);
		methodDemo2 d1 = new methodDemo2();
		d1.getUserData();
	}

	public String getData() {
		System.out.println("welcome bruh");
		return "romm";
	}

}
