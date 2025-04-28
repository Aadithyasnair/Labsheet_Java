import java.util.Scanner;
abstract class Geometry {
    double d1, d2, area;
    abstract void area();}
class Rectangle extends Geometry {
    Rectangle(double length, double breadth) {
        d1 = length;
        d2 = breadth;}
    void area() {
        area = d1 * d2;
        System.out.println("Area of Rectangle is: " + area);}}
class Triangle extends Geometry {
    Triangle(double base, double height) {
        d1 = base;
        d2 = height;}
    void area(){
                area=(d1*d2)/2;
                System.out.println("Area of Triangle is: "+area);}}
public class Main {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(3.1, 4.1);
        r1.area();
        Triangle t = new Triangle(2.1, 6.1);
        t.area();
    }
}