import java.util.*;

public class ClientLab8 {
	public static void main(String [] args) {
		
	
	ArrayList<Triangle> list1 = new ArrayList<Triangle>(10); //10 items
	list1.add(new Triangle(new Point(20,5), new Point(9,15), new Point(20,13)));//44
	list1.add(new Triangle(new Point(2,-5), new Point(5,6), new Point(7,-2)));
	list1.add(new Triangle(new Point(2,3), new Point(11,1), new Point(2,7)));
	list1.add(new Triangle(new Point(2,34), new Point(111,1), new Point(2,73)));
	list1.add(new Triangle(new Point(42,3), new Point(11,17), new Point(2,76)));
	list1.add(new Triangle(new Point(2,32), new Point(11,12), new Point(42,7)));
	list1.add(new Triangle(new Point(2,13), new Point(131,1), new Point(25,7)));
	list1.add(new Triangle(new Point(2,31), new Point(11,11), new Point(2,71)));
	list1.add(new Triangle(new Point(21,3), new Point(11,10), new Point(26,7)));

	
	
	System.out.println(list1);
	Collections.sort(list1);
	System.out.println(list1);

	
	

	}
}
