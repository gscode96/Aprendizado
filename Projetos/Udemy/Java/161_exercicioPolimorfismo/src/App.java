import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import core.Employee;
import core.OutSourceEmployee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        List<Employee> list = new ArrayList<Employee>();
        System.out.print("Enter the number of employees: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("Employee #" + i + " data:");
            System.out.print("Outsourced? (Y/N)? ");
            char ch = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Hours: ");
            int hours = sc.nextInt();
            System.out.print("Value per hour: ");
            double valuePerHours = sc.nextDouble();
            if (ch == 'y') {
                System.out.print("Aditional charge: ");
                double additionalCharge = sc.nextDouble();
                list.add(new OutSourceEmployee(name, hours, valuePerHours, additionalCharge));
            } else {
                list.add(new Employee(name, hours, valuePerHours));

            }

            System.out.println();
            System.out.println("Payments:");
        for (Employee emp : list) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
        }

        sc.close();

    }
}
