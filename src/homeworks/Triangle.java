package homeworks;

public class Triangle extends Shape{
	private float a, b, c;
	
	public Triangle(){}
	
	public Triangle(String name, String collor){
		super(name, collor);
	}
	
	public void initialTriangle(float a, float b, float c) {
		this.a = a;
		this.b = b;
		this.c = c;
		recalculateProperties();
	}
	
	@Override
	public void getInfo() {
		System.out.println("Name: " + name + "; Collor: " + collor + "; Area: " + area + "; Perimetr: " + perimeter);
	}

	@Override
	public void recalculateProperties() {
		perimeter = a + b + c;
		float p = perimeter / 2.0f;
		area = (float) Math.sqrt(p * (p - a) * (p - b) * (p - c));
	}
}
