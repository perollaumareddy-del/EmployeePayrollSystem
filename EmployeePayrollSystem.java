import java.util.ArrayList;
import java.util.Scanner;

// Employee class
class Employee {
    private int id;
    private String name;
    private double basicSalary;
    private int daysPresent;

    public Employee(int id, String name, double basicSalary, int daysPresent) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
        this.daysPresent = daysPresent;
    }

    // Calculate total salary
    public double calculateSalary() {
        int totalWorkingDays = 30; // Assuming 30 days in a month
        double salary = (basicSalary / totalWorkingDays) * daysPresent;
        return salary;
    }

    // Display payslip
    public void displayPayslip() {
        System.out.println("----- Payslip -----");
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Days Present: " + daysPresent);
        System.out.println("Total Salary: $" + calculateSalary());
        System.out.println("------------------\n");
    }
}

// Main class
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Employee> employees = new ArrayList<>();

        System.out.print("Enter number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Employee " + (i + 1));
            System.out.print("ID: ");
            int id = sc.nextInt();
            sc.nextLine(); // consume newline
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Basic Salary: ");
            double salary = sc.nextDouble();
            System.out.print("Days Present: ");
            int daysPresent = sc.nextInt();

            employees.add(new Employee(id, name, salary, daysPresent));
        }

        // Display all payslips
        System.out.println("\n--- Employee Payslips ---");
        for (Employee emp : employees) {
            emp.displayPayslip();
        }

        sc.close();
    }
}