package oop;

public class ContBancarMain {
    public static void main(String[] args) {
        // desktop

        // initializam obiecte de tip bancar
        // sunt instante ale clasei ContBancar
        ContBancar cont1 = new ContBancar("Maria P", "R0001");
        ContBancar cont2 = new ContBancar("Crina P", "R0002");

        // apelam metoda descriere
//        cont1.descriere();
//        cont2.descriere();

        // activam conturile
        cont1.activareCont(7777);
        cont2.activareCont(3333);
        cont2.activareCont(5555);
        cont2.activareCont(7777);

        // alimentam contul
        cont1.alimentareCont(300.40);
        cont2.alimentareCont(700);
        cont2.alimentareCont(300);

        // negative testing, cheltuim mai mult decat avem
        cont1.plataCard(500); // nu, 300.5 => pass

        // pozitive cu suma exacta
        cont1.plataCard(300.4); // da, 0 => pass

        // pozitive de 2 ori
        cont2.plataCard(100);
        cont2.plataCard(200); // da, 700 => pass

        cont1.interogareSold();
        cont2.interogareSold();
    }
}
