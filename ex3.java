package homework;

import java.util.Scanner;

public class Lab01Task3 {

public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
int[] nums = new int[5];
System.out.println("Enter five numbers: ");
String numbers = sc.nextLine();
String[] numArr = numbers.split(" ");
for (int i = 0; i <=4; i++) {
nums[i] = Integer.parseInt(numArr[i]);
}
int max = nums[0], min = nums[0];
for(int i = 0; i<=4; i++) {
if(max < nums[i]) {
max = nums[i];
}else if(min > nums[i]) {
min = nums[i];
}

}
String list = nums[0]+", "+nums[1]+", "+nums[2]+", "+nums[3]+", "+nums[4];
System.out.println("Among all the five numbers ("+list+"),");
System.out.println("min is " + min +" and max is "+ max);
sc.close();

}

}
