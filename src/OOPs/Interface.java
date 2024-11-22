
interface Shape{
	int calculateArea(int length,int breadth);
}

class Rectangle implements Shape {

	@Override
	public int calculateArea(int length, int breadth) {
		return length * breadth;
	}
}

class Circle implements Shape{

	@Override
	public int calculateArea(int length, int breadth) {
		return (int) (Math.PI*length*breadth);
	}
	
}


public class Interface {

	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
		System.out.println("Area of Rectangle: "+ rectangle.calculateArea(6,8));
		
		Circle circle = new Circle();
		System.out.println("Area of circle: "+ circle.calculateArea(5, 4));

	}

}
