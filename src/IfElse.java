import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        //if else
//        System.out.println("pornim radio");
//        boolean piesa_faina = false;//invat calculatorul daca piesa e faina sau nu
//        //daca piesa e frumoasa, dau mai tare
//        if (piesa_faina == true) {
//            System.out.println("dau mai tare radioul");
//            System.out.println("si incep sa o fredonez");
//        }
//        System.out.println("oprim radio");

        //if else
//        int nr = 4;
//        if (nr % 2 == 0) {
//            System.out.println("par");
//        } else {
//            System.out.println("impar");
//        }

        //if, else if, else
        //luam date de la tastatura
        Scanner sc = new Scanner(System.in);
        System.out.println("Introdu ora: ");
        int ora = sc.nextInt();
        if (ora < 0) {
            System.out.println("ora invalida");
        } else if (ora <= 11) {
            System.out.println("Buna dimineata!");
        } else if (ora <= 18) {
            System.out.println("Buna ziua!");
        } else if (ora <= 21) {
            System.out.println("Buna seara!");
        } else if (ora <= 24) {
            System.out.println("Nb!");
        } else {
            System.out.println("ora invalida");
        }


        //<0 vit invalida, 0 stationeaza, <= 50 localitate,
        // <=90 drum judetean, autostrada

        //flow control
        //switch - se foloseste cand se stiu mai multe valori posibile
        //TODO piesele muzicale de pe un CD
        System.out.println("alege optiunea");
        int optiunea = sc.nextInt();
        switch (optiunea) {
            case 0:
                System.out.println("meniu anterior");
                break;
            case 1:
                System.out.println("ro");
                break;
            case 2:
                System.out.println("en");
                break;
            default:
                System.out.println("optiune invalida");
        }
    }//inchide functia main
}//inchidem clasa
