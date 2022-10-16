//Sigrist Cedric 22-120-844
//Moritz Scholz 22-122-071
package vehicles;

import java.time.Period;
import java.time.Year;

public class Car {
	private static Period DURRATION_TO_BE_ANTIQUE = Period.ofYears(45);
	
	private String brand;
	private String model;
	private Year vintage;
	
	public Car(String brand, String model, Year vintage) {
		this.brand = brand;
		this.model = model;
		this.vintage = vintage;
	}
		
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public Year getVintage() {
		return vintage;
	}
	public void setVintage(Year vintage) {
		this.vintage = vintage;
	}
	
	public boolean isAntique() {
		return vintage.isBefore(Year.now().minus(DURRATION_TO_BE_ANTIQUE));
	}
	
	public String toString() {
		return "Car [brand=" + brand + ", model=" + model + ", vintage=" + vintage + "]";
	}
	
	
}
