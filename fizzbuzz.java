import java.util.Scanner;
import java.io.*;

class fizzbuzz
    {
        public static void main(String[] args)
            {
                int n;
                Scanner a= new Scanner(System.in);
                System.out.println("Enter the number");
                n= a.nextInt();
                if(n%3==0)
                    {
                        System.out.print("Fizz");
                    }
                if(n%5==0)
                    {
                        System.out.println("Buzz");
                    }

            }
    }