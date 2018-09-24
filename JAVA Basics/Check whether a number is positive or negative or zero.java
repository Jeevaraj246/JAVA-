import java.util.Scanner;
class guvi
{
public static void main(String[] args)
{
  int j;
  Scanner s=new Scanner(System.in);
  j=s.nextInt();
  if(j>0)
    {
    System.out.println("positive");
    }
  else if(j<0)
    {
    System.out.println("negative");
    }
  else
    {
    System.out.println("zero");
    }
  }
}
