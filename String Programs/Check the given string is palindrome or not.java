import java.util.Scanner;
 class palindrome{
 public static void main(String[]args){
 String str;
 String rev = "";
      Scanner ref = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = ref.nextLine();
      int length = str.length();
       for ( int i = length - 1; i >= 0; i-- )
         rev = rev + str.charAt(i);
 
      if (str.equals(rev))
         System.out.println(str+" is a Palindrome");
      else
         System.out.println(str+" is not a Palindrome");
 
   }
}
