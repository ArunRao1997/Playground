import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int first_digit = num/100;
      int last_digit = num%10;
      int sum = first_digit + last_digit;
      System.out.println(sum);
	}
}