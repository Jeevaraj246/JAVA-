

import java.util.Scanner;
import java.lang.*;
import java.io.*;


class guvi
{
	public static void main (String[] args) throws java.lang.Exception
	{
		int num, i = 1, sum = 0;
		Scanner in = new Scanner(System.in);
		num = in.nextInt();
		
		while(i <= num)
			  {
			    sum += i;
			    i++;
			  }

			  System.out.println(sum);
	}
}
