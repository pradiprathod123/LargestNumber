import java.util.Scanner;

public class SumOfLargestNumber {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int num1;
    int num2;
    int num3;
    int  largest;
    int sum;

    System.out.print("Enter the first number: ");
    num1 = sc.nextInt();
    System.out.print("Enter the second number: ");
    num2 = sc.nextInt();
    System.out.print("Enter the third number: ");
    num3 = sc.nextInt();

    largest = num1;
    if (num2 > largest) {
      largest = num2;
    }
    if (num3 > largest) {
      largest = num3;
    }

    sum = largest;

    System.out.println("The sum of the largest number is " + sum);
  }
}

