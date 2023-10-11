/*Name: Edwin Joseph
 S3 CSE B
 Roll no. 31
 Program: Area using overload functions.
 date: 11/10/23
 */
import java.util.Scanner;


class Area
                {void area(int l)
                        
                    {
                        double area1= l*l;
                        System.out.println(""+area1);
                    }
                
                void area(int l,int b)
                    {
                        double area1=l*b;
                        System.out.println(""+area1);
                    }
                

                void area(double r)
                    {
                        double area1= 3.14*r*r;
                        System.out.println(""+area1);
                    }
                }
                    

                    
                    
                    
class areausingfunctions

{
    
        public static void main(String[] args)
            { 
                int n,l,b,s;
                double area=0.0,r=0.0;
                Area d=new Area();
                Scanner a= new Scanner(System.in);
            System.out.println("Enter the side of square");
                s = a.nextInt();
                d.area(s);
                System.out.println("Enter the sides of rectangle");
                l= a.nextInt();
                b= a.nextInt();
                d.area(l,b);
                System.out.println("Enter the radius of circle");
                r= a.nextDouble();
                d.area(r);
                

                
            }
}

