import java.util.Scanner;
public class Employee {

    String name; 
    String designation;
    String department;
    double basic;
    double hra;
    double da;

    public void displayInfo() {
        System.out.println("Employee Name: " + name);
        System.out.println("Designation: " + designation);
        System.out.println("Department: " + department);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Salary: " + calculateSalary());
    }

    public void getData(Scanner scanner) {
        System.out.print("Enter employee name: ");
        name = scanner.nextLine();
        System.out.print("Enter designation: ");
        designation = scanner.nextLine();
        System.out.print("Enter department: ");
        department = scanner.nextLine();
        System.out.print("Enter basic salary: ");
        basic = scanner.nextDouble();
        System.out.print("Enter HRA: ");
        hra = scanner.nextDouble();
        System.out.print("Enter DA: ");
        da = scanner.nextDouble();
        scanner.nextLine(); 

    }
    
    public double calculateSalary() {
        return basic + hra + da;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        System.out.println("Enter details for Employee 1:");
        employee1.getData(scanner);
        System.out.println("\nEmployee 1 Information:");
        employee1.displayInfo();
        System.out.println("\nEnter details for Employee 2:");
        employee2.getData(scanner);
        System.out.println("\nEmployee 2 Information:");
        employee2.displayInfo();
        scanner.close(); 
    }
}
