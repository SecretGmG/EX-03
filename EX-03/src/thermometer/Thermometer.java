//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package thermometer;

public class Thermometer {
	public static double DEFAULT_TEMPERATURE = 37.0;
	public static double INCREASE_AMOUNT = 0.1;
	
	private double temperature;
	
	public Thermometer() {
		temperature = DEFAULT_TEMPERATURE;
	}
	public double getTemperature() {
		return temperature;
	}
	public void increase() {
		temperature += INCREASE_AMOUNT;
	}
	public void reset() {
		temperature = DEFAULT_TEMPERATURE;
	}
	
	public String toString() {
		return "Thermometer [temperature=" + temperature + "]";
	}
	
}
