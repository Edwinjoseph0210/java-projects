/* Name: Edwin Joseph
Roll no: 31
Batch:S3 CSE B
Experiment: Palindrome or not
*/
import java.io.*;
import java.util.Scanner;
class some
    {public static void main(String[] args)
        {int i,j,k,n,m,l;
        n=100;
        m=100;
        int a[][]=new int[n][m];
        int b[][]=new int[n][m];
        int c[][]=new int[n][m];
        Scanner some=new Scanner(System.in);
        System.out.println("Enter the number of rows");
        m =some.nextInt();
        System.out.println("Enter the number of columns");
        n =some.nextInt();
        System.out.println("Enter the elements of first array");
            for(i=0;i<m;i++)
                {for(j=0;j<n;j++)
                    {a[i][j]= some.nextInt();}
                }
        System.out.println("Enter the elements of second array");
            for(i=0;i<m;i++)
                {for(j=0;j<n;j++)
                    {b[i][j]= some.nextInt();}
                }
            for(i=0;i<m;i++)
                {for(j=0;j<n;j++)
                    {for(l=0;l<n;l++)
                    {c[i][j]=a[i][l]*b[l][j]; }
                    }
                }
        System.out.println("The product of the matrices is");
            for(i=0;i<m;i++)
                {System.out.print  ("\n");
                for(j=0;j<n;j++)
                    {System.out.print("\t"+c[i][j]);
                    }
                }
        }

    }