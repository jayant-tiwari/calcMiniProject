package calculatorApp;
import java.util.Scanner;
import org.apache.log4j.Logger;

public class Calculator {
    private static final Logger logger = Logger.getLogger(Calculator.class);
    public Calculator(){

    }
    public static void main(String args[])
    {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        double num1,num2;
        boolean shouldexit=false;
        while(!shouldexit)
        {
            System.out.println("1- Addition\n 2- Substract\n 3- Multiply\n 4- Divide\n 5- Any other key to exit\n Enter your choice:");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("First number:");
                    num1= sc.nextDouble();
                    System.out.println("Second number:");
                    num2= sc.nextDouble();
                    System.out.println("Result after addition is: "+ calc.add(num1,num2));
                    break;
                case 2:
                    System.out.println("First number:");
                    num1= sc.nextDouble();
                    System.out.println("Second number:");
                    num2= sc.nextDouble();
                    System.out.println("Result after substraction is: "+ calc.substract(num1,num2));

                case 3:
                    System.out.println("First number:");
                    num1= sc.nextDouble();
                    System.out.println("Second number:");
                    num2= sc.nextDouble();
                    System.out.println("Result after multiplication is: "+ calc.multiply(num1,num2));

                case 4:
                    System.out.println("Enter numerator:");
                    num1= sc.nextDouble();
                    System.out.println("Enter denominator:");
                    num2= sc.nextDouble();
                    System.out.println("Result after division is: "+ calc.divide(num1,num2));

                default:
                    shouldexit=true;
                    System.out.println("Exiting");


            }
        }

    }

    public double add(double num1,double num2)
    {
//        logger.info("Performing addition of " + num1 + " , " + num2);
        double result = num1+num2;
//        logger.info("Addition Result" + result);
        return result;
    }

    public double substract(double num1,double num2)
    {
//        logger.info("Performing Subtraction of " + num1 + " , " + num2);
        double result = num1-num2;
//        logger.info("Substraction result " + result);
        return result;
    }

    public double multiply(double num1,double num2)
    {
//        logger.info("Performing Multiplication " + num1 + " , " + num2);
        double result = num1*num2;
//        logger.info("Multiplication Result " + result);
        return result;
    }

    public double divide(double num1,double num2)
    {

        double result;
//        logger.info("Dividing " + num1 + " by " + num2);
        if (num2 == 0) {
//            logger.info("Divide by Zero Exception");
            throw new IllegalArgumentException("Divisor cannot divide by zero");
        } else {
            result = num1/num2;
//            logger.info("Division Result " + result);
        }
        return result;
    }
}
