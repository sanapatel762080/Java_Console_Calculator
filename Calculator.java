import java.util.Scanner;

public class Calculator{

    public static double addition(double num1, double num2)
    {
        return num1 + num2;
    }

    public static double substraction(double num1, double num2)
    {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2)
    {
        return num1 * num2;
    }

    public static double division(double num1, double num2)
    {
       if (num2 == 0) {
            System.out.println("Cannot divide by zero.");
            return Double.NaN;
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;

        while(flag)
        {
            System.out.println("\n************************************");
            System.out.println("*          Calculator Menu       *");
            System.out.println("************************************");
            System.out.println("* 1. Addition (+)                  *");
            System.out.println("* 2. Subtraction (-)               *");
            System.out.println("* 3. Multiplication (*)            *");
            System.out.println("* 4. Division (/)                  *");
            System.out.println("* 5. Exit                          *");
            System.out.println("************************************");
            System.out.println("  Choose an operation (1-5): ");

            int choice;
            try {
                 choice = scanner.nextInt();
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number between 1-5.");
                scanner.next(); 
                continue;
            }
            
            if (choice < 1 || choice > 5) 
            {
                System.out.println(" Invalid choice. Please select between 1 and 5.");
                continue;
            }


            System.out.println("Enter First Number");
            double n1 = scanner.nextDouble();
            System.out.println("Enter Second Number");
            double n2 = scanner.nextDouble();

            double res = 0;

            switch(choice)
            {
                case 1:
                    res = addition(n1, n2);
                    System.out.println("Addition ="+res);
                    break;

                case 2:
                    res = substraction(n1, n2);
                    System.out.println("Subtraction ="+res);
                    break;

                case 3:
                    res = multiplication(n1, n2);
                    System.out.println("Multiplication ="+res);
                    break;

                case 4:
                    res = division(n1, n2);
                    System.out.println("Division ="+res);
                    break;

                case 5: 
                    System.out.println("Thank you for Choosing Us...");
                    flag = false;
                    break;

            }
        }
        scanner.close();
  
    }
}