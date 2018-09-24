import java.util.Scanner;

class guvi
{

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = reader.nextInt();

        if(num % 2 == 0)
            System.out.println("even");
        else if(num % 2 != 0)
            System.out.println("odd");
        else 
        	System.out.println("Invalid");
    }
}
