import io.github.pixee.security.BoundedLineReader;
import java.util.*;
import java.io.*;
import java.lang.*;
public class Main 
{
    public static void main(String a[])throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        TreeMap<String,String> hm=new TreeMap<String,String>();
        String name;
        String mark;
        System.out.print("Enter the number of values to be inserted in map:");
        int n = Integer.parseInt(BoundedLineReader.readLine(br, 5_000_000));
        System.out.println(n);
        for(int i = 0;i<n;i++)
        {
            name = BoundedLineReader.readLine(br, 5_000_000);
            mark = BoundedLineReader.readLine(br, 5_000_000);
            hm.put(name,mark);
        }
        System.out.println(hm);
        System.out.print("Enter the index to be removed:");
        String m = BoundedLineReader.readLine(br, 5_000_000);
        System.out.println(m);
        hm.remove(m);
        System.out.println(hm);
        System.out.print("Enter the index to insert:");
        String name1 = BoundedLineReader.readLine(br, 5_000_000);
        System.out.println(name1);
        System.out.print("Enter the value to be inserted:");
        String m1 = BoundedLineReader.readLine(br, 5_000_000);
        System.out.println(m1);
        hm.put(name1,m1);
        System.out.println(hm);
    }
}
