package test;
import java.util.Scanner;

public class Lab1Task2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("            Welcome to our program              ");
		System.out.println("\'Quadratic Equation Solver ax^2 + bx + c = 0\'");
		System.out.println("==============================================");
		
		double a, b, c;
		System.out.print("\n\nEnter a: ");
		a = input.nextDouble();
		System.out.print("Enter b: ");
		b = input.nextDouble();
		System.out.print("Enter c: ");
		c = input.nextDouble();
		
		if (a == 0) {
			double root0 = (-c/b);
			System.out.println("\nRoots of this equation: "+a+"x^2+" +b+"x+"+ c +"= 0 is:");
			System.out.println("x= "+root0);
		}else {
		double root1 = ((-b)+Math.sqrt((b*b)-4*a*c)) / 2*a;
		double root2 = ((-b)-Math.sqrt((b*b)-4*a*c)) / 2*a;
		System.out.println("\nRoots of this equation: "+a+"x^2+" +b+"x+"+ c +"= 0 are:");
		System.out.println("x1 = "+root1);
		System.out.println("x2 = "+root2);
		}
		input.close();
	}

}
