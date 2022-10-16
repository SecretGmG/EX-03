//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package myIO;

import java.util.Scanner;

public class Prompt {
	
	//Scanners of System.in do not need to /should not be closed
	public static int promptInt(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextInt();
	}
	public static double promptDouble(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.nextDouble();
	}
	public static String promptString(String text) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(text);
		return scanner.next();
	}
	
}
