/* Name: Edwin Joseph
Roll no: 31
Batch:S3 CSE B
Experiment: Palindrome or not
*/
import java.util.Scanner;

class repeat 
{
   public static void main(String[] args) 
   {
    Scanner sc =new Scanner(System.in);
     System.out.println("Enter String : ");
     String str = sc.nextLine();
     int i,j,c=0; 
     char[] a=new char[str.length()];
     int length= str.length();
     System.out.println("Enter the letter whose frequency is to be found");
     char b= sc.next().charAt(0);
    for(i=0;i<length;i++)
        {a[i]= str.charAt(i);

     
       }
    for(i=0;i<length;i++)
        { if(a[i]==b)
            c++;
            
        }   
        System.out.println("The frequency is "+c);
      
}
}
