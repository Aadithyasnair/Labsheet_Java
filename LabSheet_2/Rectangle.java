import java.util.Scanner;
class Rectangle
{
  double length;  // instance variables or data members or characterstics
  double breadth;
  double area;
void getdata(Double side)  // single parameter 
{ 
       breadth=length=side;
}
void getdata(double length, double breadth) // two parameter method 
{
    this.length=length;
    this.breadth=breadth;
}
double area()
{
  return length*breadth;
}
void display()
{
  System.out.println("length "+length);
  System.out.println("breadth is "+breadth);
  System.out.println("area is "+area);
}
public static void main(String args[])
{
   Rectangle r1=new Rectangle();  // object creation or instantiation
   Rectangle r2=new Rectangle(); 
   Scanner sc=new Scanner(System.in);
    System.out.println("enter side  ");
    double side=sc.nextDouble();
    r1.getdata(side);
    System.out.println("enter length and breadth of a rectangle");
    double l=sc.nextDouble();
    double b=sc.nextDouble();
    r2.getdata(l,b); 
    System.out.println("area of a square is : "+r1.area()); 
    System.out.println("area of a rectangle is : "+r2.area()); 
}}
