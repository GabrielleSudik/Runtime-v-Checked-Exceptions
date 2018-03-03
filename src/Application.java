//java has two basic exceptions:
//checked and runtime
//checked means you have to deal with it (handle) while writing the code
//runtime means you don't have to deal with it in the code
//but will create an error (ex: divide by zero)

public class Application {

	public static void main(String[] args) {
		
//		int value1 = 7;
//		int value2 = value1/0;		
//		System.out.println(value2);
		//you don't get an error in the code
		//but you'll get it when you run.
		
		//interestingly, runtime exceptions tend to be program-breaking errors
		//I guess they are supposedly so obvious that the IDE won't catch them
		
		//here's another example:
//		String text = null;		
//		System.out.println(text.length());
		//program has no idea what the length of text is
		//because you haven't defined it (beyond null)
		
		//and another example:
		String[] texts = {"one", "two", "three"};		
//		System.out.println(texts[5]);
		//texts[5] doesn't exist
		
		//you CAN catch runtime exceptions with try-catch blocks:
		
		try {
			System.out.println(texts[5]);
		} catch (Exception e) {
			System.out.println(e.toString());
			e.getStackTrace();
			
		}
		
		//the catch block can be set to look for generic Exceptions,
		//or RuntimeExceptions, or the specific exception you think you'll get there
		//like ArrayIndexOutOfBoundsException in this case.
	}

}
