//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package thermometer;
import myIO.Print;

public class ThermometerTest {
	
	private static double TEST_VALUE_1 = 40.0;
	private static int TEST_VALUE_2 = 3428;
	
	public static void main(String[] args) {
		Thermometer thermometer1 = new Thermometer();
		Thermometer thermometer2 = new Thermometer();
		
		increaseTo(thermometer1, 85.1);
		increaseMultiple(thermometer2, 10);
		

		testAllFunctions(thermometer1);
		testAllFunctions(thermometer2);
	}
	
	private static boolean increaseTo(Thermometer thermometer, double temperature) {
		while(thermometer.getTemperature() < temperature) {
			thermometer.increase();
		}
		return thermometer.getTemperature() == temperature;
	}
	
	private static void increaseMultiple(Thermometer thermometer, int count) {
		for(int i = 0; i<count; i++) {
			thermometer.increase();
		}
	}
	
	public static void testAllFunctions(Thermometer thermometer) {
		System.out.println(thermometer);
		
		thermometer.reset();
		Print.printDoubleTestResult("Test1: ", thermometer.getTemperature(), Thermometer.DEFAULT_TEMPERATURE);
		
		increaseTo(thermometer, TEST_VALUE_1);
		Print.printDoubleTestResult("Test2: ", thermometer.getTemperature(), TEST_VALUE_1);
		
		increaseMultiple(thermometer, TEST_VALUE_2);
		double expectedResult = TEST_VALUE_1 + 0.1*TEST_VALUE_2;
		
		Print.printDoubleTestResult("Test3: ", thermometer.getTemperature(), expectedResult);
	}
}
