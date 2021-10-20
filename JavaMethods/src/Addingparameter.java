 // adding two parameters
public class Addingparameter {
	static int myMethod(int x , int y) {
		return x +y; 
	}
	
	public static void main(String[] args) {
		int z = myMethod(5,3); // easy to read and maintain
		System.out.println(z);
	}

}
