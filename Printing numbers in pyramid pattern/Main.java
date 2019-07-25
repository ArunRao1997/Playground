import java.util.Scanner;
class Main{
	public static void main (String[] args){
     Scanner sc = new Scanner (System.in);
      int n = sc.nextInt();
      int val = 1;
      for(int row_no = 1; row_no <= n; row_no++)
      {
        for(int space =1; space <= n-row_no;space++)
        {
           System.out.print(" ");
        }
        for(int col_no = 1; col_no <= row_no ; col_no++)
        {
          System.out.print(val + " ");
           val++;
        }
         System.out.println();
      
	}	 
    }    
}