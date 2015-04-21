package console;

import java.util.Scanner;

public class InputConsole {
	
	public static double inDouble (String message) throws Exception{
		double number = 0;
		Scanner reader = new Scanner(System.in);
		System.out.print(message);
		number = reader.nextDouble();
		
		
		
		return number;
	}
	
	

}
