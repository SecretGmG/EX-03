package vehicles;

import java.time.Period;
import java.time.Year;

public class Car {
	public static Period DURRATION_TO_BE_ANTIQUE = Period.ofYears(45);
	
	String brand;
	String model;
	Year vintage;
	
		
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
	
	
}
