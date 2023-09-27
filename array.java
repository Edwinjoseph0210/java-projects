import java.io.*;
import java.util.Scanner;
class array
	{public static void main(String[] args)
		{int i,n;
		n=20;
		int a[]=new int[n];
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the size of array");
		n= myObj.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
				{a[i]= myObj.nextInt();
				}
		System.out.print("\n");
		System.out.println("The array elements are");
		for(i=0;i<n;i++)
				{System.out.print(" "+a[i]);
				}
				System.out.println("\n");
		}
			
	}
