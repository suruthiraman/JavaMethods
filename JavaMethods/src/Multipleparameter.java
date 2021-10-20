 // access many parameter
public class Multipleparameter {
	static void myMethod(String fname, int age) {
		System.out.println(fname + "is" + age);
	}
	
	public static void main(String[] args) {
		myMethod("lily", 12);
		myMethod("rose", 13);
		myMethod("jack", 3);
	}

}
