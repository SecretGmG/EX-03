package shipping;

public class Box {
	double width;
	double length;
	double height;
	boolean full;
	Cargo cargo;
	
	public Box(double width, double length, double height) {
		this.width = width;
		this.length = length;
		this.height = height;
	}
	public Box(){
		this(1,1,1);
	}
	
	public double getCapacity() {
		return width*length*height;
	}
	
	public boolean fits(Cargo cargo) {
		return cargo.width < width && cargo.height < height && cargo.length < length;
	}
	
	public boolean addCargo(Cargo cargo){
		if(full) return false;
		if(fits(cargo)) return false;
		
		this.cargo = cargo;
		full = true;
		
		return true;
	}
}
