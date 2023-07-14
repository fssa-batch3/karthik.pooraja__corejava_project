package day04.practice;


class PolygonTest {
	public static void main(String[] args) {
		Polygon rec;
		Polygon rat;
		try {
			
			rec = new Rectangle (10, 5);
			rec.calculateArea();
			rec.circumference();
			rat = new RightAngledTriangle(4.0, 3.0,5.0);
			rat.calculateArea();
			rat.circumference();		
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
