/*
 MUHAMAD ANAZ BIN MOHD SHAHRIN
 040514100911
 THIS PROGRAM ABOUT TO CALCULATE ENTRANCE FEE AND TOTAL
 */
package FantasiaAquaPark;

public class Citizen {

    //variable
    double total;
    int quantity;
    static double totalEntranceFee = 0; // This variable will hold the total entrance fee for all citizens

    //constructor
    public Citizen(int quantity) {
        this.quantity = quantity;
    }

    //  total entrance fee for all citizens
    double calculateEnteranceFee() {
        
        totalEntranceFee += quantity;
        return total;
    }

}//end of super class Citizen

class Adult extends Citizen {

    double adult = 23.00;

    // Constructor
    public Adult(int quantity) {
        super(quantity);
    }

    @Override
    double calculateEnteranceFee() {// Calculates the entrance fee for an ADULT

        total = quantity * adult;

        return super.calculateEnteranceFee();
    }

}//end of sub class adult

class Child extends Citizen {

    double child = 18.00;

    // Constructor
    public Child(int quantity) {
        super(quantity);
    }

    @Override
    double calculateEnteranceFee() {// Calculates the entrance fee for an CHILD

        total = quantity * child;

        return super.calculateEnteranceFee();
    }

}//end of sub class child

class Senior extends Citizen {

    double senior = 14.00;

    // Constructor
    public Senior(int quantity) {
        super(quantity);
    }

    @Override
    double calculateEnteranceFee() {// Calculates the entrance fee for an SENIOR

        total = quantity * senior;

        return super.calculateEnteranceFee();
    }

}//end of sub class senior
