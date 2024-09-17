/*
 MUHAMAD ANAZ BIN MOHD SHAHRIN
 040514100911
 THIS PROGRAM ABOUT TO CALCULATE ENTRANCE FEE AND TOTAL
 */
package FantasiaAquaPark;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CitizenMain {

    public static void main(String[] args) throws IOException {

        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));//USER INPUT DATA FROM KEYBOARD

        //variable for information 
        String name, icNumber, noPhone;
        int qAdult = 0, qChild = 0, qSenior = 0;
        double tAdult = 0, tChild = 0, tSenior = 0;
        char category;
        boolean validInput;

        //Instruction to user
        System.out.println("**************************************");
        System.out.println("\tENTER YOUR INFORMATION\t");
        System.out.println("**************************************");
        System.out.print("PLEASE ENTER YOUR NAME         : ");
        name = input.readLine();

        System.out.print("PLEASE ENTER YOUR IC NUMBER    : ");
        icNumber = input.readLine();

        System.out.print("PLEASE ENTER YOUR PHONE NUMBER : ");
        noPhone = input.readLine();

        //DISPLAY to user
        System.out.println("\n***********************************************");
        System.out.println("\tWELCOME TO FANTASIA AQUAPARK\t");
        System.out.println("***********************************************");
        System.out.println("CATEGORY                       PRICE(RM)");
        System.out.println("[A] ADULT                    : RM 23.00 ");
        System.out.println("[B] CHILD                    : RM 18.00 ");
        System.out.println("[C] SENIOR CITIZEN           : RM 14.00 ");
        System.out.println("[D] PAYMENT");

        Citizen ct = null;//INITAILIZE OBJECT

        //USER CAN DO LOOP FOR CATEGORY
        do {
            validInput = true;

            System.out.println("\n***********************************************");
            System.out.print("PLEASE ENTER YOUR CATEGORY                 : ");
            category = input.readLine().charAt(0); // CHAR TO STRING

            //USER SELECT CATEGORY
            switch (category) {
                case 'A':

                    System.out.print("PLEASE ENTER YOUR QUANTITY[ADULT]          : ");
                    qAdult = Integer.parseInt(input.readLine());// INT TO STRING

                    ct = new Adult(qAdult); //CREATE OBJECT
                    tAdult += ct.calculateEnteranceFee();

                    break;

                case 'B':

                    System.out.print("PLEASE ENTER YOUR QUANTITY[CHILD]          : ");
                    qChild = Integer.parseInt(input.readLine());// INT TO STRING

                    ct = new Child(qChild); //CREATE OBJECT
                    tChild += ct.calculateEnteranceFee();
                    break;

                case 'C':

                    System.out.print("PLEASE ENTER YOUR QUANTITY[SENIOR CITIZEN] : ");
                    qSenior = Integer.parseInt(input.readLine());// INT TO STRING

                    ct = new Senior(qSenior); //CREATE OBJECT
                    tSenior += ct.calculateEnteranceFee();

                    break;

                case 'D':
                    if (ct != null) {

                        System.out.println("***********************************************");
                        ct.calculateEnteranceFee();

                    } else {

                        //PRESS D BUTTON ONLY *NO CATEGORY AND QUANTITY
                        System.out.println("***********************************************");
                        System.out.println("PLEASE ENTER A CATEGORY AND QUANTITY FIRST");

                        validInput = false;
                    }
                    break;
                default:

                    //WRONG INPUT DATA
                    System.out.println("\n[!]THE INPUT IS NOT VALID, PLEASE ENTER AGAIN...");

                    validInput = false;

            }//end of switch case

        } while (!validInput || category != 'D');//end of do while statement

        //DISPLAY INFO
        System.out.println("\n-----------------------------------------------");
        System.out.println("\tRECEIPT FANTASIA AQUAPARK\t");
        System.out.println("-----------------------------------------------");
        System.out.println("Customer Name         : " + name);
        System.out.println("Customer IC Number    : " + icNumber);
        System.out.println("Customer Phone Number : " + noPhone);
        System.out.println("-----------------------------------------------");
        System.out.println("CATEGORY\t QUANTITY\tSUBTOTAL ");
        System.out.println("ADULT\t\t " + qAdult + "\t\tRM " + tAdult);
        System.out.println("CHILD\t\t " + qChild + "\t\tRM " + tChild);
        System.out.println("SENIOR CITIZEN\t " + qSenior + "\t\tRM " + tSenior);
        System.out.println("-----------------------------------------------");
        System.out.println("TOTAL\t\t\t\tRM " + (tAdult + tChild + tSenior));
        System.out.println("-----------------------------------------------");

    }//end of main method 

}// end of class CitizenMain
