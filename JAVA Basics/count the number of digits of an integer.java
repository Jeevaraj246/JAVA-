import java.util.Scanner;
import java.lang.*;
import java.io.*;

class guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in = new Scanner(System.in);
    
		int count = 0, num ;
		 num = in.nextInt();
		
		

        while(num != 0)
        {
           
            num /= 10;
            ++count;
        }

        System.out.println(count);
	}
}
