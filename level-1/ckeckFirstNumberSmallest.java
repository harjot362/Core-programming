import java.util.Scanner;

class CheckFirstNumberSmallest{
	public static void main(String[] args){
	Scanner input = new Scanner(System.in);

	System.out.println("Number 1 ; ");
	int number1 = input.nextInt();

	System.out.println("Number 2 ; ");
	int number2 = input.nextInt();

	System.out.println("Number 3 ; ");
	int number3 = input.nextInt();

	if (number1 < number2 && number1 < number3) {
            System.out.println("Is the first number the smallest? true");
        } else {
            System.out.println("Is the first number the smallest? false");
        }
	}
}