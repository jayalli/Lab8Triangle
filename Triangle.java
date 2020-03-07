
public class Triangle implements Comparable<Triangle>{
	
	private Point vertexA;
	
	private Point vertexB;
	
	private Point vertexC;
	
	private int Area;
	
	public Triangle(Point TA, Point TB, Point TC) {
		
		vertexA = TA;
		
		vertexB = TB;
		
		vertexC = TC;
		calcArea();	
	}
	
	public Triangle() {
		
	}
	
	public Point getA() {
		
		return vertexA;
	}
	
	public Point getB() {
		
		return vertexB;
	}
	
	public Point getC() {
		
		return vertexC;
	}
	
	public void calcArea() {
		
		int acx = vertexA.getX();
		int acy = vertexA.getY();
		int bcx = vertexB.getX();
		int bcy = vertexB.getY();
		int ccx = vertexC.getX();
		int ccy = vertexC.getY();
		
		Area = Math.abs(((acx*(bcy-ccy))+ (bcx*(ccy-acy))+ (ccx*(acy-bcy)))/2);	
		//Area = vertexB.getX();
	}
	
	public int getArea() {
		
		return Area;
	}

	@Override
	public int compareTo(Triangle o) {
		
//		if(getArea() < o.getArea()) {
//			
//			return getArea();
//			
//		}else {
//			
//			return o.getArea();
//		}
		
		return Area - o.Area;
	}
	
	
	public String toString() {
		
		return "Triangle Area's: " + Area;		
	}


}
	

