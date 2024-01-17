import io.github.pixee.security.BoundedLineReader;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        LinkedHashSet<String> lhs=new LinkedHashSet<String>();
        String month = BoundedLineReader.readLine(br, 5_000_000);
        String[] arr = month.split(",");
        for(int i = 0;i<arr.length;i++)
        {
            lhs.add(arr[i]);
        }
        System.out.println(lhs);
        System.out.print("Enter the value to be deleted: ");
        String n = BoundedLineReader.readLine(br, 5_000_000);
        System.out.println(n);
        lhs.remove(n);
        System.out.println(lhs);
        System.out.print("Enter the value to be added: ");
        String m = BoundedLineReader.readLine(br, 5_000_000);
        System.out.println(m);
        lhs.add(m);
        System.out.println(lhs);
    }
}
