//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071

package myIO;

public class Print {
	private static double DEFAULT_EPS = 0.00001;
	
	public static void printTestResult(String test,  Object result, Object expected) {
		System.out.println(test + (result==expected ? "Passed" : "Failed"));
	}
	public static void printDoubleTestResult(String test, double result, double expected) {
		printDoubleTestResult(test, result, expected, DEFAULT_EPS);
	}
	public static void printDoubleTestResult(String test, double result, double expected, double eps) {
		System.out.println(test + (isApproxEqual(result,expected, eps) ? "Passed" : "Failed"));
	}
	private static boolean isApproxEqual(double val1, double val2, double eps) {
		return Math.abs(val1-val2)<=eps;
	}
}
