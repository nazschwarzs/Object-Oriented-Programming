/*
 MUHAMAD ANAZ BIN MOHD SHAHRIN
 03DDT22F1031
 THIS PROGRAM ABOUT Array Index Out Of Bounds Exception
 */
import java.util.*; // import all class and method

public class Question1 {

    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        //defining an arry of integer type 
        int[] number = new int[5];

        try {

            System.out.println("===Lantask4:Array Exception=== "
                    + "\nEnter 5 elemnts to be store in array:");

            //get array element using the loop
            for (int index = 0; index < number.length; index++) {
                System.out.print("Input " + (index + 1) + ": ");
                number[index] = stdin.nextInt();
            }

            //invking sort() method of the arrays class
            Arrays.sort(number);

            System.out.println("\nElements of array sorted in ascending order:");

            //print array using the for loop
            for (int index = 0; index < number.length; index++) {
                System.out.print(number[index] + " ");
            }

            System.out.print("\n\nChoose the index to see their data: ");
            int index = stdin.nextInt();
            System.out.print("Data in index " + index + "is:" + number[index]);

        } //end of try
        catch (ArrayIndexOutOfBoundsException num) {
            System.out.println("Array Index is Out Of Bounds\n" + num);

        }//end of catch

    }//end of main function

}//end of class
