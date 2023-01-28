package myJavaPrograms;
import java.util.Scanner;
public class scannerEg {
           public static void main(String[] args) {
            Scanner sn = new Scanner(System.in);

            System.out.println("Enter name, age and salary:");

            // String input
            String name = sn.nextLine();

            // Numerical input
            int age = sn.nextInt();
            double salary = sn.nextDouble();

            // Output input by user
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
            System.out.println("Salary: " + salary);
        }
    }

