package day04.solved;

abstract class Polygon {
	protected int numberOfSides;
	
	public Polygon (int numberOfSides) throws Exception {
		if (numberOfSides < 3) {
			throw new Exception("Invalid number of sides to create a polygon ");
		}
		else {
			this.numberOfSides = numberOfSides;
		}
	}
	
	
	public abstract  double calculateArea();
	public abstract  double circumference();
}

class RightAngledTriangle extends Polygon {
	
	protected double height;
	protected double base;
	protected double hypotenuse;
	
	public RightAngledTriangle(double height, double base,double hypotenuse) throws Exception {
		super(3);
		if(height <= 0 || base <= 0||hypotenuse<=0) {
			throw new Exception("Invalid dimensions for a Right angled triangle");
		}
		this.height = height;
		this.base = base;
	}

	@Override
	public double calculateArea() {
		
		return (this.height * this.base)/2;
	}
	@Override
	public double circumference() {
		
		return this.height + this.base+this.hypotenuse;
		
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
public class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		
		return this.length * this.breadth;
	}
	@Override
	public double circumference() {
		return  2*(length+breadth);
	}
	
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}

}
class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		try {
			
			rec = new Rectangle (10, 5);
			rec.calculateArea();
			rec.circumference();
			RightAngledTriangle ratt = new RightAngledTriangle(4.0, 3.0,5.0);
			ratt.calculateArea();
			ratt.circumference();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
