import java.util.Scanner;


class PerimeterRectangle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double length = sc.nextInt();
	double width = sc.nextInt();

	double perimeter = 2 * (length + width);

	System.out.println(perimeter);

	}
}