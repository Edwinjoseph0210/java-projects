import java.io.*;
import java.util.Scanner;
class names
	{public static void main(String[] args)
		{int i,n;
		n=20;
		String a[]=new String[n];
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n= myObj.nextInt();
		System.out.println("Enter the names");
		for(i=0;i<=n;i++)
				{a[i]= myObj.nextLine();
				}	
		System.out.print("\n");
		System.out.println("The names are");
		for(i=0;i<=n;i++)
				{System.out.print(" "+a[i]);
				}
				System.out.println("\n");
		}
			
	}
