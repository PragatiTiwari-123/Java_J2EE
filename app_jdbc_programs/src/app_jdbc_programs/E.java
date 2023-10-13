package app_jdbc_programs;
//Finally in java:(1) Finally block is a extension to try catch block
//(2)Any code that we write inside finally block will run 100%
//(3) we can write only try & finally
//Q: give me practical example where try catch & finally can be used?
//Answer: Closing Data base connection.
//Q:- How to stop finally block or what is system.exit()?
//public class E {
//       public static void main(String[] args) {
//
//	        try {
//	        	int  x = 10/2; //exception occurs still run
//	        }catch(Exception e) {
//	        	e.printStackTrace();
//	          
//	        } finally {
//	        	System.exit(0);
//	        	System.out.println("finally");
//	        }
//       }
//}

//when we create multi catch block we should first start with child exception classes then followed by parent exception class
public class E {
	public static void main(String[] args) {
		int x = 10;

		try {
			Integer.parseInt("HSDNCDGJLLL");
		} catch (ArithmeticException e) { // specific exception
			System.out.println(1);
		} catch (NullPointerException e) { // specific exception
			System.out.println(2); 
		} catch (Exception e) {     // global exception
            System.out.println(3);		
            
		}
	}
}