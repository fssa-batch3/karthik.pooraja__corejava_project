package day04.practice;

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