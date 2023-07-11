package day04.practice;


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
