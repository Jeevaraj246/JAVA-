import java.util.Scanner;
import java.lang.*;
import java.io.*;
class guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
        int year = s.nextInt();
        if(year % 4 == 0)
        {
           System.out.print("yes");
        }
        else
        {
           System.out.print("no");
        }
	}
}
