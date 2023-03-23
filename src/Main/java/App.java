package Main.java;

import javax.swing.JButton;
import javax.swing.JFrame;

public class App {

	public static void main(String[] args) {
		 
		Calc calc = new Calc();
		System.out.println("CommandLine Calc app : \n Calculator [num] [+ - * /] [num]");

		if (args.length == 0) {
			calc.GUI();			 //CalculateUI.GUI();
		} else {
			System.out.println("Response :\n\n  " + args[0] + " " + args[1] + " " + args[2] + " = "
					+ Calculate(Integer.parseInt(args[0]), args[1], Integer.parseInt(args[2])));
		}
	}

	public static String Calculate(int num1, String symbol, int num2) {
		if (symbol.contains("+")) {
			return String.valueOf((num1) + num2);
		} else if (symbol.contains("-")) {
			return String.valueOf(num1 - num2);
		} else if (symbol.contains("*")) {
			return String.valueOf(num1 * num2);
		} else if (symbol.contains("/")) {
			if ((num1 != 0 && num2 != 0)) {
				return String.valueOf(num1 / num2);
			} else {
				System.out.println(" cannot divide by 0");
				return "Error";
			}
		}
		return "Error";
	}
}
