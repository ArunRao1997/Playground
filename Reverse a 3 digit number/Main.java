import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    //Type your code here
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int first_digit = num/100;
    int second_digit = (num/10)%10;
    int last_digit = num%10;
    int reverse = (last_digit *100 + second_digit * 10 + first_digit);
    System.out.println(reverse);
  }
}