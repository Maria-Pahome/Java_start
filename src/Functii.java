public class Functii {
    //o functie simpla care ne printeaza ceva simplu pe ecarn
    //nu ne da niciun raspuns (nu are return)
    //nu are parametri
    public static void printGreeting() {
        System.out.println("Buna ziua! Bine ati venit!");
    }

    //o functie care saluta clientul in f de numele lui
    //nu ne da niciun raspuns (nu are return)
    //are nevoie de parametri
    public static void printGreetingByName(String nume, String prenume) {
        System.out.println("Buna ziua " + nume + " " + prenume);
    }

    //o functie care calculeaza suma a 3 nr
    //ne da un raspuns suma nr - va avea return
    //ce tip de date va avea raspunsul?  3 + 6 / 2  = 4.5 (double)
    // are nevoie de parametri
    public static double mediaNr(double a, double b, double c){
        double media = (a + b + c) / 3;
        return media;
    }

    //o care sa ne dea valoarea lui PI
    //ne da un raspuns? da
    //rasp de tip double
    // are nevoie de parametri? nu

    public static double piValue(){
        //constanta - variabila care nu poate fi suprascrisa
        final double PI = 3.14;
        return PI;
    }

    public static void main(String[] args) {
        //intra clientul 1
        printGreeting(); // se apeleaza functia

        //intra clientul 2
        printGreeting(); //CTRL + CLICK, ne duce la corpul ei

        //apelam o functie cu param, oferim argumente
        printGreetingByName("Maria","Pahome");
        printGreetingByName("George","Visinescu");
        printGreetingByName("Roberta","Margescu");

        System.out.println(mediaNr(3,3,56));
        double media1 = mediaNr(345455,7374774,7474747);
        double media2 = mediaNr(45742,7374774,87);
        double media3 = mediaNr(45,4,87);
        System.out.println(media1);
        System.out.println(media2);
        System.out.println(media3);

        System.out.println(piValue());
        System.out.println(piValue());
    }
}
