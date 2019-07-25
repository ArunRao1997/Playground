
        import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        // Get the array size
        int arr_size = in.nextInt();
        int arr[] = new int[arr_size];
        // Get the array elements
        for(int idx = 0; idx <= arr_size - 1; idx++)
        {
            arr[idx] = in.nextInt();
        }
       int max_no;
      max_no =arr[1];
      for(int idx = 2;idx <= arr_size-1;idx++){
        if(max_no < arr[idx])
        {
          max_no = arr[idx];
        }
    }
  System.out.println(max_no);
}
    }