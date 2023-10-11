/*Name: Edwin Joseph
 S3 CSE B
 Roll no. 31
 Program: sum using static
 date: 11/10/23
 */
import java.util.Scanner;

public class sumusing
{
    public static void main(String[] args)
    {
        Scanner a = new Scanner(System.in);
        int num1, num2;
        
        System.out.print("Enter first number: ");
        num1 = a.nextInt();
        
        System.out.print("Enter second number: ");
        num2 = a.nextInt();
        
        int sum = getTotal(num1, num2);
        
        System.out.println("Sum: " + sum);
    }

    public static int getTotal(int number1, int number2)
    {
        return number1 + number2;
    }
    
}