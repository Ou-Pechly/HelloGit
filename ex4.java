package homework;
import java.util.Scanner;
public class Lab01Task4 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] thirtyMonth = {4, 6, 9, 11};
int[] thirtyOneMonth = {1, 3, 5, 7, 8, 10, 12};
System.out.println("Enter a date (yyyy-mm-dd): ");
String date = sc.nextLine();
String[] ymd = date.split("-");
int year = Integer.parseInt(ymd[0]);
int month = Integer.parseInt(ymd[1]);
int day = Integer.parseInt(ymd[2]);
for(int i=0; i<=3; i++) {
if(month == thirtyMonth[i] && day <= 30) {
System.out.println("Valid date.");
return;
}
}
for(int i=0; i<=6; i++) {
if(month == thirtyOneMonth[i] && day<=31) {
System.out.println("Valid date.");
return;
}
}
if(month==2) {
if(year %4 == 0 && year % 100 != 0 || year % 400 ==0) {
if(day<=29) {
System.out.println("Valid date.");
return;
}
}else if(day <= 28) {
System.out.println("Valid date.");
return;
}
}
System.out.println("Invalid date.");
sc.close();
}
}
