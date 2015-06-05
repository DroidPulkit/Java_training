import java.util.Scanner;
public class Area 
{
	public static void main(String Args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of circle: ");
		double radius = sc.nextFloat();
		System.out.println("Enter the length of Rectangle: ");
		double length = sc.nextFloat();
		System.out.println("Enter the breadth of Rectangle: ");
		double breadth = sc.nextFloat();
		System.out.println("Enter the side of Square: ");
		double side = sc.nextFloat();
		double areaCircle, areaRectangle, areaSquare;
		areaCircle = 3.14 * radius * radius;
		areaRectangle = length * breadth;
		areaSquare = side * side;
		System.out.println("The area of Circle is: "+ areaCircle + "\nThe area of Rectangle is: " + areaRectangle + "\nThe area of Square is: " + areaSquare);
		sc.close();
	}
}