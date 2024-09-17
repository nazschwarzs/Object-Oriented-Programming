/*
 MUHAMAD ANAZ BIN MOHD SHAHRIN
 03DDT22F1031
 THIS PROGRAM ABOUT arimethic Exception
 */
import java.util.*;

public class Question3 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //define an int type
        int number1, number2 = 0, operation;
        System.out.println("=== Arimethic Exception ===");

        System.out.println("1. Add\n2.Substract \n3.Multiply \n4.Divide");
        System.out.print("Select the operation(1-4):");
        operation = stdin.nextInt();

        try {
            //get 2 int number
            System.out.print("Input number 1 : ");
            number1 = stdin.nextInt();

            System.out.print("Input number 2 : ");
            number2 = stdin.nextInt();

            //process
            switch (operation) {
                case 1:
                    System.out.println("Total of two number : " + (number1 + number2));
                    break;
                case 2:
                    System.out.println("Total of two number : " + (number1 - number2));
                    break;
                case 3:
                    System.out.println("Total of two number : " + (number1 * number2));
                    break;
                case 4:
                    System.out.println("Total of two number : " + (number1 / number2));
                    break;
                default:
                    System.out.println("operation entered is not in the list");
            }
        }//end of try
        
        catch (ArithmeticException AE) {
            System.out.println("Any number cannot be divived by 0\n" + AE);

        }//end of catch
        
    }//end of main method

}//end of class
