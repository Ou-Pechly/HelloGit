package homework;

import java.util.Scanner;

public class Lab01Task06 {
static void printCourses(String[] subjects, int[] scores, int target) {
int count = 0;
System.out.print(" (");
for (int i = 0; i < scores.length; i++) {
if (scores[i] == target) {
if (count > 0) System.out.print(" and ");
System.out.print(subjects[i]);
count++;
}
}
System.out.println(count == 1 ? " course)." : " courses).");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String[] subjects = {"Math", "English", "Physics", "Programming"};
int[] scores = new int[subjects.length];
System.out.print("Input your scores of 4 subjects\n(Math, English, Physics, and Programming): ");
for (int i = 0; i < scores.length; i++) {
scores[i] = sc.nextInt();
}
int max = scores[0];
int min = scores[0];
int total = 0;
for (int s : scores) {
if (s > max) max = s;
if (s < min) min = s;
total += s;
}
double average = (double) total / scores.length;
System.out.println("Output:");
System.out.print("Max score is: " + max);
printCourses(subjects, scores, max);
System.out.print("Min score is: " + min);
printCourses(subjects, scores, min);
System.out.printf("Average score of this student is: %.2f%n", average);
}
}
