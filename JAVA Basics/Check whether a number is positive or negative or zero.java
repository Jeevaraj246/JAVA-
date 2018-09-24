import java.util.Scanner;
class guvi
{
public static void main(String[] args)
{
  int j;
  Scanner s=new Scanner(System.in);
  System.out.println("Enter the number:");
  j=s.nextInt();
  if(j>0)
    {
    System.out.println("The Number is positive:"+j);
    }
  else if(j<0)
    {
    System.out.println("The Number is negative:"+j);
    }
  else
    {
    System.out.println("The Number is equal to zero:"+j);
    }
  }
}
