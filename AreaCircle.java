import java.util.Scanner;
import java.util.*;

class AreaCircle{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);

	double radius = sc.nextInt();

	double area = 3.14 * radius * radius;

	System.out.println(area);

	}
}