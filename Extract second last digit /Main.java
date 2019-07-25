import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		// Type your code here
      Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      int second_last_digit = (num/10)%10;
      System.out.println(second_last_digit);
	}
}