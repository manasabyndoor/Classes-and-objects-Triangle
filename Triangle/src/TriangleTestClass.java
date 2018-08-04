import java.util.Scanner;

public class TriangleTestClass {

	public static void main(String args[]) {
		Triangle triangle1 = new Triangle(0, 0, 0);
		int side1, side2, side3;
		// int side =new side[10];
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first side");
		side1 = scanner.nextInt();
		triangle1.setSide1(side1);
		
		System.out.println("Enter the second side");
		side2 = scanner.nextInt();
		triangle1.setSide1(side2);
		
		System.out.println("Enter the third side");
		side3 = scanner.nextInt();
		triangle1.setSide1(side3);
		int result1, result2;
		boolean result3;
		result1 = triangle1.equilateral(side1, side2, side3);
		if (result1 == 1) {
			System.out.println("Equilateral:Yes");
		} else {
			System.out.println("Equilateral:No");
		}

		result2 = triangle1.isIsosceles(side1, side2, side3);
		if (result2 == 1) {
			System.out.println("Iscosceles:Yes");
		} else {
			System.out.println("Iscosceles:No");
		}
		boolean result31 = triangle1.isRight(side1, side2, side3);
		if (result31 == true) {
			System.out.println("Right angle:Yes");
		} else {
			System.out.println("Right angle:No");
		}
		for (int i = 0; i < 3; i++) {

		}

	}
}
