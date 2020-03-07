




public class Point extends Triangle{

	private int x;
	private int y;
	
	
	public Point() {
		
		this(0,0);
	}
	
	public Point(int px , int py) {
		
		x = px;
		y = py;
	}
	
	public int getX() {
		
		return x;
	}
	
	public int getY() {
		
		return y;
	}
	
	public String toString() {
		
		return "(" + x + "," + y + ")";
	}
}
