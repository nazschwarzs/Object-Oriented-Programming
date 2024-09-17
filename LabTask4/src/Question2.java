/*
 MUHAMAD ANAZ BIN MOHD SHAHRIN
 03DDT22F1031
 THIS PROGRAM ABOUT calculate zakat 
 */
import java.util.Scanner; // import scanner for get user input
import java.text.DecimalFormat; //import decimalFormat for zakat price
import java.util.InputMismatchException; // import InputMismatchException for invalid input

abstract class Zakat { // abstarct class Zakat

    Scanner stdin = new Scanner(System.in);// to make user enter input
    DecimalFormat df = new DecimalFormat("#.00");// set two deciaml for zakat price

    //declare variable
    int uruf = 85;
    int berat;
    double harga;
    double a = 2.3 / 100;
    double zakat;

    abstract void hargasemasa();//declare abstarct method hargasemasa()

    abstract void kiraan();//declare abstarct method kiraan()
}

class Perhiasan extends Zakat {//subcalss Perhiasan

    @Override
    void hargasemasa() {//overide method hargasemasa()
        //show output
        System.out.print("Masukkan harga semasa emas : RM ");
        harga = stdin.nextDouble();
        System.out.println("******************************************************************");

    }//end og hargasemasa()

    @Override
    void kiraan() {//overide method kiraan()
        System.out.print("Masukkan jumlah berat emas perhiasan anda(gram): ");//show output
        berat = stdin.nextInt();//get user input

        if (berat <= 85)//if else statement
        {
            System.out.println("Emas perhiasan anda tidak dikenakan zakat");
        } else if (berat >= 85) {
            System.out.println("Zakat yang perlu dikeluarkan bernilai : RM "
                    + df.format((berat - uruf) * harga * a));
        } else {
            System.out.println("Tidak dapat diproses");

        }//end of else

    }//end of kiraan()

}//end of class Perhiasan

class Simpanan extends Zakat {//subcalss Simpanan

    @Override
    void hargasemasa() {//overide method hargasemasa()
        System.out.print("Masukkan harga semasa emas : RM");
        berat = stdin.nextInt();//get user input
    }//end og hargasemasa()

    @Override
    void kiraan() {//overide method kiraan()
        System.out.print("Masukkan jumlah berat emas simpanan anda(gram): ");//show output
        berat = stdin.nextInt();//get user input

        if (berat <= 85)//if else statement
        {
            System.out.println("Emas perhiasan anda tidak dikenakan zakat");
        } else if (berat >= 85) {
            System.out.println("Zakat yang perlu dikeluarkan bernilai : RM "
                    + df.format((berat - uruf) * harga * a));
        } else {
            System.out.println("Tidak dapat diproses");

        }//end of else

    }//end of kiraan()

}//end of class Simpanan

public class Question2 {

    public static void main(String[] args) {
        int repeat = 1;
        Scanner sc = new Scanner(System.in);
        Perhiasan p = new Perhiasan();
        Simpanan s = new Simpanan();

        System.out.println("========================SELAMAT DATANG==========================");
        System.out.println("===================SISTEM PENGIRAAN ZAKAT EMAS==================");
        System.out.println("\n\n");
        try {
            while (repeat == 1) {//looping statement

                //show output
                System.out.println("Sila pilih jenis zakat emas yang hendak dikira ");
                System.out.println("1. Zakat Perhiasan  | 2. Zakat Simpanan");
                System.out.print("Pilihan : ");

                int pilihan = sc.nextInt();// user input for pilihan

                switch (pilihan) {
                    case 1:
                        System.out.println("1. Zakat Emas Perhiasan ");
                        p.hargasemasa();//call method hargasemasa()from Perhiasan
                        p.kiraan();// call method kiraan() from Perhiasan
                        break;
                    case 2:
                        System.out.println("1. Zakat Emas Simpanan ");
                        p.hargasemasa();//call method hargasemasa()from Simpanan
                        p.kiraan();// call method kiraan()from simpanan
                        break;
                    default:
                        System.out.println("Hnaya pilihan 1 atau 2 sahaja ");
                }//end of switch

                System.out.println(" Anda mempunyai kiraan lain ?");
                System.out.print("1. Ya(untuk teruskan) / 2. Tidak (untuk tamatkan) :");
                repeat = sc.nextInt();
                System.out.println("");
                System.out.println("================================================================");
                System.out.println("\n\n");
            }//end off while statement

            if (repeat == 2) {
                System.out.println(" -TERIMA KASIH- ");
            } else {
                System.err.println("Tiada pilihan untuk " + (repeat));

            }//end of else
            
        }//end of try
        
        catch (InputMismatchException IME) {
            System.out.println("Input yang tidak sah");
            System.out.println(IME);

        }//end of catch
        
    }//end off main method
}//end of calss Lbatsak 4
