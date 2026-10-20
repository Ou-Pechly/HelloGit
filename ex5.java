package homework;
import java.util.Scanner;
public class Lab01Task6 {
static boolean isPrime(int num) {
if (num < 2) return false;
for (int i = 2; i * i <= num; i++) {
if (num % i == 0) return false;
}
return true;
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
System.out.print("Input n: ");
int n = sc.nextInt();
System.out.print("All prime numbers from 2 to " + n + ":");
for (int i = 2; i <= n; i++) {
if (isPrime(i)) {
System.out.print(" " + i);
}
}
System.out.println();
}
}
