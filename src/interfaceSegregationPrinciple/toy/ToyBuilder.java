package interfaceSegregationPrinciple.toy;

public class ToyBuilder {
	public static ToyHouse buildToyHouse() {
		ToyHouse toyHouse = new ToyHouse();
		toyHouse.setColor("yellow");
		toyHouse.setPrice(50000000);
			
		return toyHouse;
	}
	
	public static ToyCar buildToyCar() {
		ToyCar toyCar = new ToyCar();
		toyCar.setColor("grey");
		toyCar.setPrice(2000);
		toyCar.move();
		
		return toyCar;
	}
	
	public static ToyPlane buildToyPlane(){
        ToyPlane toyPlane=new ToyPlane();
        toyPlane.setPrice(125.00);
        toyPlane.setColor("white");
        toyPlane.move();
        toyPlane.fly();
        return toyPlane;
    }
	
	
}
