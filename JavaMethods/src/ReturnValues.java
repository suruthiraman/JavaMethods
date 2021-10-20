 // void keywords used indicates that the method should not return a value 
//primitive data type(int, char, etc)instead of void , and use the return keyword
public class ReturnValues {
     static int myMethod(int x) {
    	 return 3+x;
    	 
     }
     
     public static void main(String[] args) {
    	 System.out.println(myMethod(3));
     }
}

