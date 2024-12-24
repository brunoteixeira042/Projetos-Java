import entidades.Employee;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Employee emp = new Employee();
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        System.out.print("Name: ");
        emp.name = sc.nextLine();
        System.out.print("Gross salary: ");
        emp.grossSalary = sc.nextDouble();
        System.out.print("Tax: ");
        emp.tax = sc.nextDouble();
        System.out.println("Employee: "+emp);
        System.out.println("Which percentage to increase salary? ");
        double percentagem = sc.nextDouble();
        emp.increaseSalary(percentagem);
        System.out.println("Updated data: "+emp);
    }
}