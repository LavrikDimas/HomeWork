package homeworks;

public class Circle extends Shape {
	
	private double radius;

	public Circle(){}
	
	public Circle(String name, String collor){
		super(name, collor);
	}
	
	@Override
	public void getInfo() {
		System.out.println("Name: " + name + "; Collor: " + collor + "; Radius: " + radius + "; Area: " + area + "; Perimetr: " + perimeter);
	}

	public void setRadius(double radius) {
		this.radius = radius;
		recalculateProperties();
	}

	@Override
	public void recalculateProperties() {
		area = (float)( Math.PI * radius * radius);
		perimeter = (float)(2.0 * Math.PI * radius);	
	}
	
	
	
}
