package homeworks;

public abstract class Shape {
	protected String name;	
	protected String collor;
	protected float area;
	protected float perimeter;
	
	public Shape(){
		
	}
	
    public Shape(String name, String collor){
		this.name = name;
		this.collor = collor;
	}
	
	public abstract void getInfo();
	
	protected abstract void recalculateProperties();
}
