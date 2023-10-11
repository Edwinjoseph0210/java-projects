/*Name: Edwin Joseph
 S3 CSE B
 Roll no. 31
 Program: sum using overload functions.
 date: 11/10/23
 */
import java.util.Scanner;

class getTotal
{
    void sum(int a, int b)
    {   int sum;
        sum=a+b;
        System.out.println(""+sum);
    }
}



public class sumusingfunction
{
    int a,b,sum;
    public static void main(String args[])
    {
        System.out.println("Enter the numbers:");
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int b = s.nextInt();
        getTotal d=new getTotal();
        d.sum(a,b);
    }
}    

