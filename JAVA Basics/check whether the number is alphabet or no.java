  import java.util.Scanner; 
  class guvi
  
{

    public static void main(String[] args)
  
    {

        
        Scanner scr = new Scanner(System.in);
        char ch=scr.next().charAt(0);
  
        if(ch == 'a' || ch == 'b' || ch == 'c' || ch == 'd' || ch == 'e' || ch == 'f' || ch == 'g' || ch == 'h'  || ch == 'i' || ch == 'j' || ch == 'k' || ch == 'l' || ch == 'm' || ch == 'n' || ch == 'o' || ch == 'p' || ch == 'q' || ch == 'r' || ch == 's' || ch == 't' || ch == 'u' || ch == 'v' || ch == 'w' || ch == 'x' || ch == 'y' || ch == 'z' )
            System.out.println("Alphabet");
            
        else
	System.out.println("No");

    }
}
