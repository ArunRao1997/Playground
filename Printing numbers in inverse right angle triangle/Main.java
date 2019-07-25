import java.util.Scanner;
class Main{
	public static void main (String[] args){
	  Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int val = n;
      for(int row_no = 1; row_no <= n; row_no++)
      {
        for(int col_no = val; col_no >= 1; col_no--)
        {
          System.out.print(col_no);
         
        }
         val--;
         System.out.println();
       
	}
	}
}