import java.io.*;
interface Add{
    int add(int a,int b);
}
interface Sub{
    int sub(int a,int b);
}  
class Calculator implements Add,Sub{
    public int add(int a,int b){
        return a+b;
    }
    public int sub(int a,int b){
        return a-b;
    }
}
class Main2{
    public static void main(String args[]){
        Calculator c1 = new Calculator();
        System.out.println("Addition is: "+c1.add(10,20));
        System.out.println("Subtraction is: "+c1.sub(20,10));
    }
}