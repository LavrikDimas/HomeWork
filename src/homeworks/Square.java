package homeworks;

public class Square extends Shape{
	private float a;
	
	public Square() {}

	public Square(String name, String collor) {
		super(name, collor);
	}
	
	@Override
	public void getInfo() {
		System.out.println("Name: " + name + "; Collor: " + collor + "; Area: " + area + "; Perimetr: " + perimeter);
	}

	@Override
	public void recalculateProperties() {
		area = a * a;
		perimeter = 4 * a;	
	}

	public void setA(float a) {
		this.a = a;
		recalculateProperties();
	}

}
