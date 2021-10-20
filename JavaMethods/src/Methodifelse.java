
public class Methodifelse {
	static void checkAge(int age) {
		
		if(age < 18) {
			System.out.println("access denied- you are not old ");
	} else {
		System.out.println("Access granted- you are old ");
	}

}

public static void main(String[] args) {
	checkAge(20); // call the checkAge 
}
}
