public class While {
    public static void main(String[] args) {
        //wile - loop, ciclu repetitiv
        //zona de cod

        //problema: masina merge atat timp cat are benzina
        int litri_benzina = 10;
        while(litri_benzina > 0){
            //acceleram
            System.out.println("Vrum vrum!");
            //acceleram benzina
            litri_benzina = litri_benzina - 1;
            //aprindem beculetul cand avem <=3 litri
            if (litri_benzina <= 3 ){
                System.out.println("Se aprinde becul rosu!");
            }
        }
        System.out.println("STOP! Nu mai avem benzina");
    }
}
