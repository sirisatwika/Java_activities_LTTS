package activities_Ltts;

import java.util.Scanner;

abstract class Shape{
	protected int value;
	public Shape(int value) {
		super();
		this.value = value;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	abstract float calculateArea(int value);
	
}
class Circle extends Shape{
	public Circle(int value) {
		super(value);
		
	}

	float calculateArea(int value) {
		return (float) (value * value * 3.14);
	}
}
class Square extends Shape{
	
	public Square(int value) {
		super(value);
	}

	float calculateArea(int value) {
		return (float)(value * value);
	}
}
public class ShapeMain {
	public static void main(String[] args) {
		System.out.println("Circle\nSquare\nEnter the shape");
		Scanner sc = new Scanner(System.in);
		String shp = sc.next();
		int choice;
		if(shp.equals("Circle")){
			choice = 1;
		}else{
			choice = 2;
		}
		int inp;
		switch(choice){
		case 1:
			System.out.println("Enter the radius");
			inp = sc.nextInt();
			Circle c  = new Circle(inp);
			System.out.println("The area of the Circle is: "+c.calculateArea(inp));
			break;
		case 2:
			System.out.println("Enter the side");
			inp = sc.nextInt();
			Square s  = new Square(inp);
			System.out.println("The area of the square is: "+s.calculateArea(inp));
			break;	
		}
		sc.close();
	}

}
