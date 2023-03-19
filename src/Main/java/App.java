package Main.java;

public class App {

	public static void main(String[] args) {


		if (args.length == 0) {
			System.out.println("Place holder for UI app");
		}else {
			System.out.println("CommandLine Calc app : \n Calculator [num] [+ - * /] [num]");
			System.out.println("Response :  " + args[0] +
					" "+ args[1] + " " + 
					args[2] + " = " + Calculate(Integer.parseInt(args[0]),args[1], Integer.parseInt(args[2]))) ;
		}
			
		
		
	}
	public static int Calculate(int num1, String symbol, int num2) {
		
		if ( symbol.contains("+")) {
			return num1 + num2;
		}
		
		return 0;
		
	}
}
