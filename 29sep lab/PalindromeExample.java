package javaprogram.basic;

public class PalindromeExample
{
   public static void main(String args[]) {
      String myString = "darshu";
      StringBuffer buffer = new StringBuffer(myString);
      buffer.reverse();
      String data = buffer.toString();
      if(myString.equals(data)){
         System.out.println("Given String is palindrome");
      } else {
         System.out.println("Given String is not palindrome");
      }
   }
}

