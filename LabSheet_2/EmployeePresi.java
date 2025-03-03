public class EmployeePresi
 {  
   int empId; // instance variable
   String empName;  // instance variable
   static int empCount=0; // static variable
   static String companyName ="Presidency University";//static variable  
   EmployeePresi(int id, String n)  //constructor  
    {  
     empId = id;  
     empName = n;  
     empCount++;
     }  
   //method to display the values  
   void display ()
     {
      System.out.println(empId+"    "+empName+"   "+companyName);
      }  
   static void printEmployeeCount()
   {
      System.out.println("employee count is"+empCount);
   }
   static void changeCompanyName()
   {
     companyName="Presidency University, Itgalapur, Bengaluru";
   }
   public static void main(String args[]){  
    EmployeePresi e1=new EmployeePresi(111,"Divya");
    EmployeePresi e2=new EmployeePresi(222,"Raghu");
    e1.display(); // calling  normal method using obejct name
    e2.display();   
 EmployeePresi.printEmployeeCount(); // calling static method using class name
 EmployeePresi.changeCompanyName(); // updating static variable using static method
    e1.display(); 
    e2.display();   
 }  
}  
