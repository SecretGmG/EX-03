package thermometer;

public class Thermometer {
	public static double DEFAULT_TEMPERATURE = 37.0;
	
	double temperature;
	
	public Thermometer() {
		temperature = DEFAULT_TEMPERATURE;
	}
	
	public double getTemperature() {
		return temperature;
	}
	public void reset() {
		temperature = DEFAULT_TEMPERATURE;
	}
}
