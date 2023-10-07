/* Name: Edwin Joseph
Roll no: 31
Batch:S3 CSE B
Experiment: Palindrome or not
*/
import java.util.Scanner;
 
class palindrome
{
   public static void main(String args[])
   {
      String str;
      int flag=0;
      char[] rev =new char[20];
      char[] lin= new char[20];
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a string:");
      str = sc.nextLine();
        int i;
      int length = str.length();
 
      for ( i = length-1; i >= 0; i-- )
         {rev[i]=str.charAt(i);
         
         }
      for(i=0;i<length;i++)
         { lin[i]=str.charAt(i);
         
         
         }
      for(i=0;i<length;i++)
      {if(rev[length-i-1]==lin[i]){
         
      flag=1;
      }
      else
         flag=0; 
         
      }

      if(flag==1)
        System.out.println("It is a palindrome");
        else
        {System.out.println("Not a palindrome");}
   }
}