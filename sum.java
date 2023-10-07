import java.io.*;
import java.util.Scanner;
class array2d
	{public static void main(String[] args)
		{int i,j,n,m;
		n=20;
		m=20;
		int a[][]=new int[n][m];
		Scanner myObj=new Scanner(System.in);
		System.out.println("Enter the numbers of rows");
		n= myObj.nextInt();
		System.out.println("Enter the numbers of columns");
		m= myObj.nextInt();
		System.out.println("Enter the array elements");
		for(i=0;i<n;i++)
			{for(j=0;j<m;j++)
				{a[i][j]= myObj.nextInt();
				}
			}
		System.out.print("\n");
		System.out.println("The array elements are");
		for(i=0;i<n;i++)
			{for(j=0;j<m;j++)
				{System.out.print(" "+a[i][j]);
				}
				System.out.println("\n");
			}
		}	
	}
