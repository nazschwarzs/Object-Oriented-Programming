package FA0322f1031;

//IMPORT JAVA
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;

/*
 FINAL ASSESSSMENT sESI 1 2023/2024
 NAME: MUHAMAD ANAZ BIN MOHD SHAHRIN
 REG NUMBER : 03DDT22F1031
 CLASS: DDT3B
 */
public abstract class StudentXYZ {

    //variable
    String student_name, student_matricNo;
    double total;
    int age;

    //constructor
    public StudentXYZ(String student_name, String student_matricNo, int age) {
        this.student_name = student_name;
        this.student_matricNo = student_matricNo;
        this.age = age;
    }

    //METHOD  calculateTotalFee();
    abstract void calculateTotalFee();

    //METHOD  displayInfo()
    void displayInfo() {

    }

}//end of class

class NewStudent extends StudentXYZ {

    //variable
    double tuituionFee = 200.00, accommodationFee = 120, equipmentFee = 150.00, miscellaneousFee = 80.00;

    //constructor
    public NewStudent(String student_name, String student_matricNo, int age) {
        super(student_name, student_matricNo, age);

    }
    //METHOD  calculateTotalFee();

    @Override
    void calculateTotalFee() {

        total = tuituionFee + accommodationFee + equipmentFee + miscellaneousFee;

    }
    //METHOD  displayInfo()

    @Override
    void displayInfo() {
        System.out.println("\n-------NEW STUDENT INFO-------");
        System.out.println("Name     : " + student_name);
        System.out.println("Matric No: " + student_matricNo);
        System.out.println("Age      : " + age);
        System.out.println("Total Fee: RM " + total);

    }

}//end of class

class SeniorStudent extends StudentXYZ {

    //variable
    double tuituionFee = 200.00, accommodationFee = 120;

    public SeniorStudent(String student_name, String student_matricNo, int age) {
        super(student_name, student_matricNo, age);

    }

    //METHOD  calculateTotalFee();

    @Override
    void calculateTotalFee() {

        total = tuituionFee + accommodationFee;

    }

    //METHOD  displayInfo()
    @Override
    void displayInfo() {
        System.out.println("\n-------SENIOR STUDENT INFO-------");
        System.out.println("Name     : " + student_name);
        System.out.println("Matric No: " + student_matricNo);
        System.out.println("Age      : " + age);
        System.out.println("Total Fee: RM " + total);
        System.out.println("=================================================================================================");

    }

}//end of class

class main {

    public static void main(String[] args) throws IOException {

        //create buffer object
        BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));

        //variable
        String student_name, student_matricNo;
        int age;

        int category;
        boolean valid;
        int again;

        //create object
        StudentXYZ student = null;

        try {//TRY CATCH EXCEPTIONAL HANDLING
            //LOOPING DO WHILE
            do {

                valid = true;
                //INSTRUCTION FOR USER
                System.out.println("======================================= COLLEGE XYZ=======================================");
                System.out.println("**********************************");
                System.out.println("CHOOSE STUDENT CATEGORY:");
                System.out.println("ENTER 1 FOR NEW STUDENT");
                System.out.println("ENTER 2 FOR SENIOR STUDENT");
                System.out.println("**********************************");
                System.out.print("PLEASE ENTER YOUR CATEGORY : ");
                //TRY CATCH EXCEPTIONAL HANDLING
                try {
                    category = Integer.parseInt(stdin.readLine());
                } catch (NumberFormatException IME) {
                    System.err.println("YOU HAVE ENTERED THE INPUT THAT HAS WRONG DATATYPE");
                    System.err.println("!!! THE PROGRAM WAS TERMINATED !!!");
                    System.exit(0);
                    continue;
                }

                //SWITCH CASE
                switch (category) {
                    case 1:
                        //INSTRUCTION USER FOR NEW STUDENT
                        System.out.println("YOU HAVE CHOOSEN : NEW STUDENT");
                        System.out.println("\nThis constructor of a New Student. Object has been created");
                        System.out.print("ENTER YOUR NAME          : ");
                        student_name = stdin.readLine();

                        System.out.print("ENTER YOUR MATRIC NUMBER : ");
                        student_matricNo = stdin.readLine();
                        //TRY CATCH EXCEPTIONAL HANDLING
                        try {
                            System.out.print("ENTER YOUR AGE           : ");
                            age = Integer.parseInt(stdin.readLine());
                        } catch (NumberFormatException IME) {
                            System.err.println("YOU HAVE ENTERED THE INPUT THAT HAS WRONG DATATYPE");
                            valid = false;
                            continue;

                        }
                        student = new NewStudent(student_name, student_matricNo, age);
                        student.calculateTotalFee();//DISPLAY calculateTotalFee()
                        student.displayInfo();//DISPLAY displayInfo()

                        break;

                    case 2:
                        //INSTRUCTION USER FOR SEMIOR STUDENT
                        System.out.println("YOU HAVE CHOOSEN : SENIOR STUDENT");
                        System.out.println("\nThis constructor of a Senior Student. Object has been created");
                        System.out.print("ENTER YOUR NAME: ");
                        student_name = stdin.readLine();

                        System.out.print("ENTER YOUR MATRIC NUMBER : ");
                        student_matricNo = stdin.readLine();

                        System.out.print("ENTER YOUR AGE       : ");
                        try {
                            age = Integer.parseInt(stdin.readLine());
                        } catch (NumberFormatException IME) {
                            System.err.println("YOU HAVE ENTERED THE INPUT THAT HAS WRONG DATATYPE");
                            valid = false;
                            continue;
                        }
                        student = new SeniorStudent(student_name, student_matricNo, age);
                        student.calculateTotalFee();//DISPLAY calculateTotalFee()
                        student.displayInfo();//DISPLAY displayInfo()

                        break;
                    default:
                        //GO LOOPING UNTIL TRUE
                        valid = false;
                        break;
                }
                //USER CAN CONTINUE
                System.out.println("=================================================================================================");
                System.out.print("CONTINUE THE PROGRAM? ( ENTER: 1 FOR YES, 0 FOR NO) : ");
                again = Integer.parseInt(stdin.readLine());
                if (again == 1) {
                    valid = false;
                } else {
                    again = 2;
                    System.exit(0);
                }//END OF IF ELSE
                
            } while (!valid);//END OD SWITCH CASE
        } catch (InputMismatchException | NumberFormatException IFE) {
            System.err.println("YOU HAVE ENTERED THE INPUT THAT HAS WRONG DATATYPE");
            System.err.println("!!! THE PROGRAM WAS TERMINATED !!!");
        }
    }//END OF MAIN METHOD
}//ENR OF CLASS MAIN
