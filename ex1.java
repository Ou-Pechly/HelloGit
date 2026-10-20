package test;
import java.util.Scanner;

public class Lab1Task1 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = input.nextInt();
		System.out.println("\nOutput: ");
		int sum=0;
		double avg=0;
		
		for(int i=1000; i>=n; i--) {
			System.out.print(i+ " ");
			sum += i;
		}
		avg = sum / (1000-n+1);
		System.out.println("\nSum is: " +sum);
		System.out.println("Average is: " + avg);
		input.close();
	
	}
}
