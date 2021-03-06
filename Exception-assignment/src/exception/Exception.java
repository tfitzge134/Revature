package exception;

public class Exception {

	public static void main(String[] args) {
		int x = 10;
		int y = 0;
		int res = 0;

		try {
			res = x / y;
			String s = null;
			System.out.println(s.length());
		} catch (ArithmeticException e) {
			System.out.println("We cannot divide by zero");
		} catch (NullPointerException e) {
			System.out.println("Something is null");
//	/	} catch (Exception e) {
//			System.out.println("Some other exception");
	}

		finally {
			System.out.println("Result is : " + res);
		}
		System.out.println("Some other lines of code");

	}

}

//Assignment Exception
//1)Try to recreate the same
//2)Create a BusinessException(checked) and use it for handling for InvalidPassportNumber
//3)Create a BusinessException(unchecked) and use it for handling for invalid DL number.