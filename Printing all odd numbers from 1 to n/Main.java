import java.util.Scanner;
class Main {
	public static void main (String[] args){
	     // Type your code here
        Scanner sc = new Scanner(System.in);
      int num = sc.nextInt();
      for(int count = 1;count <= num;count++){
        if(count % 2 ==1){
          System.out.println(count);
        }
        count++;
      }
	}

	
}