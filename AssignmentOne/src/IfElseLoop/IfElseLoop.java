package IfElseLoop;

public class IfElseLoop {
	public static void main(String[] args) {
		int number = 10;
		if(number <= 100 && number >=80) {
			System.out.println("you got an A " + number);
		}
		else if(number<=79 && number>70 ) {
			System.out.println("you got a B ");
			
			
		}else if(number<=70 && number >= 60 ) {
			System.out.println("you got a c ");
			
		}else{
			System.out.println("try hardest");
			
		}
		

}
}
